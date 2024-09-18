package br.com.primus.primus.models.repository;

import java.util.HashMap;
import java.util.Map;

import br.com.primus.primus.models.entity.Atividade;

public class AtividadeDAO {
    // Mapa para armazenar atividades com ID como chave
    private Map<Integer, Atividade> atividades;
    private int proximoId; // Contador para o próximo ID

    public AtividadeDAO() {
        atividades = new HashMap<>();
        proximoId = 1; // Inicializa o contador de IDs
    }

    // Método para adicionar uma atividade ao mapa
    public boolean adicionarAtividade(Atividade atividade) {
        if (atividade != null) {
            atividade.setId(proximoId++); // Atribui um ID único e incrementa
            atividades.put(atividade.getId(), atividade);
            return true; // Atividade adicionada com sucesso
        }
        return false; // Atividade nula
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
