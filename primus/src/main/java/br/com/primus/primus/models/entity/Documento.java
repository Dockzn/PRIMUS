package br.com.primus.primus.models.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


/**
 * A classe Documento é responsável por receber arquivos anexados, enviados por Membros e Coordenadores, e posteriormente guardá-los 
 * na classe Documentação.
 */
public class Documento {
    
    private String descricao;
    private Date dataPublicacao;
    private String membroResponsavel;
    private List<Membro> historico = new ArrayList<>();
    private List<Arquivo> arquivos = new ArrayList<>();
    
    public Documento(String descricao, Date dataPublicacao, String membroResponsavel) {
        this.descricao = descricao;
        this.dataPublicacao = dataPublicacao;
        this.membroResponsavel = membroResponsavel;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null) this.descricao = descricao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        if (dataPublicacao != null) this.dataPublicacao = dataPublicacao;
    }


    public String getMembroResponsavel() {
        return membroResponsavel;
    }

    public void setMembroResponsavel(String membroResponsavel) {
        if(membroResponsavel != null) this.membroResponsavel = membroResponsavel;
    }

    public List<Membro> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Membro> historico) {
        if (historico != null) this.historico = historico;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }
    
    public void setArquivos(List<Arquivo> arquivos) {
        if (arquivos != null) this.arquivos = arquivos;
    }
}
