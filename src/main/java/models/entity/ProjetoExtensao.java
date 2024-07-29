package models.entity;
import java.util.ArrayList;
import java.time.LocalDate;

public class ProjetoExtensao {

    // ATRIBUTOS 
    private ArrayList<String> membros = new ArrayList<>();
    private Coordenador coordernador;
    private ArrayList<String> relatorios = new ArrayList<>();
    private ArrayList<String> noticias = new ArrayList<>();
    private ArrayList<String> atividades = new ArrayList<>();
    private ArrayList<String> areasAtuacao = new ArrayList<>();
    private ArrayList<String> salasProjeto = new ArrayList<>();
    private LocalDate dataVigencia;
    private String titulo;
    private enum Situacaoatual{
        ATIVO,
        SUSPENSO,
        CONCLUIDO
    }
    private Situacaoatual situacao;

    //CONSTRUTOR//
    public ProjetoExtensao(ArrayList<String> membros, Coordenador coordernador, ArrayList<String> relatorios,
            ArrayList<String> noticias, ArrayList<String> atividades, ArrayList<String> areasAtuacao,
            ArrayList<String> salasProjeto, LocalDate dataVigencia, String titulo, Situacaoatual situacao) {
        this.membros = membros;
        this.coordernador = coordernador;
        this.relatorios = relatorios;
        this.noticias = noticias;
        this.atividades = atividades;
        this.areasAtuacao = areasAtuacao;
        this.salasProjeto = salasProjeto;
        this.dataVigencia = dataVigencia;
        this.titulo = titulo;
        this.situacao = situacao;
    }

    //GETTERS E SETTERS
    public ArrayList<String> getMembros() {
        return membros;
    }
    public void setMembros(String membro) {
        if (membro == null) {                           //Verifica se o membro é nulo
            throw new IllegalArgumentException("O membro nao pode ser nulo.");
        }
        else{
            membros.add(membro);
        }
    }
    public Coordenador getCoordernador() {
        return coordernador;
    }
    public void setCoordernador(Coordenador coordernador) {
        if (coordernador == null) {                     //Verifica se a variavel eh nula
            throw new IllegalArgumentException("O coordenador nao pode ser nulo.");
        }
        this.coordernador = coordernador;
    }
    public ArrayList<String> getRelatorios() {
        return relatorios;
    }
    public void setRelatorios(String relatorio) {
        if (relatorio == null) {                       //Verifica se a lista eh nula
            throw new IllegalArgumentException("O relatorio nao pode ser nulo.");
        }
        else{
            relatorios.add(relatorio);
        }
    }
    public ArrayList<String> getNoticias() {
        return noticias;
    }
    public void setNoticias(String noticia) {
        if (noticia == null) {                          //Verifica se a noticias eh nula
            throw new IllegalArgumentException("A noticia nao pode ser nula.");
        }
        else{
            noticias.add(noticia);
        }
    }
    public ArrayList<String> getAtividades() {
        return atividades;
    }
    public void setAtividades(String atividade) {
        if (atividade == null) {                           //Verifica se a atividade eh nula
            throw new IllegalArgumentException("A atividade nao pode ser nula.");
        }
        else{
            atividades.add(atividade);
        }
    }
    public ArrayList<String> getAreasAtuacao() {
        return areasAtuacao;
    }
    public void setAreasAtuacao(String areaAtuacao) {
        if (areaAtuacao == null) {                     //Verifica se a areaAtuacao eh nula
            throw new IllegalArgumentException("A areaAtuacao nao pode ser nula.");
        }
        else{
            areasAtuacao.add(areaAtuacao);
        }
    }
    public ArrayList<String> getSalasProjeto() {
        return salasProjeto;
    }
    public void setSalasProjeto(String salaProjeto) {
        if (salaProjeto == null) {                      //Verifica se a sala eh nula
            throw new IllegalArgumentException("A salaProjeto nao pode ser nula.");
        }
        else{
            salasProjeto.add(salaProjeto);
        }
    }
    public LocalDate getDataVigencia() {
        return dataVigencia;
    }
    public void setDataVigencia(LocalDate dataVigencia) {
        if (dataVigencia == null) {                     //Verifica se a data eh nula
            throw new IllegalArgumentException("A data vigencia não pode ser nula.");
        }
        LocalDate hoje = LocalDate.now();              //cria a data de hoje como parametro para a condicao
        if (dataVigencia.isAfter(hoje)) {                //Verifica se a data esta no passado
            throw new IllegalArgumentException("A data vigencia não pode ser no passado.");
        }
        this.dataVigencia = dataVigencia;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo == null) {                           //Verifica se o valor eh nula
            throw new IllegalArgumentException("O titulo não pode ser nulo.");
        }
        this.titulo = titulo;
    }

    public Situacaoatual getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacaoatual situacao) {
        if (situacao == null) {                         //Verifica se a variavel eh nula
            throw new IllegalArgumentException("A situacao não pode ser nula.");
        }
        this.situacao = situacao;
    }
    
}