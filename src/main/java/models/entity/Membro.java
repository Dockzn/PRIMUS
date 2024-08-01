package models.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Membro herda atributos da classe Aluno que são importantes para o sistema. Embora Membro não possua métodos próprios, 
 * ele tem acesso a maioria dos métodos de outras classes, permitindo executar diversas funções no site utilizando outras classes, 
 * como a classe Atividade, por exemplo.
 */
public class Membro extends Aluno {

    private List<Atividade> atividades = new ArrayList<>();

    public Membro(String nome, String email, String cargo, String matricula, String curso) {
        super(nome, email, cargo, matricula, curso);
    }
    
    public List<Atividade> getAtividades() {
        return atividades;
    }
    
    public void setAtividades(List<Atividade> atividades) {
        if(atividades != null) this.atividades = atividades;
    }

}
