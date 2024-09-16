package br.com.primus.primus.models.repository;
import java.util.HashMap;
import java.util.Map;
import br.com.primus.primus.models.entity.Relatorio;

public class RelatorioDAO {

    // Um HashMap para armazenar relatórios. A chave é o ID do relatório.
    private Map<Integer, Relatorio> relatorios = new HashMap<>();
    private int nextId = 1; // Para gerar IDs únicos para os relatórios

    /**
     * Envia um relatório para ser adicionado ao armazenamento.
     * 
     * @param relatorio O relatório a ser enviado.
     */
    public void enviarRelatorio(Relatorio relatorio) {
        if (relatorio != null) {
            relatorio.setId(nextId++);
            relatorios.put(relatorio.getId(), relatorio);
            System.out.println("Relatório enviado: " + relatorio);
        } else {
            System.out.println("Relatório é nulo e não pode ser enviado.");
        }
    }

    /**
     * Atualiza um relatório existente no armazenamento.
     * 
     * @param relatorio O relatório com as atualizações.
     */
    public void atualizarRelatorio(Relatorio relatorio) {
        if (relatorio != null) {
            if (relatorios.containsKey(relatorio.getId())) {
                relatorios.put(relatorio.getId(), relatorio);
                System.out.println("Relatório atualizado: " + relatorio);
            } else {
                System.out.println("Relatório não encontrado para atualização: " + relatorio);
            }
        } else {
            System.out.println("Relatório é nulo e não pode ser atualizado.");
        }
    }

    /**
     * Cancela um relatório removendo-o do armazenamento.
     * 
     * @param relatorio O relatório a ser cancelado.
     */
    public void cancelarRelatorio(Relatorio relatorio) {
        if (relatorio != null) {
            if (relatorios.containsKey(relatorio.getId())) {
                relatorios.remove(relatorio.getId());
                System.out.println("Relatório cancelado: " + relatorio);
            } else {
                System.out.println("Relatório não encontrado para cancelamento: " + relatorio);
            }
        } else {
            System.out.println("Relatório é nulo e não pode ser cancelado.");
        }
    }

    /**
     * Lê um relatório pelo ID.
     * 
     * @param id O ID do relatório a ser lido.
     * @return O relatório correspondente ao ID fornecido.
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
