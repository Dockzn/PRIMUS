package models.repository;

import models.entity.Coordenador;
import models.entity.ProjetoExtensao;
import models.entity.ProjetoEstado;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjetoExtensaoDAO {
    private Connection connection;

    /**
     * Construtor da classe ProjetoExtensaoDAO.
     * Inicializa a conexão com o banco de dados.
     */
    public ProjetoExtensaoDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adiciona um novo projeto de extensão ao banco de dados.
     * @param projeto O projeto de extensão a ser adicionado.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public void adicionarProjeto(ProjetoExtensao projeto) throws SQLException {
        String sql = "INSERT INTO projetos_extensao (coordenador, dataVigencia, titulo, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, projeto.getCoordernador().getSiape());
            statement.setDate(2, new java.sql.Date(projeto.getDataVigencia().getTime()));
            statement.setString(3, projeto.getTitulo());
            statement.setString(4, projeto.getEstado().name());
            statement.executeUpdate();
        }
    }

    /**
     * Lista todos os projetos de extensão cadastrados no banco de dados.
     * @return Uma lista de todos os projetos de extensão.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public List<ProjetoExtensao> listarProjetos() throws SQLException {
        List<ProjetoExtensao> projetos = new ArrayList<>();
        String sql = "SELECT * FROM projetos_extensao";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String coordenadorSiape = resultSet.getString("coordenador");
                Date dataVigencia = resultSet.getDate("dataVigencia");
                String titulo = resultSet.getString("titulo");
                ProjetoEstado estado = ProjetoEstado.valueOf(resultSet.getString("estado"));
                CoordenadorDAO coordenadorDAO = new CoordenadorDAO();
                Coordenador coordenador = coordenadorDAO.buscarCoordenadorPorSiape(coordenadorSiape);
                ProjetoExtensao projeto = new ProjetoExtensao(coordenador, dataVigencia, titulo, estado);
                projetos.add(projeto);
            }
        }
        return projetos;
    }

    /**
     * Edita os dados de um projeto de extensão no banco de dados.
     * @param projeto O projeto de extensão cujos dados serão editados.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     * Ainda vai ser implementado.
     */
    public void editarProjeto(ProjetoExtensao projeto) throws SQLException {
        /* Ainda vai ser implementado */
    }

    /**
     * Remove um projeto de extensão do banco de dados.
     * @param projeto O projeto de extensão a ser removido.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     * Ainda vai ser implementado.
     */
    public void removerProjeto(ProjetoExtensao projeto) throws SQLException {
        /* Ainda vai ser implementado */
    }
}
