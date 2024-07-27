package models.entity;
import java.util.ArrayList;
import java.util.Date;

public class ProjetoExtensao {

    // ATRIBUTOS 
    private ArrayList<String> membros = new ArrayList<>();
    private Coordenador coordernador;
    private ArrayList<String> relatorios = new ArrayList<>();
    private ArrayList<String> noticia = new ArrayList<>();
    private ArrayList<String> atividades = new ArrayList<>();
    private ArrayList<String> areasAtuacao = new ArrayList<>();
    private ArrayList<String> salaProjeto = new ArrayList<>();
    private Date dataVigencia;
    private String titulo;
    private enum Situacaoatual{
        ATIVO,
        SUSPENSO,
        CONCLUIDO
    }
    private Situacaoatual situacao;

    //CONSTRUTOR//
    public ProjetoExtensao(ArrayList<String> membros, Coordenador coordernador, ArrayList<String> relatorios,
            ArrayList<String> noticia, ArrayList<String> atividades, ArrayList<String> areasAtuacao,
            ArrayList<String> salaProjeto, Date dataVigencia, String titulo, Situacaoatual situacao) {
        this.membros = membros;
        this.coordernador = coordernador;
        this.relatorios = relatorios;
        this.noticia = noticia;
        this.atividades = atividades;
        this.areasAtuacao = areasAtuacao;
        this.salaProjeto = salaProjeto;
        this.dataVigencia = dataVigencia;
        this.titulo = titulo;
        this.situacao = situacao;
    }

    //GETTERS E SETTERS
    public ArrayList<String> getMembros() {
        return membros;
    }
    public void setMembros(ArrayList<String> membros) {
        this.membros = membros;
    }
    public Coordenador getCoordernador() {
        return coordernador;
    }
    public void setCoordernador(Coordenador coordernador) {
        this.coordernador = coordernador;
    }
    public ArrayList<String> getRelatorios() {
        return relatorios;
    }
    public void setRelatorios(ArrayList<String> relatorios) {
        this.relatorios = relatorios;
    }
    public ArrayList<String> getNoticia() {
        return noticia;
    }
    public void setNoticia(ArrayList<String> noticia) {
        this.noticia = noticia;
    }
    public ArrayList<String> getAtividades() {
        return atividades;
    }
    public void setAtividades(ArrayList<String> atividades) {
        this.atividades = atividades;
    }
    public ArrayList<String> getAreasAtuacao() {
        return areasAtuacao;
    }
    public void setAreasAtuacao(ArrayList<String> areasAtuacao) {
        this.areasAtuacao = areasAtuacao;
    }
    public ArrayList<String> getSalaProjeto() {
        return salaProjeto;
    }
    public void setSalaProjeto(ArrayList<String> salaProjeto) {
        this.salaProjeto = salaProjeto;
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

    public Situacaoatual getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacaoatual situacao) {
        this.situacao = situacao;
    }
    


    
}

    
