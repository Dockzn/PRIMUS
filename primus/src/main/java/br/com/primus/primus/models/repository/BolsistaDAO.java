// package br.com.primus.primus.models.repository;

// import models.entity.Bolsista;

// import java.sql.*;
// import java.util.ArrayList;
// import java.util.List;

// public class BolsistaDAO {

//     private Connection connection;

//     /**
//      * Construtor da classe BolsistaDAO.
//      * Inicializa a conexão com o banco de dados.
//      */
//     public BolsistaDAO() {
//         // Configurar a conexão com o banco de dados
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
//         } catch (ClassNotFoundException | SQLException e) {
//             e.printStackTrace();
//         }
//     }

//     /**
//      * Adiciona um novo bolsista no banco de dados.
//      * @param bolsista Objeto Bolsista contendo os dados a serem inseridos.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public void adicionarBolsista(Bolsista bolsista) throws SQLException {
//         String sql = "INSERT INTO bolsistas (nome, email, cargo, matricula, curso, relatorioBIA) VALUES (?, ?, ?, ?, ?, ?)";
//         try (PreparedStatement statement = connection.prepareStatement(sql)) {
//             statement.setString(1, bolsista.getNome());
//             statement.setString(2, bolsista.getEmail());
//             statement.setString(3, bolsista.getCargo());
//             statement.setString(4, bolsista.getMatricula());
//             statement.setString(5, bolsista.getCurso());
//             statement.setString(6, bolsista.getRelatorioBIA());
//             statement.executeUpdate();
//         }
//     }

//     /**
//      * Lista todos os bolsistas presentes no banco de dados.
//      * @return Uma lista de objetos Bolsista.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public List<Bolsista> listarBolsistas() throws SQLException {
//         List<Bolsista> bolsistas = new ArrayList<>();
//         String sql = "SELECT * FROM bolsistas";
//         try (Statement statement = connection.createStatement();
//              ResultSet resultSet = statement.executeQuery(sql)) {
//             while (resultSet.next()) {
//                 String nome = resultSet.getString("nome");
//                 String email = resultSet.getString("email");
//                 String cargo = resultSet.getString("cargo");
//                 String matricula = resultSet.getString("matricula");
//                 String curso = resultSet.getString("curso");
//                 String relatorioBIA = resultSet.getString("relatorioBIA");
//                 Bolsista bolsista = new Bolsista(nome, email, cargo, matricula, curso, relatorioBIA);
//                 bolsistas.add(bolsista);
//             }
//         }
//         return bolsistas;
//     }

//     /**
//      * Edita os dados de um bolsista no banco de dados.
//      * @param bolsista O bolsista cujos dados serão editados.
//      * A ser implementado.
//      */
//     public void editarBolsista(Bolsista bolsista) {
//         /* A ser implementado */
//     }

//     /**
//      * Remove um bolsista do banco de dados.
//      * @param bolsista O bolsista a ser removido.
//      * A ser implementado.
//      */
//     public void removerBolsista(Bolsista bolsista) {
//         /* A ser implementado */
//     }
// }
