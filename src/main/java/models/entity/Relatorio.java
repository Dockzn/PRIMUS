package models.entity;
import java.time.LocalDate;
public class Relatorio {
    //ATRIBUTOS//
    public enum Tipo {
        BIA,
        PREX
    }

    private Tipo tipo; // Enum Tipo
    private String observacoes;
    private String campoAnexo;
    private LocalDate dataLimite;

    // Construtor
    public Relatorio(Tipo tipo, String observacoes, String campoAnexo, LocalDate dataLimite) {
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.campoAnexo = campoAnexo;
        this.dataLimite = dataLimite;
    }

    // Getters e Setters
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) { 
        if (tipo == Tipo.BIA || tipo == Tipo.PREX) // Verifica se 'tipo' tem valores do enum
            this.tipo = tipo;                      
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        if (observacoes == null) {                  //Verifica se a variavel eh nula
            throw new IllegalArgumentException("Observacoes não pode ficar vazia.");
        }
        this.observacoes = observacoes;
    }

    public String getCampoAnexo() {
        return campoAnexo;
    }

    public void setCampoAnexo(String campoAnexo) {
        if (campoAnexo == null) {                   //Verifica se a variavel eh nula
            throw new IllegalArgumentException("campoAnexo não pode ficar vazio.");
        }
        this.campoAnexo = campoAnexo;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        if (dataLimite == null) {                   //Verifica se a data eh nula
            throw new IllegalArgumentException("A data limite não pode ser nula.");
        }
        LocalDate hoje = LocalDate.now();                   //cria a data para a condicao
        if (dataLimite.isBefore(hoje)) {              //Verifica se a data esta no passado
            throw new IllegalArgumentException("A data limite não pode ser no passado.");
        }
        this.dataLimite = dataLimite;
    }
}