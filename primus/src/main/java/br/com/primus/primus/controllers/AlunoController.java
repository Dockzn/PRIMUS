// package controllers;

// import models.entity.Aluno;
// import models.repository.AlunoDAO;

// import java.io.IOException;
// import java.sql.SQLException;
// import java.util.List;


// public class AlunoController extends HttpServlet {
//     private static final long serialVersionUID = 1L;
//     private AlunoDAO alunoDAO;

//     public AlunoController() {
//         super();
//         this.alunoDAO = new AlunoDAO();
//     }

//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         List<Aluno> alunos = null;
//         try {
//             alunos = alunoDAO.listarAlunos();
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         request.setAttribute("alunos", alunos);
//         request.getRequestDispatcher("/views/list-alunos.jsp").forward(request, response);
//     }

//     @Override
//     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         String nome = request.getParameter("nome");
//         String email = request.getParameter("email");
//         String cargo = request.getParameter("cargo");
//         String matricula = request.getParameter("matricula");
//         String curso = request.getParameter("curso");
//         Aluno aluno = new Aluno(nome, email, cargo, matricula, curso);
//         try {
//             alunoDAO.adicionarAluno(aluno);
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         response.sendRedirect("AlunoController");
//     }
// }
