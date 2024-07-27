package models.entity;

public class Relatorio {

    private String descricao;
    private ProjetoExtensao projeto;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public ProjetoExtensao getProjeto() {
        return projeto;
    }
    public void setProjeto(ProjetoExtensao projeto) {
        this.projeto = projeto;
    }

    
}