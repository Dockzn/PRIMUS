package br.com.primus.primus;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import br.com.primus.primus.models.entity.Atividade;
import br.com.primus.primus.models.repository.AtividadeDAO;

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
        // Implement deletion logic
    }

    @FXML
    void atualizarAtividade() {
        atualizarTabela();
    }

    @FXML
    void acessarAtividade() {
        // Implement access logic
    }

    @FXML
    void criarAtividade() {
        // Implement creation logic or navigation
    }
}
