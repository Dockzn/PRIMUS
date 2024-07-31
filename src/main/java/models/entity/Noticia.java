package models.entity;

import java.util.Date;

public class Noticia {

/**
 * A classe Noticia representa uma seção de fácil acesso no site, onde Coordenadores e Membros podem fazer anúncios referentes a 
 * atividades internas do projeto de extensão, como por exemplo: anunciar reuniões.
 * 
 * Obs: Além disso, nossa ideia é que, posteriormente, essa classe seja capaz de enviar notificações por email aos participantes.
 */

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