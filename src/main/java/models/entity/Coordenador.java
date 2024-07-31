package models.entity;
import java.util.List;

public class Coordenador extends Professor {
/*
 * Coordenador tem todos os acessos de um Membro , mas também pode adicionar membros no projeto com um botão exibido na tela de adicionar membro , onde mostrará uma lista dos alunos
 * cadastrados no site , e poderá adicionar um desses alunos para o projeto. Também tem total controle sobre os membros do projeto,
 * onde ele pode adicionar , remover , editar e ler membro. Ele pode adicionar projetos de extensão , no seu atributo ,
 * dos quais ele coordena , como também pode remover. Realiza uma herança da classe Professor.
 */






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
        if (projetosCoordenados != null) this.projetosCoordenados = projetosCoordenados;
    }
}


/*DK*/