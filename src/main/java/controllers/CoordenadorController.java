package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.entity.Coordenador;
import models.repository.CoordenadorDAO;

@WebServlet("/CoordenadorController")
public class CoordenadorController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CoordenadorDAO coordenadorDAO;

    public CoordenadorController() {
        super();
        this.coordenadorDAO = new CoordenadorDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Coordenador> coordenadores = null;
        try {
            coordenadores = coordenadorDAO.listarCoordenadores();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("coordenadores", coordenadores);
        request.getRequestDispatcher("/views/list-coordenadores.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String siape = request.getParameter("siape");

        Coordenador coordenador = new Coordenador(nome, email, siape);
        try {
            coordenadorDAO.adicionarCoordenador(coordenador);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("CoordenadorController");
    }
}
