package br.com.primus.primus.models.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Relatorio {
    private int id;
    private RelatorioTipo tipo;
    private String observacoes;
    private String campoAnexo;
    private Date dataLimite;

    // Construtor padrão
    public Relatorio() {
    }

    // Construtor completo
    public Relatorio(int id, RelatorioTipo tipo, String observacoes, String campoAnexo, Date dataLimite) {
        this.id = id;
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.campoAnexo = campoAnexo;
        this.dataLimite = dataLimite;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RelatorioTipo getTipo() {
        return tipo;
    }

    public void setTipo(RelatorioTipo tipo) {
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

    // Converte o objeto Relatorio para um HashMap
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("tipo", tipo);
        map.put("observacoes", observacoes);
        map.put("campoAnexo", campoAnexo);
        map.put("dataLimite", dataLimite);
        return map;
    }

    // Cria um objeto Relatorio a partir de um HashMap
    public static Relatorio fromMap(Map<String, Object> map) {
        int id = (int) map.get("id");
        RelatorioTipo tipo = (RelatorioTipo) map.get("tipo");
        String observacoes = (String) map.get("observacoes");
        String campoAnexo = (String) map.get("campoAnexo");
        Date dataLimite = (Date) map.get("dataLimite");
        return new Relatorio(id, tipo, observacoes, campoAnexo, dataLimite);
    }

    @Override
    public String toString() {
        return "Relatorio [id=" + id + ", tipo=" + tipo + ", observacoes=" + observacoes + ", campoAnexo=" + campoAnexo
                + ", dataLimite=" + dataLimite + "]";
    }
}
