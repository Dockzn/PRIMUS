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
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSIAPE() {
        return SIAPE;
    }
    public void setSIAPE(String sIAPE) {
        SIAPE = sIAPE;
    }
    
}
