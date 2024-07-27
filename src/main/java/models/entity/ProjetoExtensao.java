package models.entity;
import java.util.ArrayList;
import java.util.Date;

public class ProjetoExtensao {

    // ATRIBUTOS 
    
    private String titulo;
    private Date dataVigencia;
    private String publicoAlvo;
    private ArrayList<String> palavraChave = new ArrayList<>();
    private String website;
    private String contato;
    private boolean situacaoAtual;

    private ArrayList<String> vinculosAcoesExtensao = new ArrayList<>();
    private ArrayList<String> salaProjeto = new ArrayList<>();
    private ArrayList<String> areasAtuacao = new ArrayList<>();
    private ArrayList<String> atividades = new ArrayList<>();
    private ArrayList<String> noticia = new ArrayList<>();
    private ArrayList<String> presencaMembros = new ArrayList<>();
    private ArrayList<String> relatorios = new ArrayList<>();
    private Coordenador coordernador;
    private ArrayList<String> membros = new ArrayList<>();

    //GETTERS E SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataVigencia() {
        return dataVigencia;
    }

    public void setDataVigencia(Date dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public boolean isSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(boolean situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }
}

    
