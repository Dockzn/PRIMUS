package br.com.primus.primus.models.entity;

import java.util.Date;

/**
 * A classe Noticia representa uma seção de fácil acesso no site, onde Coordenadores e Membros podem fazer anúncios referentes a 
 * atividades internas do projeto de extensão, como por exemplo: anunciar reuniões.
 * 
 * Obs: Além disso, nossa ideia é que, posteriormente, essa classe seja capaz de enviar notificações por email aos participantes.
 */
public class Noticia {

    private String titulo, descricao;
    private Date dataCriacao;
    
    public Noticia(){}
    
    public Noticia(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = new Date();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null){ 
            this.titulo = titulo;
        }else{
            throw new IllegalArgumentException("Digite um título válido.");
        }
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        if (descricao != null){ 
            this.descricao = descricao;
        }else{
            throw new IllegalArgumentException("É obrigatório digitar uma descrição para a notícia.");
        }
    }
    
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        if (dataCriacao != null) this.dataCriacao = dataCriacao;
    }
}