package controllers;

import models.repository.BolsistaDAO;
import models.entity.Bolsista;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BolsistaController")
public class BolsistaController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BolsistaDAO bolsistaDAO;

    public BolsistaController() {
        super();
        this.bolsistaDAO = new BolsistaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Bolsista> bolsistas = null;
        try {
            bolsistas = bolsistaDAO.listarBolsistas();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("bolsistas", bolsistas);
        request.getRequestDispatcher("/views/list-bolsistas.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String cargo = request.getParameter("cargo");
        String matricula = request.getParameter("matricula");
        String curso = request.getParameter("curso");
        String relatorioBIA = request.getParameter("relatorioBIA");
        
        Bolsista bolsista = new Bolsista(nome, email, cargo, matricula, curso, relatorioBIA);
        try {
            bolsistaDAO.adicionarBolsista(bolsista);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("BolsistaController");
    }
}
