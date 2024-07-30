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
        this.local = local;
    }
    
}
