package models.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.entity.Membro;

public class MembroDAO {
    private Connection connection;

    public MembroDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarMembro(Membro membro) throws SQLException {
        String sql = "INSERT INTO membros (nome, email, cargo, matricula, curso) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, membro.getNome());
            statement.setString(2, membro.getEmail());
            statement.setString(3, membro.getCargo());
            statement.setString(4, membro.getMatricula());
            statement.setString(5, membro.getCurso());
            statement.executeUpdate();
        }
    }

    public List<Membro> listarMembros() throws SQLException {
        List<Membro> membros = new ArrayList<>();
        String sql = "SELECT * FROM membros";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                String cargo = resultSet.getString("cargo");
                String matricula = resultSet.getString("matricula");
                String curso = resultSet.getString("curso");
                Membro membro = new Membro(nome, email, cargo, matricula, curso, new ArrayList<>());
                membros.add(membro);
            }
        }
        return membros;
    }

    public Membro buscarMembroPorId(int id) throws SQLException {
        Membro membro = null;
        String sql = "SELECT * FROM membros WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    String cargo = resultSet.getString("cargo");
                    String matricula = resultSet.getString("matricula");
                    String curso = resultSet.getString("curso");
                    membro = new Membro(nome, email, cargo, matricula, curso, new ArrayList<>());
                }
            }
        }
        return membro;
    }

    public void atualizarMembro(Membro membro) throws SQLException {
        String sql = "UPDATE membros SET nome = ?, email = ?, cargo = ?, matricula = ?, curso = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, membro.getNome());
            statement.setString(2, membro.getEmail());
            statement.setString(3, membro.getCargo());
            statement.setString(4, membro.getMatricula());
            statement.setString(5, membro.getCurso());
            statement.executeUpdate();
        }
    }

    public void deletarMembro(int id) throws SQLException {
        String sql = "DELETE FROM membros WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
