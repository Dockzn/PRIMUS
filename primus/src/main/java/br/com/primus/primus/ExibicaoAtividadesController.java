package br.com.primus.primus;

import java.io.IOException;
import java.util.Optional;

import br.com.primus.primus.models.entity.Atividade;
import br.com.primus.primus.models.repository.AtividadeDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ExibicaoAtividadesController {

    @FXML
    private TableView<Atividade> tabelaAtividades;

    @FXML
    private TableColumn<Atividade, Integer> idColumn;

    @FXML
    private TableColumn<Atividade, String> atividadeColumn;

    @FXML
    private TableColumn<Atividade, String> responsavelColumn;

    private AtividadeDAO atividadeDAO = new AtividadeDAO();

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        atividadeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        responsavelColumn.setCellValueFactory(new PropertyValueFactory<>("responsavel"));

        atualizarTabela();
    }

    public void atualizarTabela() {
        tabelaAtividades.getItems().clear();
        tabelaAtividades.getItems().addAll(atividadeDAO.listarAtividades().values());
    }

    @FXML
    void deletarAtividade() {
        Atividade selectedAtividade = tabelaAtividades.getSelectionModel().getSelectedItem();
        if (selectedAtividade != null) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmação de Deletar");
            alert.setHeaderText("Você realmente deseja deletar esta atividade?");
            alert.setContentText(selectedAtividade.getNome());

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                atividadeDAO.deletarAtividade(selectedAtividade.getId());
                atualizarTabela();
            }
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Nenhuma Atividade Selecionada");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, selecione uma atividade para deletar.");
            alert.showAndWait();
        }
    }

    @FXML
    void atualizarAtividade() {
        atualizarTabela();
    }

    @FXML
    void acessarAtividade() {
        Atividade selectedAtividade = tabelaAtividades.getSelectionModel().getSelectedItem();
        if (selectedAtividade != null) {
            // Implemente a lógica para acessar os detalhes da atividade
            // Por exemplo, você pode abrir uma nova janela com os detalhes
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Nenhuma Atividade Selecionada");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, selecione uma atividade para acessar.");
            alert.showAndWait();
        }
    }

    @FXML
    void criarAtividade() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CriarAtividadeView.fxml"));
            Parent root = loader.load();
    
            // Obter a referência da janela atual
            Stage currentStage = (Stage) tabelaAtividades.getScene().getWindow();
            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Criar Atividade");
            
            // Adiciona um evento de fechamento da nova janela
            stage.setOnCloseRequest(event -> {
                // Aqui você pode reabrir ou manter a janela atual aberta se preferir
                currentStage.show(); // Mostra a janela atual novamente, se necessário
            });
    
            stage.show();
            currentStage.hide(); // Esconde a janela atual
        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro ao Abrir a Tela");
            alert.setHeaderText(null);
            alert.setContentText("Não foi possível abrir a tela de criar atividade.");
            alert.showAndWait();
        }
    }
    
}
