// package br.com.primus.primus.models.repository;

// import java.sql.Connection;
// import java.sql.Date;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

// import models.entity.Atividade;
// import models.entity.AtividadeComplexidade;
// import models.entity.AtividadeStatus;

// public class AtividadesDAO {
    
//     private Connection connection;

//     public AtividadesDAO() {
//         // Configurar a conexão com o banco de dados
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
//         } catch (ClassNotFoundException | SQLException e) {
//             e.printStackTrace();
//         }
//     }

//     /**
//      * Adiciona uma nova atividade no banco de dados.
//      * 
//      * @param atividade Objeto Atividade contendo os dados a serem inseridos.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public void adicionarAtividade(Atividade atividade) throws SQLException {
//         String sql = "INSERT INTO atividades (nome, responsavel, comentario, tags, sala, dataCriacao, complexidade, horas, horasCumpridas, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//         try (PreparedStatement statement = connection.prepareStatement(sql)) {
//             statement.setString(1, atividade.getNome());
//             statement.setString(2, atividade.getResponsavel());
//             statement.setString(3, atividade.getComentario());
//             statement.setString(4, atividade.getTags());
//             statement.setString(5, atividade.getSala());
//             statement.setDate(6, Date.valueOf(atividade.getDataCriacao()));
//             statement.setString(7, atividade.getComplexidade().name());
//             statement.setInt(8, atividade.getHoras());
//             statement.setInt(9, atividade.getHorasCumpridas());
//             statement.setString(10, atividade.getStatus().name());
//             statement.executeUpdate();
//         }
//     }

//     /**
//      * Lista todas as atividades presentes no banco de dados.
//      * 
//      * @return Uma lista de objetos Atividade.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public List<Atividade> listarAtividades() throws SQLException {
//         List<Atividade> atividades = new ArrayList<>();
//         String sql = "SELECT * FROM atividades";
//         try (Statement statement = connection.createStatement();
//              ResultSet resultSet = statement.executeQuery(sql)) {
//             while (resultSet.next()) {
//                 String nome = resultSet.getString("nome");
//                 String responsavel = resultSet.getString("responsavel");
//                 String comentario = resultSet.getString("comentario");
//                 String tags = resultSet.getString("tags");
//                 String sala = resultSet.getString("sala");
//                 LocalDate dataCriacao = resultSet.getDate("dataCriacao").toLocalDate();
//                 AtividadeComplexidade complexidade = AtividadeComplexidade.valueOf(resultSet.getString("complexidade"));
//                 int horas = resultSet.getInt("horas");
//                 int horasCumpridas = resultSet.getInt("horasCumpridas");
//                 AtividadeStatus status = AtividadeStatus.valueOf(resultSet.getString("status"));
//                 Atividade atividade = new Atividade(nome, responsavel, comentario, tags, sala, dataCriacao, complexidade, horas, status);
//                 atividade.setHorasCumpridas(horasCumpridas);
//                 atividades.add(atividade);
//             }
//         }
//         return atividades;
//     }

//     /**
//      * Exclui uma atividade do banco de dados.
//      * 
//      * @param atividade Objeto Atividade a ser excluído.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public void excluirAtividade(Atividade atividade) throws SQLException {
//         /* Ainda vai ser implementado */
//     }

//     /**
//      * Edita os dados de uma atividade existente no banco de dados.
//      * 
//      * @param atividade Objeto Atividade contendo os dados atualizados.
//      * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
//      */
//     public void editarAtividade(Atividade atividade) throws SQLException {
//         /* Ainda vai ser implementado */
//     }
// }
