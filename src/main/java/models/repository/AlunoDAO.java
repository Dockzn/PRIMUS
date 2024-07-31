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
}
