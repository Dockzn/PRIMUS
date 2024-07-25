
package src.main.java.models.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import src.main.java.models.entity.Membro;
import src.main.java.routes.DataBaseConnection;

public class MembroDAO {

    public void adicionarMembro(Membro membro) throws SQLException {
        String sql = "INSERT INTO membros (nome, email) VALUES (?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, membro.getNome());
            stmt.setString(2, membro.getEmail());
            stmt.executeUpdate();
        }
    }

    public List<Membro> listarMembros() throws SQLException {
        List<Membro> membros = new ArrayList<>();
        String sql = "SELECT * FROM membros";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Membro membro = new Membro();
                membro.setId(rs.getInt("id"));
                membro.setNome(rs.getString("nome"));
                membro.setEmail(rs.getString("email"));
                membros.add(membro); 
            }
        }
        return membros;
    }
}
