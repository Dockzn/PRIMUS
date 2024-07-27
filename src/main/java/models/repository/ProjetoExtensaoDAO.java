package models.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import models.entity.Coordenador;
import models.entity.ProjetoExtensao;
import models.entity.Sala;

public class ProjetoExtensaoDAO {
    public void cadastrar(String titulo, Date dataVigencia, String publicoAlvo, ArrayList<String> palavraChave, 
    String website, String contato, boolean situacaoAtual, ArrayList<String> vinculosAcoesExtensao,
    Sala salaProjeto, ArrayList<String> areasAtuacao, ArrayList<String> atividades,
    ArrayList<String> noticia, ArrayList<String> presencaMembros, ArrayList<String> relatorios, 
    double financiamento, Coordenador coordenador, ArrayList<String> membros) throws SQLException {


    }

    public void gerarRelatorioAnual(String descricao, ProjetoExtensao projeto) throws SQLException {
        

    }
}
