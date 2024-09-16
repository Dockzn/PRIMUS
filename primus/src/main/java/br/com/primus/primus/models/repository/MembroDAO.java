package br.com.primus.primus.models.repository;
import br.com.primus.primus.models.entity.Membro;
import br.com.primus.primus.models.entity.Atividade;
import br.com.primus.primus.models.entity.Documento;

import java.util.List;

public class MembroDAO {

    // Criar e adicionar uma nova atividade à lista de atividades de um membro
    public void criarAtividade(Membro membro, Atividade novaAtividade) {
        if (membro == null || novaAtividade == null) {
            System.out.println("Dados inválidos. Verifique o membro e a atividade.");
            return;
        }
        // Adiciona a nova atividade à lista de atividades do membro
        membro.getAtividades().add(novaAtividade);
        System.out.println("Atividade '" + novaAtividade.getNome() + "' criada com sucesso.");
    }

    // Remover uma atividade da lista de atividades de um membro
    public void removerAtividade(Membro membro, Atividade atividadeRemover) {
        if (membro == null || atividadeRemover == null) {
            System.out.println("Dados inválidos. Verifique o membro e a atividade.");
            return;
        }
        // Remove a atividade da lista
        if (membro.getAtividades().remove(atividadeRemover)) {
            System.out.println("Atividade '" + atividadeRemover.getNome() + "' removida com sucesso.");
        } else {
            System.out.println("Atividade não encontrada na lista.");
        }
    }

    // Criar e adicionar um novo documento à lista de documentos
    public void criarDocumento(List<Documento> documentos, Documento novoDocumento) {
        if (documentos == null || novoDocumento == null) {
            System.out.println("Dados inválidos. Verifique a lista de documentos e o documento.");
            return;
        }
        // Adiciona o novo documento à lista de documentos
        documentos.add(novoDocumento);
        System.out.println("Documento criado com sucesso.");
    }

    // Remover um documento da lista de documentos
    public void removerDocumento(List<Documento> documentos, Documento documentoRemover) {
        if (documentos == null || documentoRemover == null) {
            System.out.println("Dados inválidos. Verifique a lista de documentos e o documento.");
            return;
        }
        // Remove o documento da lista
        if (documentos.remove(documentoRemover)) {
            System.out.println("Documento removido com sucesso.");
        } else {
            System.out.println("Documento não encontrado na lista.");
        }
    }
}
