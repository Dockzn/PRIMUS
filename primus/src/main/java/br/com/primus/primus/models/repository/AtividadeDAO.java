package br.com.primus.primus.models.repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.primus.primus.models.entity.Atividade;
import br.com.primus.primus.models.entity.AtividadeComplexidade;
import br.com.primus.primus.models.entity.AtividadeStatus;
import java.util.HashMap;
import java.util.Map;

import br.com.primus.primus.models.entity.Atividade;

public class AtividadeDAO {

    // Mapa para armazenar atividades, onde a chave é o ID da atividade e o valor é o objeto Atividade
    private static Map<Integer, Atividade> atividades = new HashMap<>();

    // Método para adicionar uma atividade ao mapa
    public boolean adicionarAtividade(Atividade atividade) {
        boolean isBoolean = true;
        if (atividade != null && !atividades.containsKey(atividade.getId())) {
            atividades.put(atividade.getId(), atividade); 
            return true;
        } 
        return false;
    }

    // Método para obter uma atividade pelo ID
    public Atividade getAtividadeById(int id) {
        return atividades.get(id);
    }

    // Método para listar todas as atividades
    public Map<Integer, Atividade> listarAtividades() {
        return atividades;
    }
}
