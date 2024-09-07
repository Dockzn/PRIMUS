// package models.repository;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.ArrayList;
// import java.util.List;

// import models.entity.Professor;

// public class ProfessorDAO {
//     private Connection connection;

//     /**
//      * Construtor da classe ProfessorDAO.
//      * Inicializa a conexão com o banco de dados.
//      */
//     public ProfessorDAO() {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
//         } catch (ClassNotFoundException | SQLException e) {
//             e.printStackTrace();
//         }
//     }

//     /**
//      * Adiciona um novo professor ao banco de dados.
//      * @param professor O professor a ser adicionado.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public void adicionarProfessor(Professor professor) throws SQLException {
//         String sql = "INSERT INTO professores (nome, email, siape) VALUES (?, ?, ?)";
//         try (PreparedStatement statement = connection.prepareStatement(sql)) {
//             statement.setString(1, professor.getNome());
//             statement.setString(2, professor.getEmail());
//             statement.setString(3, professor.getSiape());
//             statement.executeUpdate();
//         }
//     }

//     /**
//      * Lista todos os professores cadastrados no banco de dados.
//      * @return Uma lista de todos os professores.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public List<Professor> listarProfessores() throws SQLException {
//         List<Professor> professores = new ArrayList<>();
//         String sql = "SELECT * FROM professores";
//         try (Statement statement = connection.createStatement();
//              ResultSet resultSet = statement.executeQuery(sql)) {
//             while (resultSet.next()) {
//                 String nome = resultSet.getString("nome");
//                 String email = resultSet.getString("email");
//                 String siape = resultSet.getString("siape");
//                 Professor professor = new Professor(nome, email, siape);
//                 professores.add(professor);
//             }
//         }
//         return professores;
//     }

//     /**
//      * Lê os dados de um professor no sistema.
//      * @param professor O professor cujos dados serão lidos.
//      * A ser implementado.
//      */
//     public void lerProfessor(Professor professor) {
//         /* A ser implementado */
//     }

//     /**
//      * Edita os dados de um professor no sistema.
//      * @param professor O professor cujos dados serão editados.
//      * A ser implementado.
//      */
//     public void editarProfessor(Professor professor) {
//         /* A ser implementado */
//     }

//     /**
//      * Remove um professor do sistema.
//      * @param professor O professor a ser removido.
//      * A ser implementado.
//      */
//     public void removerProfessor(Professor professor) {
//         /* A ser implementado */
//     }
// }
