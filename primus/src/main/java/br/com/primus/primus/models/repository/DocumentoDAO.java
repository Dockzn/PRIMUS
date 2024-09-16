package br.com.primus.primus.models.repository;
import br.com.primus.primus.models.entity.Documentacao;
import br.com.primus.primus.models.entity.Documento;

import java.util.List;

public class DocumentoDAO {

    private Documentacao documentacao;

    public DocumentoDAO(Documentacao documentacao) {
        this.documentacao = documentacao;
    }

    // Método para adicionar um novo Documento à lista
    public void adicionarDocumento(Documento novoDocumento) {
        if (novoDocumento != null) {
            documentacao.getDocumentos().add(novoDocumento);
            System.out.println("Documento adicionado com sucesso: " + novoDocumento.getDescricao());
        } else {
            System.out.println("Documento inválido.");
        }
    }

    // Método para remover um Documento da lista
    public boolean removerDocumento(String descricao) {
        List<Documento> documentos = documentacao.getDocumentos();
        for (Documento doc : documentos) {
            if (doc.getDescricao().equals(descricao)) {
                documentos.remove(doc);
                System.out.println("Documento removido: " + descricao);
                return true;
            }
        }
        System.out.println("Documento não encontrado: " + descricao);
        return false;
    }

    // Método para acessar e exibir um Documento por sua descrição
    public Documento acessarDocumento(String descricao) {
        for (Documento doc : documentacao.getDocumentos()) {
            if (doc.getDescricao().equals(descricao)) {
                System.out.println("Documento acessado: " + doc);
                return doc;
            }
        }
        System.out.println("Documento não encontrado: " + descricao);
        return null;
    }

    // Método para atualizar um Documento existente
    public boolean atualizarDocumento(String descricao, Documento documentoAtualizado) {
        List<Documento> documentos = documentacao.getDocumentos();
        for (int i = 0; i < documentos.size(); i++) {
            Documento doc = documentos.get(i);
            if (doc.getDescricao().equals(descricao)) {
                documentos.set(i, documentoAtualizado);
                System.out.println("Documento atualizado: " + descricao);
                return true;
            }
        }
        System.out.println("Documento não encontrado: " + descricao);
        return false;
    }
}
