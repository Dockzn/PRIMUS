package br.com.primus.primus;

import br.com.primus.primus.models.repository.LoginDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastroController {

    @FXML
    private Button botaoCadastrar;

    @FXML
    private TextField campoMatricula;

    @FXML
    private TextField campoSenha;

    @FXML
    void realizarCadastro(ActionEvent event) {

        String matricula = campoMatricula.getText();
        String senha = campoSenha.getText();

        LoginDAO loginDAO = new LoginDAO();
        loginDAO.cadastrarUsuario(matricula, senha);
        if (loginDAO.isExistent){
            mostrarAlerta("Cadastro realizado com sucesso!", Alert.AlertType.INFORMATION);
        }
        else{
            mostrarAlerta("Esse usuário já existe no sistema!", Alert.AlertType.INFORMATION);
        }

        
        
    }

    private void mostrarAlerta(String mensagem, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }

}
