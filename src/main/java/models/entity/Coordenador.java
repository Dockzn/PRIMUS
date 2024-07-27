package models.entity;
import java.util.ArrayList;
import java.util.List;

public class Coordenador {
    private List<ProjetoExtensao> projetosCoordenados;
    private String SIAPE;
   
    /*CONSTRUTOR */
    public Coordenador(String SIAPE) {
    this.SIAPE = SIAPE;
    this.projetosCoordenados = new ArrayList<>();
    }
    
    /*GETTERS E SETTERS */
    public List<ProjetoExtensao> getProjetosCoordenados() {
    return projetosCoordenados;
    }
    public void setProjetosCoordenados(List<ProjetoExtensao> projetosCoordenados) {
    this.projetosCoordenados = projetosCoordenados;
    }
    public String getSIAPE() {
    return SIAPE;
    }
    public void setSIAPE(String SIAPE) {
    this.SIAPE = SIAPE;
    }
}


/*DK*/