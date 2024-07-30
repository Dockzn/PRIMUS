package models.entity;

import java.util.Date;

public class Noticia {
    //ATRIBUTOS//
    private String titulo, descricao;
    private Date dataCriacao;
    
    //CONSTRUTOR//
    public Noticia(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = new Date();
    }
    
    //GETTERS E SETTERS//
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        if (dataCriacao != null) this.dataCriacao = dataCriacao;
    }
}