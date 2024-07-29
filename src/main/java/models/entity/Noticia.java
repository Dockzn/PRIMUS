package models.entity;
import java.time.LocalDate;

public class Noticia {
    //ATRIBUTOS//
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao = LocalDate.now();

    
    //CONSTRUTOR//
    public Noticia(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    
    //GETTERS E SETTERS//
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        if(descricao == null){                      //Verifica se a variavel eh nula
            throw new IllegalArgumentException("A descricao não pode ficar vazia.");
        }
        this.descricao = descricao;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if(titulo == null){                         //Verifica se a variavel eh nula
            throw new IllegalArgumentException("O titulo não pode ficar vazio.");
        }
        this.titulo = titulo;
    }
    
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

}