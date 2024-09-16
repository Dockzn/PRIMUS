package br.com.primus.primus.models.repository;

import br.com.primus.primus.models.entity.Coordenador;
import br.com.primus.primus.models.entity.Membro;
import br.com.primus.primus.models.entity.ProjetoExtensao;


public class CoordenadorDAO {


    public void adicionarMembro(Coordenador coordenador, ProjetoExtensao projeto, Membro membro) {
        if (coordenador == null || projeto == null || membro == null) {
            System.out.println("Dados inválidos. Verifique o coordenador, projeto e membro.");
            return;
        }
        if (!coordenador.getProjetosCoordenados().contains(projeto)) {
            System.out.println("O projeto não pertence a este coordenador.");
            return;
        }

        projeto.getMembros().add(membro.getMatricula());
        System.out.println("Membro '" + membro.getNome() + "' adicionado ao projeto '" + projeto.getTitulo() + "'.");
    }

    public void removerMembro(Coordenador coordenador, ProjetoExtensao projeto, Membro membro) {
        if (coordenador == null || projeto == null || membro == null) {
            System.out.println("Dados inválidos. Verifique o coordenador, projeto e membro.");
            return;
        }
        if (!coordenador.getProjetosCoordenados().contains(projeto)) {
            System.out.println("O projeto não pertence a este coordenador.");
            return;
        }

        if (projeto.getMembros().remove(membro.getMatricula())) {
            System.out.println("Membro '" + membro.getNome() + "' removido do projeto '" + projeto.getTitulo() + "'.");
        } else {
            System.out.println("Membro não encontrado no projeto.");
        }
    }

    public void atualizarMembro(Coordenador coordenador, ProjetoExtensao projeto, Membro membroAtualizado) {
        if (coordenador == null || projeto == null || membroAtualizado == null) {
            System.out.println("Dados inválidos.");
            return;
        }
        if (!coordenador.getProjetosCoordenados().contains(projeto)) {
            System.out.println("O projeto não pertence a este coordenador.");
            return;
        }
        if (projeto.getMembros().contains(membroAtualizado.getMatricula())) {
            projeto.getMembros().remove(membroAtualizado.getMatricula());
            projeto.getMembros().add(membroAtualizado.getMatricula());
            System.out.println("Informações do membro '" + membroAtualizado.getNome() + "' atualizadas no projeto.");
        } else {
            System.out.println("Membro não encontrado no projeto.");
        }
    }


    public void criarProjeto(Coordenador coordenador, ProjetoExtensao novoProjeto) {
        if (coordenador == null || novoProjeto == null) {
            System.out.println("Dados inválidos.");
            return;
        }
        coordenador.getProjetosCoordenados().add(novoProjeto);
        System.out.println("Projeto '" + novoProjeto.getTitulo() + "' criado e adicionado aos projetos coordenados.");
    }

    public void removerProjeto(Coordenador coordenador, String tituloProjeto) {
        if (coordenador == null || tituloProjeto == null || tituloProjeto.isEmpty()) {
            System.out.println("Dados inválidos.");
            return;
        }
        ProjetoExtensao projetoRemover = null;
        for (ProjetoExtensao projeto : coordenador.getProjetosCoordenados()) {
            if (projeto.getTitulo().equals(tituloProjeto)) {
                projetoRemover = projeto;
                break;
            }
        }
        if (projetoRemover != null) {
            coordenador.getProjetosCoordenados().remove(projetoRemover);
            System.out.println("Projeto '" + tituloProjeto + "' removido com sucesso.");
        } else {
            System.out.println("Projeto não encontrado.");
        }
    }


    public void atualizarProjeto(Coordenador coordenador, ProjetoExtensao projetoAtualizado) {
        if (coordenador == null || projetoAtualizado == null) {
            System.out.println("Dados inválidos.");
            return;
        }

        
        for (ProjetoExtensao projeto : coordenador.getProjetosCoordenados()) {
            if (projeto.getTitulo().equals(projetoAtualizado.getTitulo())) {
                projeto.setDataVigencia(projetoAtualizado.getDataVigencia());
                projeto.setEstado(projetoAtualizado.getEstado());
                projeto.setAtividades(projetoAtualizado.getAtividades());
                projeto.setNoticias(projetoAtualizado.getNoticias());
                System.out.println("Projeto '" + projetoAtualizado.getTitulo() + "' atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Projeto não encontrado.");
    }
}
