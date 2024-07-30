package models.entity;
import java.util.List;

//depois ver a questão do membro que ele só pode ser um aluno
public class Membro extends Aluno {

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
