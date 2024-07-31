package models.entity;

public class Sala {

/**
 * A classe Sala é responsável por armazenar uma String contendo o local da sala que foi reservada para atividades do Projeto.
 * 
 * Obs: A reserva da sala é de responsabilidade da UFC.
 */

    /*ATRIBUTOS*/
    private String local;
    
    /*CONSTRUTOR */ 
    public Sala(String local) {
        this.local = local;
    }

    /*GETTERS E SETTERS*/
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    
}
