package br.com.primus.primus;

import java.io.IOException;

import br.com.primus.primus.models.repository.LoginDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button botaoLogin;

    @FXML
    private TextField campoMatricula;

    @FXML
    private TextField campoSenha;

    @FXML
    void initialize() {
        // Configura o evento de pressionar Enter para o campo de matrícula
        campoMatricula.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                campoSenha.requestFocus(); // Move o foco para o campo de senha
            }
        });

        // Configura o evento de pressionar Enter para o campo de senha
        campoSenha.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                realizarLogin(null); // Executa o login quando Enter é pressionado
            }
        });
    }

    @FXML
    void realizarLogin(ActionEvent event) {
        String matricula = campoMatricula.getText();
        String senha = campoSenha.getText();

        LoginDAO loginDAO = new LoginDAO();
        boolean loginValido = loginDAO.verificarCredenciais(matricula, senha);

        if (loginValido) {
            mostrarAlerta("Login realizado com sucesso!", AlertType.INFORMATION, "menu-projeto.fxml");
        } else {
            mostrarAlerta("Matrícula ou senha inválidos!", AlertType.ERROR, null);
        }
    }

    private void mostrarAlerta(String mensagem, AlertType tipo, String proximaTelaFXML) {
        Alert alerta = new Alert(tipo);
        alerta.setContentText(mensagem);

        alerta.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK && proximaTelaFXML != null) {
                mudarTela("menu-projeto.fxml");
            }
        });
    }

    private void mudarTela(String fxml) {
        try {
            Stage stage = (Stage) botaoLogin.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Scene novaCena = new Scene(loader.load());
            stage.setScene(novaCena);
        } catch (IOException e) {
            exibirErroCarregamentoTela(e);
        }
    }

    private void exibirErroCarregamentoTela(IOException e) {
        Alert erroAlerta = new Alert(AlertType.ERROR);
        erroAlerta.setTitle("Erro ao Carregar Tela");
        erroAlerta.setHeaderText("Não foi possível carregar a nova tela.");
        erroAlerta.setContentText("Ocorreu um erro: " + e.getMessage());
        erroAlerta.showAndWait();
    }
}
