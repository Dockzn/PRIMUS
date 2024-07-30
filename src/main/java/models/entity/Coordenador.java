package models.entity;
import java.util.List;

public class Coordenador extends Professor {
    // ATRIBUTOS //
    private List<ProjetoExtensao> projetosCoordenados;
   
    /*CONSTRUTOR */
    
    public Coordenador(String nome, String email, String siape) {
        super(nome, email, siape);
    }
    
    /*GETTERS E SETTERS */
    public List<ProjetoExtensao> getProjetosCoordenados() {
        return projetosCoordenados;
    }
    
    public void setProjetosCoordenados(List<ProjetoExtensao> projetosCoordenados) {
        this.projetosCoordenados = projetosCoordenados;
    }

    /*
    public void adicionarProjeto(Projeto projeto) {
        this.projetosCoordenados.add(projeto);
    }
    */
}


/*DK*/