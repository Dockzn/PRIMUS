package models.entity;
import java.util.List;

/*
 * É uma classe que faz herança à classe membro , onde ele tem como atributo a mais o relatório BIA , entregue uma vez ao mês.
 * Tendo todas as permissões de Membro do Projeto.
 */



//virar atributo
public class Bolsista extends Membro {

    //ATRIBUTOS//
    private String relatorioBIA;    
    //CONSTRUTOR//
    public Bolsista(String nome, String email, String cargo, String matricula, String curso,
            List<Atividade> atividades, String relatorioBIA) {
                super(nome, email, cargo, matricula, curso, atividades);
                this.relatorioBIA = relatorioBIA;
        
    }
    public String getRelatorioBIA() {
        return relatorioBIA;
    }
    // Se relatorio BIA for diferente de nulo
    public void setRelatorioBIA(String relatorioBIA) {
        if(relatorioBIA != null) 
            this.relatorioBIA = relatorioBIA;
    }
    
}
