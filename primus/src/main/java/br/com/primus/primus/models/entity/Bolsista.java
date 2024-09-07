package br.com.primus.primus.models.entity;

public class Bolsista extends Aluno {

    private String relatorioBIA;

    public Bolsista(String nome, String email, String cargo, String matricula, String curso, String relatorioBIA) {
        super(nome, email, cargo, matricula, curso);
        this.relatorioBIA = relatorioBIA;
    }

    public String getRelatorioBIA() {
        return relatorioBIA;
    }

    public void setRelatorioBIA(String relatorioBIA) {
        if (relatorioBIA != null) this.relatorioBIA = relatorioBIA;
    }
}
