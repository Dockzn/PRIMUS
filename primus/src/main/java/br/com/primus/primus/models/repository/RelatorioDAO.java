package br.com.primus.primus.models.repository;

import java.util.HashMap;
import java.util.Map;

import br.com.primus.primus.models.entity.Relatorio;

public class RelatorioDAO {

    // Um HashMap para armazenar relatórios. A chave é o ID do relatório.
    private Map<Integer, Relatorio> relatorios = new HashMap<>();
    private int nextId = 1; // Para gerar IDs únicos para os relatórios

    /**
     * Envia Relatório a ser enviado seja para o BIA ou para o PREX
     */
    public void enviarRelatorio(Relatorio relatorio) {
        relatorio.setId(nextId++);
        relatorios.put(relatorio.getId(), relatorio);
        System.out.println("Relatório enviado: " + relatorio);
    }

    /**
     * Atualiza Relatório a ser enviado seja para o BIA ou para o PREX
     */
    public void atualizarRelatorio(Relatorio relatorio) {
        if (relatorios.containsKey(relatorio.getId())) {
            relatorios.put(relatorio.getId(), relatorio);
            System.out.println("Relatório atualizado: " + relatorio);
        } else {
            System.out.println("Relatório não encontrado para atualização: " + relatorio);
        }
    }

    /**
     * Cancela Relatório a ser enviado seja para o BIA ou para o PREX
     */
    public void cancelarRelatorio(Relatorio relatorio) {
        if (relatorios.containsKey(relatorio.getId())) {
            relatorios.remove(relatorio.getId());
            System.out.println("Relatório cancelado: " + relatorio);
        } else {
            System.out.println("Relatório não encontrado para cancelamento: " + relatorio);
        }
    }

    /**
     * Lê Relatório a ser enviado seja para o BIA ou para o PREX
     */
    public Relatorio lerRelatorio(int id) {
        Relatorio relatorio = relatorios.get(id);
        if (relatorio != null) {
            System.out.println("Relatório lido: " + relatorio);
        } else {
            System.out.println("Relatório não encontrado com ID: " + id);
        }
        return relatorio;
    }
}
