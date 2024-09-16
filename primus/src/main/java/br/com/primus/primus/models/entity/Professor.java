package br.com.primus.primus.models.entity;

/**
 * A classe Professor é responsável por disponibilizar apenas os atributos que são importantes para o sistema à classe Coordenador.
 */
public class Professor {

    private String nome, email, siape;

    public Professor(){}

    public Professor(String nome, String email, String siape) {
        this.nome = nome;
        this.email = email;
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Não é um nome válido!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null && email.contains("@") || email.contains(".com") 
                || email.contains(".com.br") || email.contains("@ufc.br")){
            this.email = email;
        }else{
            throw new IllegalArgumentException("Não é um email valido!");
        }
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        if (siape != null && siape.length() == 7)
             this.siape = siape;
    }
}
