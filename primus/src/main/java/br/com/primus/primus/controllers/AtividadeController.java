// package controllers;

// import models.entity.Atividade;
// import models.entity.AtividadeComplexidade;
// import models.entity.AtividadeStatus;
// import models.repository.AtividadesDAO;

// import java.io.IOException;
// import java.sql.SQLException;
// import java.time.LocalDate;
// import java.util.List;





// @WebServlet("/AtividadeController")
// public class AtividadeController extends HttpServlet {
//     private static final long serialVersionUID = 1L;
//     private AtividadesDAO atividadeDAO;

//     public AtividadeController() {
//         super();
//         this.atividadeDAO = new AtividadesDAO();
//     }

//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         List<Atividade> atividades = null;
//         try {
//             atividades = atividadeDAO.listarAtividades();
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         request.setAttribute("atividades", atividades);
//         request.getRequestDispatcher("/views/list-atividades.jsp").forward(request, response);
//     }

//     @Override
//     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         String nome = request.getParameter("nome");
//         String responsavel = request.getParameter("responsavel");
//         String comentario = request.getParameter("comentario");
//         String tags = request.getParameter("tags");
//         String sala = request.getParameter("sala");
//         LocalDate dataCriacao = LocalDate.now();
//         AtividadeComplexidade complexidade = AtividadeComplexidade.valueOf(request.getParameter("complexidade"));
//         int horas = Integer.parseInt(request.getParameter("horas"));
//         AtividadeStatus status = AtividadeStatus.valueOf(request.getParameter("status"));
        
//         Atividade atividade = new Atividade(nome, responsavel, comentario, tags, sala, dataCriacao, complexidade, horas, status);
//         try {
//             atividadeDAO.adicionarAtividade(atividade);
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         response.sendRedirect("AtividadeController");
//     }
// }
