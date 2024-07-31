package models.entity;
import java.util.List;

public class Membro extends Aluno {

/**
 * A classe Membro herda atributos da classe Aluno que são importantes para o sistema. Embora Membro não possua métodos próprios, 
 * ele tem acesso a maioria dos métodos de outras classes, permitindo executar diversas funções no site utilizando outras classes, 
 * como a classe Atividade, por exemplo.
 */

    //ATRIBUTOS//
    private List<Atividade> atividades;

    //CONSTRUTOR//
    public Membro(String nome, String email, String cargo, String matricula, String curso, List<Atividade> atividades) {
        super(nome, email, cargo, matricula, curso);
        this.atividades = atividades;
    }
    
    public List<Atividade> getAtividades() {
        return atividades;
    }
    
    public void setAtividades(List<Atividade> atividades) {
        if(atividades != null) this.atividades = atividades;
    }

}