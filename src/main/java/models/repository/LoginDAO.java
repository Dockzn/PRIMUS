package models.repository;

import java.util.HashMap;
import java.util.Map;

public class LoginDAO {
    private static Map<String, String> credenciais = new HashMap<>();

    static {
        // Adicionando alguns usuários fictícios
        credenciais.put("arthur", "senha123");
        credenciais.put("davi", "senha456");
        credenciais.put("111213", "senha789");
    }

    public boolean verificarCredenciais(String matricula, String senha) {
        return credenciais.containsKey(matricula) && credenciais.get(matricula).equals(senha);
    }

    public boolean cadastrarUsuario(String matricula, String senha) {
        if (credenciais.containsKey(matricula)) {
            return false; // Matrícula já existe
        }
        credenciais.put(matricula, senha);
        return true;
    }
}
