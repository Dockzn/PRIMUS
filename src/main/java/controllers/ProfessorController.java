package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.entity.Professor;
import models.repository.ProfessorDAO;

@WebServlet("/ProfessorController")
public class ProfessorController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProfessorDAO professorDAO;

    public ProfessorController() {
        super();
        this.professorDAO = new ProfessorDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Professor> professores = null;
        try {
            professores = professorDAO.listarProfessores();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("professores", professores);
        request.getRequestDispatcher("/views/list-professores.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String siape = request.getParameter("siape");

        Professor professor = new Professor(nome, email, siape);
        try {
            professorDAO.adicionarProfessor(professor);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("ProfessorController");
    }
}
