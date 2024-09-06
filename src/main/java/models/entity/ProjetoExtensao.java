package models.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * A classe ProjetoExtensao é uma das mais importantes do nosso sistema, pois nela ocorrerá a maior parte do controle e organização 
 * que nosso sistema promete. A maioria dos métodos dessa classe será utilizada pelos usuários (Coordenadores e Membros), mas 
 * somente os Coordenadores terão acesso quase absoluto sobre ela.
 */
public class ProjetoExtensao {

    private List<String> membros = new ArrayList<>(), /*Deveria ser lista de membro? */
        relatorios = new ArrayList<>(),
        noticias = new ArrayList<>(),
        atividades = new ArrayList<>(),
        areasAtuacao = new ArrayList<>(),
        salas = new ArrayList<>();
    private Coordenador coordernador;
    private Date dataVigencia;
    private String titulo;
    private ProjetoEstado estado;

    public ProjetoExtensao(Coordenador coordernador, Date dataVigencia, String titulo, ProjetoEstado estado) {
        this.coordernador = coordernador;
        this.dataVigencia = dataVigencia;
        this.titulo = titulo;
        this.estado = estado;
    }

    public List<String> getMembros() {
        return membros;
    }

    public void setMembros(List<String> membros) {
        if (membros != null) this.membros = membros;
    }

    public List<String> getRelatorios() {
        return relatorios;
    }

    public void setRelatorios(List<String> relatorios) {
        if (relatorios != null) this.relatorios = relatorios;
    }

    public List<String> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<String> noticias) {
        if (noticias != null) this.noticias = noticias;
    }

    public List<String> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<String> atividades) {
        this.atividades = atividades;
    }

    public List<String> getAreasAtuacao() {
        return areasAtuacao;
    }

    public void setAreasAtuacao(List<String> areasAtuacao) {
        if (areasAtuacao != null) this.areasAtuacao = areasAtuacao;
    }

    public List<String> getSalas() {
        return salas;
    }

    public void setSalas(List<String> salas) {
        if (salas != null) this.salas = salas;
    }

    public Coordenador getCoordernador() {
        return coordernador;
    }

    public void setCoordernador(Coordenador coordernador) {
        if (coordernador != null) this.coordernador = coordernador;
    }

    public Date getDataVigencia() {
        return dataVigencia;
    }

    public void setDataVigencia(Date dataVigencia) {
        if (dataVigencia != null) this.dataVigencia = dataVigencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) this.titulo = titulo;
    }

    public ProjetoEstado getEstado() {
        return estado;
    }

    public void setEstado(ProjetoEstado estado) {
        if (estado != null) this.estado = estado;
    }
}
