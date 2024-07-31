package models.entity;
import java.util.Date;


/**
 * A classe Relatorio será destinada aos Membros e Membros Bolsistas, permitindo que façam seus relatórios de atividades do projeto 
 * e enviem ao Coordenador, para melhor controle de presença e participação no projeto. Isso inclui tanto relatórios normais quanto, 
 * no caso dos Bolsistas, relatórios BIA.
 */

public class Relatorio {

    //ATRIBUTOS//
    private AtividadeTipo tipo;
    private String observacoes, campoAnexo;
    private Date dataLimite;

    // Construtor
    public Relatorio(AtividadeTipo tipo, String observacoes, String campoAnexo, Date dataLimite) {
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.campoAnexo = campoAnexo;
        this.dataLimite = dataLimite;
    }

    // Getters e Setters
    public AtividadeTipo getTipo() {
        return tipo;
    }

    /**
     * 
     * @param tipo
     * 
     * Legal e legal
     */
    public void setTipo(AtividadeTipo tipo) {
        this.tipo = tipo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getCampoAnexo() {
        return campoAnexo;
    }

    public void setCampoAnexo(String campoAnexo) {
        this.campoAnexo = campoAnexo;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }
}