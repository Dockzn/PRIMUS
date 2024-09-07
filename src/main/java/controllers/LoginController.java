package controllers;

import models.repository.LoginDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button botaoLogin;

    @FXML
    private TextField campoMatricula;

    @FXML
    private TextField campoSenha;

    @FXML
    void realizarLogin(ActionEvent event) {
        String matricula = campoMatricula.getText();
        String senha = campoSenha.getText();

        LoginDAO loginDAO = new LoginDAO();
        boolean loginValido = loginDAO.verificarCredenciais(matricula, senha);

        if (loginValido) {
            mostrarAlerta("Login realizado com sucesso!", Alert.AlertType.INFORMATION);
            // redirecionar para outra tela
        } else {
            mostrarAlerta("Matrícula ou senha inválidos!", Alert.AlertType.ERROR);
            // abrir a tela de cadastro
        }
    }

    private void mostrarAlerta(String mensagem, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }


    @FXML
private void abrirTelaCadastro(ActionEvent event) {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/path/to/cadastro.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        // Fechar a tela de login, se necessário
        // ((Stage) botaoLogin.getScene().getWindow()).close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
