package br.com.primus.primus;

import java.io.*;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SelecaoDeProjetoController{

    @FXML
    private Button botaoEntrar;

    @FXML
    private ImageView iconeProjeto1;

    @FXML
    private ImageView iconeProjeto2;

    @FXML
    private ImageView iconeProjeto3;

    @FXML
    private ImageView iconeProjeto4;

    @FXML
    private Label nomeDoProjeto1;

    @FXML
    private Label nomeDoProjeto2;

    @FXML
    private Label nomeDoProjeto3;

    @FXML
    private Label nomeDoProjeto4;

    @FXML
    void entrarNoProjeto(ActionEvent event) {
        trocarTela("menu-projeto.fxml");
    }

    private void trocarTela(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();
            Stage stage = (Stage) botaoEntrar.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
