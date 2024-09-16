package br.com.primus.primus.models.repository;

import br.com.primus.primus.models.entity.ProjetoExtensao;
import br.com.primus.primus.models.entity.Coordenador;
import br.com.primus.primus.models.entity.ProjetoEstado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjetoExtensaoDAO {

    private List<ProjetoExtensao> projetos = new ArrayList<>();


    public void adicionarProjeto(ProjetoExtensao projeto) {
        if (projeto != null) {
            projetos.add(projeto);
            System.out.println("Projeto '" + projeto.getTitulo() + "' adicionado com sucesso.");
        } else {
            System.out.println("Projeto inválido. Não foi possível adicionar.");
        }
    }


    public void deletarProjeto(String titulo) {
        ProjetoExtensao projeto = acessarProjeto(titulo);
        if (projeto != null) {
            projetos.remove(projeto);
            System.out.println("Projeto '" + titulo + "' removido com sucesso.");
        } else {
            System.out.println("Projeto '" + titulo + "' não encontrado.");
        }
    }

    public void atualizarProjeto(String titulo, Coordenador coordenador, Date dataVigencia, ProjetoEstado estado) {
        ProjetoExtensao projeto = acessarProjeto(titulo);
        if (projeto != null) {
            if (coordenador != null) {
                projeto.setCoordernador(coordenador);
            }
            if (dataVigencia != null) {
                projeto.setDataVigencia(dataVigencia);
            }
            if (estado != null) {
                projeto.setEstado(estado);
            }
            System.out.println("Projeto '" + titulo + "' atualizado com sucesso.");
        } else {
            System.out.println("Projeto '" + titulo + "' não encontrado.");
        }
    }

    public ProjetoExtensao acessarProjeto(String titulo) {
        for (ProjetoExtensao projeto : projetos) {
            if (projeto.getTitulo().equalsIgnoreCase(titulo)) {
                return projeto;
            }
        }
        System.out.println("Projeto '" + titulo + "' não encontrado.");
        return null;
    }
    
    public List<ProjetoExtensao> listarProjetos() {
        return projetos;
    }
}
