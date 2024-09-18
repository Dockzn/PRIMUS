package br.com.primus.primus.models.repository;

import java.util.HashMap;
import java.util.Map;

import br.com.primus.primus.models.entity.Atividade;

public class AtividadeDAO {

    // Mapa para armazenar atividades com ID como chave
    private Map<Integer, Atividade> atividades;

    public AtividadeDAO() {
        atividades = new HashMap<>();
    }

    // Método para adicionar uma atividade ao mapa
    public boolean adicionarAtividade(Atividade atividade) {
        boolean isAdded = true;

        if (atividade != null && !atividades.containsKey(atividade.getId())) {
            atividades.put(atividade.getId(), atividade); // Adiciona ao map com o ID como chave
        } else {
            isAdded = false;
        }

        return isAdded;
    }

    // Método para obter a atividade pelo ID
    public Atividade getAtividadeById(int id) {
        return atividades.get(id);
    }

    // Método para listar todas as atividades
    public Map<Integer, Atividade> listarAtividades() {
        return atividades;
    }

    // Método para deletar uma atividade pelo ID
    public boolean deletarAtividade(int id) {
        if (atividades.containsKey(id)) {
            atividades.remove(id); // Remove a atividade do mapa
            return true; // Deleção bem-sucedida
        }
        return false; // Atividade não encontrada
    }
}
