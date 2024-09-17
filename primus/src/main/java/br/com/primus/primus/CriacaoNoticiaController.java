package br.com.primus.primus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CriacaoNoticiaController {

    @FXML
    private Button botaoCancelarNoticia;

    @FXML
    private Button botaoEnviarNoticia;

    @FXML
    private TextArea descricaoNoticia;

    @FXML
    private TextField tituloNoticia;

    @FXML
    void cancelarNoticia(ActionEvent event) {
        String titulo = tituloNoticia.getText().trim();
        String descricao = descricaoNoticia.getText().trim();

        if (titulo.isEmpty() && descricao.isEmpty()) {
            navigateToMenuProjeto();
        } else {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Cancelar");
            alert.setHeaderText(null);
            alert.setContentText("Você tem certeza que deseja cancelar? Todas as alterações serão perdidas.");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    // Clear fields and navigate to menu-projeto.fxml
                    tituloNoticia.clear();
                    descricaoNoticia.clear();
                    navigateToMenuProjeto();
                }
            });
        }
    }

    @FXML
    void enviarNoticia(ActionEvent event) {
        String titulo = tituloNoticia.getText().trim();
        String descricao = descricaoNoticia.getText().trim();

        if (titulo.isEmpty() || descricao.isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Campos Faltando");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos.");
            alert.showAndWait();
            return;
        }

        if (titulo.length() < 3) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Título Inválido");
            alert.setHeaderText(null);
            alert.setContentText("O título deve ter pelo menos 3 caracteres.");
            alert.showAndWait();
            return;
        }

        if (descricao.length() < 10) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Descrição Inválida");
            alert.setHeaderText(null);
            alert.setContentText("A descrição deve ter pelo menos 10 caracteres.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Notícia Enviada");
        alert.setHeaderText(null);
        alert.setContentText("A notícia foi enviada com sucesso.");
        alert.showAndWait();

        tituloNoticia.clear();
        descricaoNoticia.clear();
    }

    private void navigateToMenuProjeto() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/primus/primus/menu-projeto.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) botaoCancelarNoticia.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
