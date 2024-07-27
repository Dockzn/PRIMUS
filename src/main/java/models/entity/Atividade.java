package models.entity;
import java.sql.Date;

public class Atividade {
    //ATRIBUTOS
    private String nome;
    private String responsavel;
    private Date dataCriacao;
    private String comentario;
    private String tags;
    private int complexidade;
    private int horaEstimada;
    private String salaAtividade;
    public enum Status{
        AFAZER,
        FAZENDO,
        FEITO
    }
    private Status status;
    
    //CONSTRUTOR
    public Atividade(String nome, String responsavel, Date dataCriacao, String comentario, String tags,
            int complexidade, int horaEstimada, String salaAtividade, Status status) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.dataCriacao = dataCriacao;
        this.comentario = comentario;
        this.tags = tags;
        this.complexidade = complexidade;
        this.horaEstimada = horaEstimada;
        this.salaAtividade = salaAtividade;
        this.status = status;
    }

    //GETTERS E SETTERS//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public int getHoraEstimada() {
        return horaEstimada;
    }

    public void setHoraEstimada(int horaEstimada) {
        this.horaEstimada = horaEstimada;
    }

    public String getSalaAtividade() {
        return salaAtividade;
    }

    public void setSalaAtividade(String salaAtividade) {
        this.salaAtividade = salaAtividade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
