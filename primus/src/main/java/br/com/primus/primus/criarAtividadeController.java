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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class criarAtividadeController {
    @FXML
    private TextField campoNome, campoResponsavel, local, originalEstimate, comentarios;
    
    @FXML
    private Button botaoVoltar;

    @FXML
    private MenuButton complexidade;

    private AtividadeDAO atividadeDAO = new AtividadeDAO();


    private void mostrarAlerta(String mensagem, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
    

    @FXML
    public void criarAtividade() {
        boolean isBoolean = true;
        try {
            String nome = campoNome.getText();
            String responsavel = campoResponsavel.getText();
            String sala = local.getText();
            int horas = Integer.parseInt(originalEstimate.getText());
            String comentario = comentarios.getText();
            String tags = "";
            AtividadeComplexidade comp = AtividadeComplexidade.FACIL;
            /*for (MenuItem item : complexidade.getItems()) {
                if (item.()) {
                    comp = AtividadeComplexidade.valueOf(item.getText().toUpperCase());
                    break;
                }
            }*/


            if (horas < 0) {
                mostrarAlerta("O valor de horas estimadas não pode ser menor que 0.", Alert.AlertType.WARNING);
                return; // Interrompe a execução do método se a validação falhar
            }
            // Status padrão (ex: em andamento)
            AtividadeStatus status = AtividadeStatus.FAZENDO;

            // Criação da nova atividade
            Atividade novaAtividade = new Atividade(
                    atividadeDAO.listarAtividades().size() + 1, // ID gerado automaticamente
                    nome, responsavel, comentario, tags, sala,
                    LocalDate.now(), comp, horas, status
            );

            // Adicionando a atividade ao DAO
            atividadeDAO.adicionarAtividade(novaAtividade);

            mostrarAlerta("Atividade criada com sucesso!", Alert.AlertType.INFORMATION);
            System.out.println(novaAtividade.toString());
            
        } catch (Exception e) {
            mostrarAlerta("Houve um erro interno no sistema", Alert.AlertType.INFORMATION);
        }


       
    }

    private void trocarTela(String fxml) {
        
    }
@FXML
    void IrParaTelaCriarAtividade(ActionEvent event) {
        trocarTela("/path/to/criarAtividade.fxml");
    }


    @FXML
    void voltarGeral(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-projeto.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) botaoVoltar.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

}
