package br.com.primus.primus;

import java.io.IOException;
import java.util.Date;

import br.com.primus.primus.models.entity.Relatorio;
import br.com.primus.primus.models.entity.RelatorioTipo;
import br.com.primus.primus.models.repository.RelatorioDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CriacaodeRelatorioController {

    @FXML
    private Button botaoCancelarRelatorio;

    @FXML
    private RadioButton botaoOpcaoBia;

    @FXML
    private RadioButton botaoOpcaoPrex;

    @FXML
    private Button botaoSalvarRelatorio;

    @FXML
    private Button botaoVoltar;

    @FXML
    private ImageView iconeRelatorioSalvo;

    @FXML
    private Label labelRelatorioSalvo;

    @FXML
    private ImageView logoPrimus;

    @FXML
    private TextArea texteAreaEscreverRelatorio;

    @FXML
    private ToggleGroup tipoRelatorioGroup;

    private RelatorioTipo tipoSelecionado;

    private RelatorioDAO relatorioDAO = new RelatorioDAO();

    @FXML
    void cancelarRelatorio(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmar Cancelamento");
        alert.setHeaderText(null);
        alert.setContentText("Tem certeza de que deseja cancelar? Todos os dados não salvos serão perdidos.");

        ButtonType confirmButton = new ButtonType("Confirmar", ButtonData.OK_DONE);
        ButtonType cancelButton = new ButtonType("Cancelar", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(confirmButton, cancelButton);

        alert.showAndWait().ifPresent(response -> {
            if (response == confirmButton) {
                texteAreaEscreverRelatorio.clear();
                botaoOpcaoBia.setSelected(false);
                botaoOpcaoPrex.setSelected(false);
            }
        });
    }

    @FXML
    void escolhaBia(ActionEvent event) {
        tipoSelecionado = RelatorioTipo.BIA;
    }

    @FXML
    void escolhaPrex(ActionEvent event) {
        tipoSelecionado = RelatorioTipo.PREX;
    }

    @FXML
    void salvarRelatorio(ActionEvent event) {
        String observacoes = texteAreaEscreverRelatorio.getText();
        boolean erro = false;
        StringBuilder mensagemErro = new StringBuilder("Por favor, corrija os seguintes problemas:\n");

        if (tipoSelecionado == null) {
            mensagemErro.append("- Selecione um tipo de relatório (BIA ou PREX).\n");
            erro = true;
        }

        if (observacoes.isEmpty()) {
            mensagemErro.append("- Preencha o campo de observações.\n");
            erro = true;
        }

        if (erro) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Campos Faltando");
            alert.setHeaderText(null);
            alert.setContentText(mensagemErro.toString());
            alert.showAndWait();
            return;
        }

        Relatorio relatorio = new Relatorio();
        relatorio.setTipo(tipoSelecionado);
        relatorio.setObservacoes(observacoes);
        relatorio.setCampoAnexo(""); 
        relatorio.setDataLimite(new Date());

        relatorioDAO.enviarRelatorio(relatorio);

        iconeRelatorioSalvo.setVisible(true);
        labelRelatorioSalvo.setVisible(true);
    }

    @FXML
    void voltarMenuDoProjeto(ActionEvent event) {
        Stage stage = (Stage) botaoVoltar.getScene().getWindow();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/primus/primus/menu-projeto.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            Alert erroAlerta = new Alert(AlertType.ERROR);
            erroAlerta.setTitle("Erro ao Carregar Tela");
            erroAlerta.setHeaderText("Não foi possível carregar a nova tela.");
            erroAlerta.setContentText("Ocorreu um erro: " + e.getMessage());
            erroAlerta.showAndWait();
        }
    }
}
