package models.repository;
import java.util.List;

import models.entity.Coordenador;
;

public class CoordenadorDAO {

    /**
     * Busca um coordenador no sistema pelo seu SIAPE.
     * @param siape O SIAPE do coordenador a ser buscado.
     * @return O coordenador correspondente ao SIAPE fornecido, ou null se não encontrado.
     */
    public Coordenador buscarCoordenadorPorSiape(String siape) {
        return null;
    }
    
    /**
     * Lista todos os coordenadores cadastrados no sistema.
     * @return Uma lista de todos os coordenadores.
     * @throws UnsupportedOperationException Se o método ainda não estiver implementado.
     */
    public List<Coordenador> listarCoordenadores() {
        throw new UnsupportedOperationException("Unimplemented method 'listarCoordenadores'");
    }

    /**
     * Adiciona um novo coordenador ao sistema.
     * @param coordenador O coordenador a ser adicionado.
     * @throws UnsupportedOperationException Se o método ainda não estiver implementado.
     */
    public void adicionarCoordenador(Coordenador coordenador) {
        throw new UnsupportedOperationException("Unimplemented method 'adicionarCoordenador'");
    }

    /**
     * Remove um coordenador do sistema.
     * @param coordenador O coordenador a ser removido.
     * A ser implementado.
     */
    public void removerCoordenador(Coordenador coordenador){
       /* A ser implementado */ 
    }

    /**
     * Edita os dados de um coordenador no sistema.
     * @param coordenador O coordenador cujos dados serão editados.
     * A ser implementado.
     */
     public void editarCoordenador(Coordenador coordenador){
        /* A ser implementado */ 
     }
}
