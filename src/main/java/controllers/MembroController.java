package controllers;

import models.entity.Membro;
import models.repository.MembroDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MembroController")
public class MembroController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private MembroDAO membroDAO;

    public MembroController() {
        super();
        this.membroDAO = new MembroDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Membro> membros = null;
        try {
            membros = membroDAO.listarMembros();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("membros", membros);
        request.getRequestDispatcher("/views/list-membros.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String cargo = request.getParameter("cargo");
        String matricula = request.getParameter("matricula");
        String curso = request.getParameter("curso");
        Membro membro = new Membro(nome, email, cargo, matricula, curso);
        membro.setNome(nome);
        membro.setEmail(email);
        try {
            membroDAO.adicionarMembro(membro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("MembroController");
    }
}
