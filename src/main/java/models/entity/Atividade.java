package models.entity;
import java.time.LocalDate;

/*
 * Essa classe está exposta no site pelo botão de criar a atividade , e quando for clicado , irá abrir uma pop-up da atividade , onde será possível preencher todos os atributos de uma atividade 
 * (Nome, responsavel, comentario, tags(representa que tipo de atividade ele está realizando , para oferecer maior rastreabilidade das atividades do projeto), sala, data de criação, complexidade , horas, horas cumpridas e status).Quando a atividade for criada e tiver seus atributos preenchidos , ela irá para uma esteira Kanbam , onde poderá ser visualizada por todos do projeto. Será possível também sair da atividade,
 * e a edição será automática ao entrar na atividade que estará na Esteira Kanbam do projeto. A edição será permitida pelos Coordenadores e Membros. 
 */




public class Atividade {
    //ATRIBUTOS
    private String nome, responsavel, comentario, tags, sala;
    private LocalDate dataCriacao = LocalDate.now();
    private AtividadeComplexidade complexidade;
    private int horas, horasCumpridas;
    private AtividadeStatus status;
    
    //CONSTRUTOR
    public Atividade(String nome, String responsavel, String comentario, String tags, String sala,
            LocalDate dataCriacao, AtividadeComplexidade complexidade, int horas, AtividadeStatus status) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.comentario = comentario;
        this.tags = tags;
        this.sala = sala;
        this.dataCriacao = dataCriacao;
        this.complexidade = complexidade;
        this.horas = horas;
        this.status = status;
    }
    

    //GETTERS E SETTERS//
    public String getNome() {
        return nome;
    }

    //Se nome for diferente de nulo
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

    //Se nome do responsavel for diferente de nulo
    public void setResponsavel(String responsavel) {
        if(responsavel != null) this.responsavel = responsavel;
    }


    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    //A data de criacao ja esta settada
     

    public String getComentario() {
        return comentario;
    }

    //Setter de colocar comentarios e se for diferente de nulo
    public void setComentario(String comentario) {
        if(comentario != null) this.comentario = comentario;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        if(tags != null) 
            this.tags = tags;
    }

    public AtividadeComplexidade getComplexidade() {
        return complexidade;
    }

    //O setter de complexidade deve atender as 3 constantes do enum que representam a dificuldade da atividade
    public void setComplexidade(AtividadeComplexidade complexidade) {
        if (complexidade != null) this.complexidade = complexidade;
    }

    public int getHoras() {
        return horas;
    }

    //Hora estimada para o fim da atividade deve ser maior do que zero. Menor ou igual que 0 não faz sentido
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

    //O setter de status deve atender as 3 constantes do enum que representam o status da atividade no sistema    
    public void setStatus(AtividadeStatus status) {
        if (status != null) this.status = status;
    }
}
