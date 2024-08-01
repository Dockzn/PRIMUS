package models.entity;

import java.util.Date;

/**
 * A classe Relatorio será destinada aos Membros e Membros Bolsistas, permitindo que façam seus relatórios de atividades do projeto 
 * e enviem ao Coordenador, para melhor controle de presença e participação no projeto. Isso inclui tanto relatórios normais quanto, 
 * no caso dos Bolsistas, relatórios BIA.
 */
public class Relatorio {

    private RelatorioTipo tipo;
    private String observacoes, campoAnexo;
    private Date dataLimite;

    public Relatorio(RelatorioTipo tipo, String observacoes, String campoAnexo, Date dataLimite) {
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.campoAnexo = campoAnexo;
        this.dataLimite = dataLimite;
    }

    public RelatorioTipo getTipo() {
        return tipo;
    }

    public void setTipo(RelatorioTipo tipo) {
        if (tipo != null) this.tipo = tipo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        if (observacoes != null) this.observacoes = observacoes;
    }

    public String getCampoAnexo() {
        return campoAnexo;
    }

    public void setCampoAnexo(String campoAnexo) {
        if (campoAnexo != null) this.campoAnexo = campoAnexo;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        if (dataLimite != null) this.dataLimite = dataLimite;
    }
}