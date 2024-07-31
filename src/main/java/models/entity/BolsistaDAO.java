package models.repository;

import models.entity.Atividade;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BolsistaDAO {
    private Connection connection;

    public BolsistaDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarBolsista(Bolsista bolsista) throws SQLException {
        String sql = "INSERT INTO bolsistas (nome, email, cargo, matricula, curso, relatorioBIA) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, bolsista.getNome());
            statement.setString(2, bolsista.getEmail());
            statement.setString(3, bolsista.getCargo());
            statement.setString(4, bolsista.getMatricula());
            statement.setString(5, bolsista.getCurso());
            statement.setString(6, bolsista.getRelatorioBIA());
            statement.executeUpdate();
        }
    }

    public List<Bolsista> listarBolsistas() throws SQLException {
        List<Bolsista> bolsistas = new ArrayList<>();
        String sql = "SELECT * FROM bolsistas";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                String cargo = resultSet.getString("cargo");
                String matricula = resultSet.getString("matricula");
                String curso = resultSet.getString("curso");
                String relatorioBIA = resultSet.getString("relatorioBIA");
                Bolsista bolsista = new Bolsista(nome, email, cargo, matricula, curso, new ArrayList<Atividade>(), relatorioBIA);
                bolsistas.add(bolsista);
            }
        }
        return bolsistas;
    }
}
