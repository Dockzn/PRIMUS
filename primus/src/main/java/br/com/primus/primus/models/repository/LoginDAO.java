package br.com.primus.primus.models.repository;
import java.util.HashMap;
import java.util.Map;

public class LoginDAO {
    private static Map<String, String> credenciais = new HashMap<>();

    static {
        // Adicionando alguns usuários fictícios afins de teste
        credenciais.put("anderson", "primus");
        credenciais.put("arthur", "primus");
        credenciais.put("davi", "primus");
        credenciais.put("diego", "primus");
        credenciais.put("gustavo", "primus");

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