package models.entity;

public class Professor {
    // ATRIBUTOS //
    private String nome;
    private String email;
    private String siape;

    //CONSTRUTOR//
    public Professor(String nome, String email, String siape) {
        this.nome = nome;
        this.email = email;
        this.siape = siape;
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
    public String getSiape() {
        return siape;
    }
    public void setSiape(String siape) {
        if (siape != null) this.siape = siape;
    }
    
}
