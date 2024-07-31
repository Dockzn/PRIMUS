package models.entity;
import java.sql.Date;
import java.util.List;

public class Documento {
    
/**
 * A classe Documento é responsável por receber arquivos anexados, enviados por Membros e Coordenadores, e posteriormente guardá-los 
 * na classe Documentação.
 */

    //ATRIBUTOS//
    private String descricao, arquivos; //CRIAR CLASSE ARQUIVO NO JAVA PARA RECEBER ANEXOS
    private Date dataPublicacao;
    private String membroResponsavel;
    private List<Membro> historico;



    
    //CONSTRUTOR//
    public Documento(String descricao, String arquivos, Date dataPublicacao, String membroResponsavel,List<Membro> historico) {
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

    // descricao do documento
    public void setDescricao(String descricao) {
        if(descricao != null) 
            this.descricao = descricao;
    }

    public String getArquivos() {
        return arquivos;
    }


    // setter de arquivos para serem inseridos como anexo
    public void setArquivos(String arquivos) {
        if(arquivos != null) 
            this.arquivos = arquivos;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    //setter da data de publicacao
    public void setDataPublicacao(Date dataPublicacao) {
        if(dataPublicacao != null) 
            this.dataPublicacao = dataPublicacao;
    }

    public String getMembroResponsavel() {
        return membroResponsavel;
    }

    //settar membro responsavel
    public void setMembroResponsavel(String membroResponsavel) {
        if(membroResponsavel != null) 
            this.membroResponsavel = membroResponsavel;
    }

    public List<Membro> getHistorico() {
        return historico;
    }
    public void setHistorico(List<Membro> historico) {
        this.historico = historico;
    }
    
    
}
