package models.entity;
import java.sql.Date;

public class Documento {
    //ATRIBUTOS//
    private String descricao;
    private String arquivos;
    private Date dataPublicacao;
    private String membroResponsavel;
    private String historico;
    
    //CONSTRUTOR//
    public Documento(String descricao, String arquivos, Date dataPublicacao, String membroResponsavel,
            String historico) {
        this.descricao = descricao;
        this.arquivos = arquivos;
        this.dataPublicacao = dataPublicacao;
        this.membroResponsavel = membroResponsavel;
        this.historico = historico;
    }
    
    //GETTERS E SETTERS//
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getArquivos() {
        return arquivos;
    }

    public void setArquivos(String arquivos) {
        this.arquivos = arquivos;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getMembroResponsavel() {
        return membroResponsavel;
    }

    public void setMembroResponsavel(String membroResponsavel) {
        this.membroResponsavel = membroResponsavel;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    
}
