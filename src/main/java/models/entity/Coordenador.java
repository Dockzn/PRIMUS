package models.entity;
import java.util.List;

public class Coordenador extends Professor{
    // ATRIBUTOS //
    private List<ProjetoExtensao> projetosCoordenados;
   
    /*CONSTRUTOR */
    
    public Coordenador(String nome, String email, String SIAPE, List<ProjetoExtensao> projetosCoordenados) {
        super(nome, email, SIAPE);
        this.projetosCoordenados = projetosCoordenados;
    }
    
    /*GETTERS E SETTERS */
    public List<ProjetoExtensao> getProjetosCoordenados() {
    return projetosCoordenados;
    }
    public void setProjetosCoordenados(List<ProjetoExtensao> projetosCoordenados) {
    this.projetosCoordenados = projetosCoordenados;
    }
}


/*DK*/