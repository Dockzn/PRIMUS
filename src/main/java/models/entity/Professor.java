package models.entity;

/**
 * A classe Professor é responsável por disponibilizar apenas os atributos que são importantes para o sistema à classe Coordenador.
 */
public class Professor {

    private String nome, email, siape;

    public Professor(String nome, String email, String siape) {
        this.nome = nome;
        this.email = email;
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) this.email = email;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        if (siape != null) this.siape = siape;
    }
}
