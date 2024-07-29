package models.entity;
import java.util.List;

public class Membro extends Aluno{

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

    public void setAtividades(Atividade atividade) {
        if (atividade == null) {                           //Verifica se a atividade eh nula
            throw new IllegalArgumentException("A atividade nao pode ser nula.");
        }
        else{
            atividades.add(atividade);
        }
    }
}
