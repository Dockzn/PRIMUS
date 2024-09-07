package br.com.primus.primus.models.entity;

import java.time.LocalDate;

/**
 * Essa classe está exposta no site pelo botão de criar a atividade , e quando for clicado , irá abrir uma pop-up da atividade , onde será possível preencher todos os atributos de uma atividade 
 * (Nome, responsavel, comentario, tags(representa que tipo de atividade ele está realizando , para oferecer maior rastreabilidade das atividades do projeto), sala, data de criação, complexidade , horas, horas cumpridas e status).Quando a atividade for criada e tiver seus atributos preenchidos , ela irá para uma esteira Kanbam , onde poderá ser visualizada por todos do projeto. Será possível também sair da atividade,
 * e a edição será automática ao entrar na atividade que estará na Esteira Kanbam do projeto. A edição será permitida pelos Coordenadores e Membros. 
 */
public class Atividade {

    private String nome, responsavel, comentario, tags, sala;
    private final LocalDate dataCriacao;
    private AtividadeComplexidade complexidade;
    private int horas, horasCumpridas;
    private AtividadeStatus status;
    
    public Atividade(String nome, String responsavel, String comentario, String tags, String sala,
            LocalDate dataCriacao, AtividadeComplexidade complexidade, int horas, AtividadeStatus status) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.comentario = comentario;
        this.tags = tags;
        this.sala = sala;
        this.dataCriacao = LocalDate.now();
        this.complexidade = complexidade;
        this.horas = horas;
        this.status = status;
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

    public int getHorasCumpridas() {
        return horasCumpridas;
    }

    public void setHorasCumpridas(int horasCumpridas) {
        if (horasCumpridas < 0) this.horasCumpridas = horasCumpridas;
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
