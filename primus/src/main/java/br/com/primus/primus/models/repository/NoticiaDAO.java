package br.com.primus.primus.models.repository;
import br.com.primus.primus.models.entity.Noticia;
import java.util.ArrayList;
import java.util.List;

public class NoticiaDAO {

    // Lista para armazenar as notícias
    private List<Noticia> noticias;

    public NoticiaDAO() {
        noticias = new ArrayList<>();
    }

    // Método para criar uma nova notícia
    public void criarNoticia(String titulo, String descricao) {
        Noticia noticia = new Noticia(titulo, descricao);
        noticias.add(noticia);
        System.out.println("Notícia criada com sucesso: " + titulo);
    }

    // Método para deletar uma notícia com base no título
    public boolean deletarNoticia(String titulo) {
        for (Noticia noticia : noticias) {
            if (noticia.getTitulo().equalsIgnoreCase(titulo)) {
                noticias.remove(noticia);
                System.out.println("Notícia deletada com sucesso: " + titulo);
                return true;
            }
        }
        System.out.println("Notícia não encontrada: " + titulo);
        return false;
    }

    // Método para atualizar uma notícia com base no título
    public boolean atualizarNoticia(String titulo, String novoTitulo, String novaDescricao) {
        for (Noticia noticia : noticias) {
            if (noticia.getTitulo().equalsIgnoreCase(titulo)) {
                noticia.setTitulo(novoTitulo);
                noticia.setDescricao(novaDescricao);
                System.out.println("Notícia atualizada com sucesso: " + novoTitulo);
                return true;
            }
        }
        System.out.println("Notícia não encontrada: " + titulo);
        return false;
    }

    // Método para acessar uma notícia com base no título
    public Noticia acessarNoticia(String titulo) {
        for (Noticia noticia : noticias) {
            if (noticia.getTitulo().equalsIgnoreCase(titulo)) {
                return noticia;
            }
        }
        System.out.println("Notícia não encontrada: " + titulo);
        return null;
    }
    
    // Método para listar todas as notícias
    public List<Noticia> listarNoticias() {
        return noticias;
    }
}
