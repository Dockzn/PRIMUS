package br.com.primus.primus.models.entity;

import java.time.LocalDate;

public class Atividade {

    private static int contadorId = 0; // Variável estática para contar o ID

    private int id; // Novo campo ID
    private String nome, responsavel, comentario, tags, sala;
    private final LocalDate dataCriacao;
    private AtividadeComplexidade complexidade;
    private int horas, horasCumpridas;
    private AtividadeStatus status;

    public Atividade(String nome, String responsavel, String comentario, String tags, String sala,
            LocalDate dataCriacao, AtividadeComplexidade complexidade, int horas, AtividadeStatus status) {
        this.id = ++contadorId; // Atribui um ID único incremental
        this.nome = nome;
        this.responsavel = responsavel;
        this.comentario = comentario;
        this.tags = tags;
        this.sala = sala;
        this.dataCriacao = dataCriacao != null ? dataCriacao : LocalDate.now();
        this.complexidade = complexidade;
        this.horas = horas;
        this.status = status;
    }

    // Getter para o ID
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null) this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        if(responsavel != null) this.responsavel = responsavel;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        if(comentario != null) this.comentario = comentario;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        if(tags != null) this.tags = tags;
    }

    public AtividadeComplexidade getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(AtividadeComplexidade complexidade) {
        if (complexidade != null) this.complexidade = complexidade;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas > 0) this.horas = horas;
    }

    public int getHorasCumpridas() {
        return horasCumpridas;
    }

    public void setHorasCumpridas(int horasCumpridas) {
        if (horasCumpridas >= 0) this.horasCumpridas = horasCumpridas;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        if(sala != null) this.sala = sala;
    }

    public AtividadeStatus getStatus() {
        return status;
    }

    public void setStatus(AtividadeStatus status) {
        if (status != null) this.status = status;
    }
}
