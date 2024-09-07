package models.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/primus";
    private static final String  USER = "root";
    private static final String  PASSWORD = "sua senha";

    public boolean verificarCredenciais(String matricula, String senha) {
        String  query = "SELECT * FROM Users WHERE Matricula = ? AND Password = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, matricula);
            statement.setString(2, senha);

            ResultSet resultSet = statement.executeQuery();

            return resultSet.next(); 

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}