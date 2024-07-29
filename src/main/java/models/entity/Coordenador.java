package models.entity;
import java.util.List;

public class Coordenador extends Professor{
    // ATRIBUTOS //
    private List<ProjetoExtensao> projetosCoordenados;
   
    /*CONSTRUTOR */
    
    public Coordenador(String nome, String email, String SIAPE) {
        super(nome, email, SIAPE);
    }
    
    /*GETTERS E SETTERS */
    public List<ProjetoExtensao> getProjetosCoordenados() {
        return projetosCoordenados;
    }
    public void setProjetosCoordenados(ProjetoExtensao projeto) {
        if(projeto != null) 
            projetosCoordenados.add(projeto);
    }
}


/*DK*/