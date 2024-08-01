package models.entity;

/**
 * Classe arquivo que serve para simbolizar os arquivos do sistema.
 */
public class Arquivo {
    
    private String nome, endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null) this.endereco = endereco;
    }
}
