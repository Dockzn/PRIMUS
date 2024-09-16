package br.com.primus.primus.models.repository;
import java.util.ArrayList;
import java.util.List;
import br.com.primus.primus.models.entity.Membro;
import br.com.primus.primus.models.entity.Bolsista;

public class BolsistaDAO {

    private List<Membro> membros = new ArrayList<>();
    private List<Bolsista> bolsistas = new ArrayList<>();

    
    public void virarBolsista(Membro membro, String relatorioBIA) {
        if (membro == null) {
            System.out.println("Membro inválido.");
            return;
        }

        if (isBolsista(membro)) {
            System.out.println("O membro '" + membro.getNome() + "' já é bolsista.");
            return;
        }

        Bolsista novoBolsista = new Bolsista(membro.getNome(), membro.getEmail(), membro.getCargo(), 
                                             membro.getMatricula(), membro.getCurso(), relatorioBIA);
        bolsistas.add(novoBolsista);
        membros.remove(membro);
        System.out.println("O membro '" + membro.getNome() + "' agora é bolsista.");
    }

    public void deixarDeSerBolsista(Bolsista bolsista) {
        if (bolsista == null) {
            System.out.println("Bolsista inválido.");
            return;
        }

        Membro novoMembro = new Membro(bolsista.getNome(), bolsista.getEmail(), bolsista.getCargo(), 
                                       bolsista.getMatricula(), bolsista.getCurso());
        membros.add(novoMembro);
        bolsistas.remove(bolsista);
        System.out.println("O bolsista '" + bolsista.getNome() + "' deixou de ser bolsista e agora é membro.");
    }

    private boolean isBolsista(Membro membro) {
        for (Bolsista bolsista : bolsistas) {
            if (bolsista.getMatricula().equals(membro.getMatricula())) {
                return true;
            }
        }
        return false;
    }

    public List<Bolsista> listarBolsistas() {
        return bolsistas;
    }

    public List<Membro> listarMembros() {
        return membros;
    }

    public void adicionarMembro(Membro membro) {
        if (membro != null) {
            membros.add(membro);
            System.out.println("Membro '" + membro.getNome() + "' adicionado com sucesso.");
        }
    }
}
