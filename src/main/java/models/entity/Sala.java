package models.entity;

public class Sala {
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
        if(local == null){                       //Verifica se a variavel eh nula
            throw new IllegalArgumentException("O local não pode ficar vazio.");
        }
        this.local = local;
    }
    
}
