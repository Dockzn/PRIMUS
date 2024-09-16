package br.com.primus.primus.models.entity;

/**
 * A classe Sala é responsável por armazenar uma String contendo o local da sala que foi reservada para atividades do Projeto.
 * 
 * Obs: A reserva da sala é de responsabilidade da UFC.
 */
public class Sala {

    private String local;
    
    public Sala(){}

    public Sala(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if (local != null){
            this.local = local;
        }else{
            throw new IllegalArgumentException("É obrigatório digitar um título.");
        }
    }
}
