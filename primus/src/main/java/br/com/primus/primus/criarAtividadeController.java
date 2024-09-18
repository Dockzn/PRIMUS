package br.com.primus.primus;

import java.io.IOException;
import java.time.LocalDate;

import br.com.primus.primus.models.entity.Atividade;
import br.com.primus.primus.models.entity.AtividadeComplexidade;
import br.com.primus.primus.models.entity.AtividadeStatus;
import br.com.primus.primus.models.repository.AtividadeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CriarAtividadeController {

    @FXML
    private TextField campoNome, campoResponsavel, local, originalEstimate, comentarios;

    @FXML
    private Button botaoVoltar;

    @FXML
    private MenuButton complexidade;

    private AtividadeDAO atividadeDAO = new AtividadeDAO();
    private AtividadeComplexidade selectedComplexidade = AtividadeComplexidade.FACIL; // Default value

    private void mostrarAlerta(String mensagem, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }

    @FXML
    public void initialize() {
        for (MenuItem item : complexidade.getItems()) {
            item.setOnAction(e -> {
                selectedComplexidade = AtividadeComplexidade.valueOf(item.getText().toUpperCase());
                complexidade.setText(item.getText()); // Update MenuButton text
            });
        }
    }

   @FXML
public void criarAtividade() {
    String nome = campoNome.getText().trim();
    String responsavel = campoResponsavel.getText().trim();
    String sala = local.getText().trim();
    String comentario = comentarios.getText().trim();
    String tags = "";

    // Validar entradas
    if (nome.isEmpty() || responsavel.isEmpty() || sala.isEmpty() || comentario.isEmpty()) {
        mostrarAlerta("Todos os campos devem ser preenchidos.", Alert.AlertType.WARNING);
        return;
    }

    int horas;
    try {
        horas = Integer.parseInt(originalEstimate.getText().trim());
        if (horas < 0) {
            mostrarAlerta("O valor de horas estimadas não pode ser menor que 0.", Alert.AlertType.WARNING);
            return;
        }
    } catch (NumberFormatException e) {
        mostrarAlerta("Por favor, insira um número válido para as horas estimadas.", Alert.AlertType.WARNING);
        return;
    }

    // Status padrão
    AtividadeStatus status = AtividadeStatus.FAZENDO;

    // Criando a nova atividade
    Atividade novaAtividade = new Atividade(
            nome, responsavel, comentario, tags, sala,
            LocalDate.now(), selectedComplexidade, horas, status
    );

    // Adicionando a atividade ao DAO
    if (atividadeDAO.adicionarAtividade(novaAtividade)) {
        mostrarAlerta("Atividade criada com sucesso!", Alert.AlertType.INFORMATION);
        atualizarExibicaoAtividades();
    } else {
        mostrarAlerta("Erro ao criar a atividade.", Alert.AlertType.ERROR);
    }
}

    private void atualizarExibicaoAtividades() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/primus/primus/ExibicaoAtividades.fxml"));
            Parent root = loader.load();
            ExibicaoAtividadesController controller = loader.getController();
            controller.atualizarTabela(); // Atualiza a tabela com a nova atividade

            // Obter a referência da janela atual
            Stage stage = (Stage) botaoVoltar.getScene().getWindow();
            stage.setScene(new Scene(root)); // Trocar a cena para a exibição de atividades
            stage.setTitle("Exibição de Atividades"); // Define o título da janela

        } catch (IOException e) {
            mostrarAlerta("Não foi possível carregar a tela de exibição de atividades.", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }

    @FXML
    void voltarGeral(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/primus/primus/menu-projeto.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) botaoVoltar.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            mostrarAlerta("Não foi possível carregar o menu do projeto.", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }
}
