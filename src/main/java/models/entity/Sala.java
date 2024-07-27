package models.entity;

public class Sala {
    /*ATRIBUTOS*/
    private String nome;
    private int capacidadeMaxima;
    
    /*CONSTRUTOR */
    public Sala(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    /*GETTERS E SETTERS*/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        if (capacidadeMaxima > 0) {
            this.capacidadeMaxima = capacidadeMaxima;
        } else {
            System.out.println("Capacidade inválida");
        }
    }
}
