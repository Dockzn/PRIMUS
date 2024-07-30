package models.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class ProjetoExtensao {

    // ATRIBUTOS 
    private List<String> membros = new ArrayList<>(),
        relatorios = new ArrayList<>(),
        noticia = new ArrayList<>(),
        atividades = new ArrayList<>(),
        areasAtuacao = new ArrayList<>(),
        salaProjeto = new ArrayList<>();
    private Coordenador coordernador;
    private Date dataVigencia;
    private String titulo;
    private ProjetoEstado estado;

    //CONSTRUTOR
    public ProjetoExtensao(Coordenador coordernador, Date dataVigencia, String titulo, ProjetoEstado estado) {
        this.coordernador = coordernador;
        this.dataVigencia = dataVigencia;
        this.titulo = titulo;
        this.estado = estado;
    }

    //GETTERS E SETTERS
    public List<String> getMembros() {
        return membros;
    }

    public void setMembros(List<String> membros) {
        this.membros = membros;
    }

    public List<String> getRelatorios() {
        return relatorios;
    }

    public void setRelatorios(List<String> relatorios) {
        this.relatorios = relatorios;
    }

    public List<String> getNoticia() {
        return noticia;
    }

    public void setNoticia(List<String> noticia) {
        this.noticia = noticia;
    }

    public List<String> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<String> atividades) {
        this.atividades = atividades;
    }

    public List<String> getAreasAtuacao() {
        return areasAtuacao;
    }

    public void setAreasAtuacao(List<String> areasAtuacao) {
        this.areasAtuacao = areasAtuacao;
    }

    public List<String> getSalaProjeto() {
        return salaProjeto;
    }

    public void setSalaProjeto(List<String> salaProjeto) {
        this.salaProjeto = salaProjeto;
    }

    public Coordenador getCoordernador() {
        return coordernador;
    }

    public void setCoordernador(Coordenador coordernador) {
        this.coordernador = coordernador;
    }

    public Date getDataVigencia() {
        return dataVigencia;
    }

    public void setDataVigencia(Date dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ProjetoEstado getEstado() {
        return estado;
    }

    public void setEstado(ProjetoEstado estado) {
        this.estado = estado;
    }
}
