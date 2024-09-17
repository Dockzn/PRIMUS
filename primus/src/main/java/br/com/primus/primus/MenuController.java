package br.com.primus.primus;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Button botaoAtividades;

    @FXML
    private Button botaoGeral;

    @FXML
    private MenuButton botaoMais;

    @FXML
    private Button botaoNoticias;

    @FXML
    private ImageView iconeProjeto;

    @FXML
    private Label labelNomeProjeto;

    @FXML
    private TextArea textAreUltimasNoticias;

    @FXML
    private TextField textFieldAtividade1;

    @FXML
    private TextField textFieldAtividade2;

    @FXML
    private TextField textFieldAtividade3;

    @FXML
    void IrParaTelaCriarAtividade(ActionEvent event) {
        trocarTela("CriarAtividadeView.fxml");
    }

    @FXML
    void irParaTelaCriarRelatorio(ActionEvent event) {
        trocarTela("criacao-de-relatorio.fxml");
    }

    @FXML
    void irParaTelaDeAtividades(ActionEvent event) {
        trocarTela("CriarAtividadeView.fxml");
    }

    @FXML
    void irParaTelaDeNoticias(ActionEvent event) {
        trocarTela("CriacaoNoticia.fxml");
    }

    @FXML
    void irParaTelaDocumentacao(ActionEvent event) {
        trocarTela("CriacaoDocumento.fxml");
    }

    @FXML
    void irParaTelaMaisInfoProjeto(ActionEvent event) {
        trocarTela("/path/to/telaMaisInfoProjeto.fxml");
    }

    @FXML
    void irParaTelaPrincipalDoProjeto(ActionEvent event) {
        trocarTela("menu-projeto.fxml");
    }

    private void trocarTela(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();
            Stage stage = (Stage) botaoGeral.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
