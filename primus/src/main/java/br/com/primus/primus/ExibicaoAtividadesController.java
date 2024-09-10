package br.com.primus.primus;

import br.com.primus.primus.models.entity.Atividade;
import br.com.primus.primus.models.repository.AtividadeDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;

public class ExibicaoAtividadesController {

    @FXML
    private Button acessarAtividade;

    @FXML
    private Button atualizarAtividade;

    @FXML
    private Button criarAtiviade;

    @FXML
    private Button deletarAtividade;

    @FXML
    private TableColumn<Atividade, Integer> idColumn;  // Corrigido para Integer, já que o ID é numérico

    @FXML
    private TableColumn<Atividade, String> atividadeColumn;

    @FXML
    private TableColumn<Atividade, String> responsavelColumn;

    @FXML
    private TableView<Atividade> tabelaAtividades;

    private ObservableList<Atividade> atividades;
    private AtividadeDAO atividadeDAO;

    @FXML
    public void initialize() {
        // Inicializando o DAO de Atividades
        atividadeDAO = new AtividadeDAO();

        // Configurando as colunas para mostrar os dados corretos
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        atividadeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        responsavelColumn.setCellValueFactory(new PropertyValueFactory<>("responsavel"));

        // Inicializando a lista de atividades e carregando do DAO
        atividades = FXCollections.observableArrayList(atividadeDAO.listarAtividades().values());

        // Vinculando a lista de atividades à TableView
        tabelaAtividades.setItems(atividades);
    }

    
    @FXML
    void acessarAtividade(ActionEvent event) {
    // Criar o diálogo de entrada
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Acessar Atividade");
        dialog.setHeaderText("Digite o ID da atividade");
        dialog.setContentText("ID:");

        // Mostrar o diálogo e obter o resultado
        String id = dialog.showAndWait().orElse(null);
        int idInt = Integer.parseInt(id);

        if (id != null && idInt>=0 ) {
            // Tratar o ID inserido (por exemplo, buscar e mostrar a atividade)
            try {
                // Aqui você pode usar o idInt para buscar a atividade no DAO ou outro local
                // Por exemplo:
                Atividade atividade = atividadeDAO.getAtividadeById(idInt);
                if (atividade != null) {
                    System.out.println("Atividade selecionada: " + atividade.getNome());
                    // Aqui você pode implementar a lógica adicional para exibir a atividade
                } else {
                    // Mostrar alerta se a atividade não for encontrada
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Atividade não encontrada");
                    alert.setHeaderText(null);
                    alert.setContentText("Nenhuma atividade encontrada com o ID " + id);
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {
                // Mostrar alerta se o ID inserido não for um número válido
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("ID Inválido");
                alert.setHeaderText(null);
                alert.setContentText("O ID inserido não é um número válido.");
                alert.showAndWait();
            }
        }
    }


    @FXML
    void atualizarAtividade(ActionEvent event) {
        // Criar o diálogo de entrada
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Atualizar Atividade");
        dialog.setHeaderText("Digite o ID da atividade");
        dialog.setContentText("ID:");

        // Mostrar o diálogo e obter o resultado
        String id = dialog.showAndWait().orElse(null);
        int idInt = Integer.parseInt(id);
        if (id != null && idInt >= 0) {
            // Tratar o ID inserido (por exemplo, buscar e mostrar a atividade)
            try {
                // Aqui você pode usar o idInt para buscar a atividade no DAO ou outro local
                // Por exemplo:
                Atividade atividade = atividadeDAO.getAtividadeById(idInt);
                if (atividade != null) {
                    //apontar para a tela de Atualizar Atividade (Similar à tela de Criar Atividade)
                } else {
                    // Mostrar alerta se a atividade não for encontrada
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Atividade não encontrada");
                    alert.setHeaderText(null);
                    alert.setContentText("Nenhuma atividade encontrada com o ID " + id);
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {
                // Mostrar alerta se o ID inserido não for um número válido
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("ID Inválido");
                alert.setHeaderText(null);
                alert.setContentText("O ID inserido não é um número válido.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void criarAtividade(ActionEvent event) {
        //apontar para a tela de criar atividade
    }

    @FXML
    void deletarAtividade(ActionEvent event) {
        // Criar o diálogo de entrada
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Deletar Atividade");
        dialog.setHeaderText("Digite o ID da atividade");
        dialog.setContentText("ID:");

        // Mostrar o diálogo e obter o resultado
        String id = dialog.showAndWait().orElse(null);
        int idInt = Integer.parseInt(id);

        if (id != null && idInt>=0) {
            // Tratar o ID inserido (por exemplo, buscar e mostrar a atividade)
            try {
                
                // Aqui você pode usar o idInt para buscar a atividade no DAO ou outro local
                // Por exemplo:
                Atividade atividade = atividadeDAO.getAtividadeById(idInt);
                if (atividade != null) {
                    atividades.remove(atividade);  // Remove da tabela
                    atividadeDAO.listarAtividades().remove(atividade.getId());
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Deletar Atividade");
                    alert.setHeaderText(null);
                    alert.setContentText("Atividade deletada com êxito" + id);
                    alert.showAndWait();
                } else {
                    // Mostrar alerta se a atividade não for encontrada
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Atividade não encontrada");
                    alert.setHeaderText(null);
                    alert.setContentText("Nenhuma atividade encontrada com o ID " + id);
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {
                // Mostrar alerta se o ID inserido não for um número válido
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("ID Inválido");
                alert.setHeaderText(null);
                alert.setContentText("O ID inserido não é um número válido.");
                alert.showAndWait();
            }
        }
    }
}
