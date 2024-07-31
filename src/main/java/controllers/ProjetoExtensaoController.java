package controllers;

import models.entity.ProjetoExtensao;
import models.entity.Coordenador;
import models.entity.ProjetoEstado;
import models.repository.CoordenadorDAO;
import models.repository.ProjetoExtensaoDAO;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProjetoExtensaoController")
public class ProjetoExtensaoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProjetoExtensaoDAO projetoDAO;

    public ProjetoExtensaoController() {
        super();
        this.projetoDAO = new ProjetoExtensaoDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProjetoExtensao> projetos = null;
        try {
            projetos = projetoDAO.listarProjetos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("projetos", projetos);
        request.getRequestDispatcher("/views/list-projetos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String coordenadorSiape = request.getParameter("coordenador");
        Date dataVigencia = Date.valueOf(request.getParameter("dataVigencia"));
        String titulo = request.getParameter("titulo");
        ProjetoEstado estado = ProjetoEstado.valueOf(request.getParameter("estado"));

        CoordenadorDAO coordenadorDAO = new CoordenadorDAO();
        Coordenador coordenador = coordenadorDAO.buscarCoordenadorPorSiape(coordenadorSiape);

        ProjetoExtensao projeto = new ProjetoExtensao(coordenador, dataVigencia, titulo, estado);
        try {
            projetoDAO.adicionarProjeto(projeto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("ProjetoExtensaoController");
    }
}
