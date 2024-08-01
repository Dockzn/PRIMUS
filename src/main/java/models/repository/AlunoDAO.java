package models.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.entity.Aluno;

public class AlunoDAO {
    private Connection connection;

    public AlunoDAO() {
        // Configurar a conexão com o banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adiciona um novo aluno no banco de dados.
     * 
     * @param aluno Objeto Aluno contendo os dados a serem inseridos.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public void adicionarAluno(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO alunos (nome, email, cargo, matricula, curso) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getEmail());
            statement.setString(3, aluno.getCargo());
            statement.setString(4, aluno.getMatricula());
            statement.setString(5, aluno.getCurso());
            statement.executeUpdate();
        }
    }

    /**
     * Lista todos os alunos presentes no banco de dados.
     * 
     * @return Uma lista de objetos Aluno.
     * @throws SQLException Se ocorrer um erro ao acessar o banco de dados.
     */
    public List<Aluno> listarAlunos() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                String cargo = resultSet.getString("cargo");
                String matricula = resultSet.getString("matricula");
                String curso = resultSet.getString("curso");
                Aluno aluno = new Aluno(nome, email, cargo, matricula, curso);
                alunos.add(aluno);
            }
        }
        return alunos;
    }

    /**
     * Edita os dados de um aluno existente no banco de dados.
     * 
     * @param aluno Objeto Aluno contendo os dados atualizados.
     */
    public void editarAluno(Aluno aluno){
        /* Ainda vai ser implementado */
    }

    /**
     * Remove um aluno do banco de dados.
     * 
     * @param aluno Objeto Aluno a ser removido.
     */
    public void removerAluno(Aluno aluno){
        /* Ainda vai ser implementado */
    }

    /**
     * Vai buscar um aluno específico no banco
     * @param aluno
     */
    public void buscarAluno(Aluno aluno){
        /* Ainda vai ser implementado */
    }


}
