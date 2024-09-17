package br.com.primus.primus.models.entity;

import java.time.LocalDate;

public class Atividade {
    private int id;
    private String nome;
    private String responsavel;
    private String comentarios;
    private String tags;
    private String local;
    private LocalDate dataCriacao;
    private AtividadeComplexidade complexidade;
    private int horasEstimadas;
    private AtividadeStatus status;

    // Constructor
    public Atividade(int id, String nome, String responsavel, String comentarios, String tags, String local,
                     LocalDate dataCriacao, AtividadeComplexidade complexidade, int horasEstimadas, AtividadeStatus status) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavel;
        this.comentarios = comentarios;
        this.tags = tags;
        this.local = local;
        this.dataCriacao = dataCriacao;
        this.complexidade = complexidade;
        this.horasEstimadas = horasEstimadas;
        this.status = status;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public LocalDate getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDate dataCriacao) { this.dataCriacao = dataCriacao; }
    public AtividadeComplexidade getComplexidade() { return complexidade; }
    public void setComplexidade(AtividadeComplexidade complexidade) { this.complexidade = complexidade; }
    public int getHorasEstimadas() { return horasEstimadas; }
    public void setHorasEstimadas(int horasEstimadas) { this.horasEstimadas = horasEstimadas; }
    public AtividadeStatus getStatus() { return status; }
    public void setStatus(AtividadeStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Atividade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", tags='" + tags + '\'' +
                ", local='" + local + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", complexidade=" + complexidade +
                ", horasEstimadas=" + horasEstimadas +
                ", status=" + status +
                '}';
    }
}
