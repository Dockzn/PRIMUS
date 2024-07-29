package models.entity;

public class Professor {
    // ATRIBUTOS //
    private String nome;
    private String email;
    private String SIAPE;

    //CONSTRUTOR//
    public Professor(String nome, String email, String SIAPE) {
        this.nome = nome;
        this.email = email;
        this.SIAPE = SIAPE;
    }

    //GETTERS E SETTERS//
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome == null){                       //Verifica se a variavel eh nula
            throw new IllegalArgumentException("O nome não pode ficar vazio.");
        }
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email == null){                      //Verifica se a variavel eh nula
            throw new IllegalArgumentException("O email não pode ficar vazio.");
        }
        this.email = email;
    }
    public String getSIAPE() {
        return SIAPE;
    }
    public void setSIAPE(String SIAPE) {
        if(SIAPE == null || SIAPE.length()!=6){                      //Verifica se a variavel eh nula
            throw new IllegalArgumentException("O SIAPE não pode ficar vazio.");
        }
        this.SIAPE = SIAPE;
    }
    
}
