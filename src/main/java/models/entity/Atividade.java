package models.entity;
import java.time.LocalDate;


public class Atividade {
    //ATRIBUTOS
    private String nome;
    private String responsavel;
    private LocalDate dataCriacao = LocalDate.now();
    private String comentario;
    private String tags; // NECESSACARIO CRIAR CLASSE DE TAG PARA SER POSSIVEL TER UMA LISTA DE TAGS COMO ATRIBUTO DESTA CLASSE
    public enum Complexidade {
        FACIL(3),
        MEDIO(2),
        DIFICIL(1);
    
        private final int valor;
    
        Complexidade(int valor) {
            this.valor = valor;
        }
    
        public int getValor() {
            return valor;
        }
    }
    private Complexidade complexidade;
    private int horaEstimada;
    private String salaAtividade;

    public enum Status {
        AFAZER(3),
        FAZENDO(2),
        FEITO(1);
    
        private final int valor;
    
        Status(int valor) {
            this.valor = valor;
        }
    
        public int getValor() {
            return valor;
        }
    }
    private Status status;
    
    //CONSTRUTOR
    public Atividade(String nome, String responsavel, LocalDate dataCriacao, String comentario, String tags,
            Complexidade complexidade, int horaEstimada, String salaAtividade, Status status) {
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

    //Se nome for diferente de nulo
    public void setNome(String nome) {
        if(nome != null) this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    //Se nome do responsavel for diferente de nulo
    public void setResponsavel(String responsavel){
        if(responsavel != null){
            this.responsavel = responsavel;
        }

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

    public Complexidade getComplexidade() {
        return complexidade;
    }

    //O setter de complexidade deve atender as 3 constantes do enum que representam a dificuldade da atividade
    public void setComplexidade(Complexidade complexidade) {
        if(complexidade == Complexidade.FACIL || complexidade == Complexidade.MEDIO || complexidade == Complexidade.DIFICIL) 
            this.complexidade = complexidade;
    }

    public int getHoraEstimada() {
        return horaEstimada;
    }

    //Hora estimada para o fim da atividade deve ser maior do que zero. Menor ou igual que 0 não faz sentido
    public void setHoraEstimada(int horaEstimada) {
        if(horaEstimada > 0) 
            this.horaEstimada = horaEstimada;
    }

    public String getSalaAtividade() {
        return salaAtividade;
    }


    public void setSalaAtividade(String salaAtividade) {
        if(salaAtividade != null) this.salaAtividade = salaAtividade;
    }

    public Status getStatus() {
        return status;
    }

    //O setter de status deve atender as 3 constantes do enum que representam o status da atividade no sistema    
    public void setStatus(Status status) {
        if(status == Status.AFAZER || status == Status.FAZENDO || status == Status.FEITO) 
            this.status = status;
    }

    
}
