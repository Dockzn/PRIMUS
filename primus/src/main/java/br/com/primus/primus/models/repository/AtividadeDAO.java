package br.com.primus.primus.models.repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.primus.primus.models.entity.Atividade;
import br.com.primus.primus.models.entity.AtividadeComplexidade;
import br.com.primus.primus.models.entity.AtividadeStatus;
import java.util.HashMap;
import java.util.Map;


public class AtividadeDAO {

    // Map to store the activities, where key is the activity ID and value is the Atividade object
    private static Map<Integer, Atividade> atividades = new HashMap<>();


    

    // Method to add an activity
    public boolean adicionarAtividade(Atividade atividade) {
        boolean isBoolean = true;
        if (atividade != null && !atividades.containsKey(atividade.getId())) {
            atividades.put(atividade.getId(), atividade); 

        } 
        else {
            isBoolean = false;
        }

        return isBoolean;
    }

    // Method to retrieve an activity by its ID
    public Atividade getAtividade(int id) {
        return atividades.get(id);
    }

    // Method to list all activities
    public Map<Integer, Atividade> listarAtividades() {
        return atividades;
    }
}