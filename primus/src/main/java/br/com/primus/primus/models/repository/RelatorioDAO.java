// package br.com.primus.primus.models.repository;
// import java.util.HashMap;
// import java.util.Map;

// public class RelatorioDAO {
//     private static Map<String, String> relatorios = new HashMap<>();

//     /**
//      * Salva Relatório a ser enviado seja para o BIA ou para o PREX.
//      * Adiciona o relatório no HashMap.
//      */
//     public void salvarRelatorio(Relatorio relatorio) {
//         // Simula salvar o relatório usando um identificador único como chave
//         String idRelatorio = relatorio.getId(); // Assumindo que o relatório tenha um ID único
//         relatorios.put(idRelatorio, relatorio.getConteudo()); // 'Conteudo' é o texto ou dados do relatório
//         System.out.println("Relatório salvo: " + idRelatorio);
//     }

//     /**
//      * Cancela (remove) o Relatório a ser enviado seja para o BIA ou para o PREX.
//      * Remove um relatório do HashMap com base no ID.
//      */
//     public void cancelarRelatorio(Relatorio relatorio) {
//         String idRelatorio = relatorio.getId(); // Assumindo que o relatório tenha um ID único
//         if (relatorios.containsKey(idRelatorio)) {
//             relatorios.remove(idRelatorio);
//             System.out.println("Relatório removido: " + idRelatorio);
//         } else {
//             System.out.println("Relatório não encontrado para cancelamento.");
//         }
//     }

//     /**
//      * Lê o Relatório a ser enviado seja para o BIA ou para o PREX.
//      * Retorna o conteúdo de um relatório existente no HashMap.
//      */
//     public String lerRelatorio(Relatorio relatorio) {
//         String idRelatorio = relatorio.getId(); // Assumindo que o relatório tenha um ID único
//         if (relatorios.containsKey(idRelatorio)) {
//             return relatorios.get(idRelatorio); // Retorna o conteúdo do relatório
//         } else {
//             System.out.println("Relatório não encontrado.");
//             return null;
//         }
//     }

//     /**
//      * Voltar para o Menu do Projeto (apenas um exemplo de operação).
//      * Aqui você poderia simplesmente limpar o HashMap, se necessário.
//      */
//     public void voltarParaMenuDoProjeto() {
//         relatorios.clear(); // Exclui todos os relatórios
//         System.out.println("Voltando para o menu. Todos os relatórios foram limpos.");
//     }
// }
