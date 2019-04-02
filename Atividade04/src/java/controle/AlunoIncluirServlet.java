/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

/**
 *
 * @author 17114290048
 */
@WebServlet(name = "AlunoIncluirServlet", urlPatterns = {"/aluno/incluir"})
public class AlunoIncluirServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html;charset=UTF-8");
       // PrintWriter out = response.getWriter();
        request.getRequestDispatcher("/WEB-INF/visao/incluir_aluno.jsp").forward(request, response);
        
        
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Cadastro de Alunos</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Incluir Aluno</h1>");
//        out.println("<form action=\"" + request.getContextPath() + "/aluno/incluir\" method=\"post\">");
//        out.println("<div>");
//        out.println("<label>Matrícula:</label>");
//        out.println("<input type=\"text\" name=\"matricula\" size=\"15\">");
//        out.println("</div>");
//        out.println("<div>");
//        out.println("<label>Nome:</label>");
//        out.println("<input type=\"text\" name=\"nome\" size=\"30\">");
//        out.println("</div>");
//        out.println("<input type=\"submit\" value=\"Salvar\"/>");
//        out.println("<a href=\"" + request.getContextPath() + "/aluno\">Desistir</a>");
//        out.println("</form>");
//        out.println("</body>");
//        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Aluno aluno = new Aluno();
        aluno.setMatricula(Integer.parseInt(request.getParameter("matricula")));
        aluno.setNome(request.getParameter("nome"));

        AlunoBO bo = new AlunoBO();

        try {
            bo.incluir(aluno);
        } catch (NegocioException e) {
            throw new ServletException("", e);
        }
        
        response.sendRedirect(request.getContextPath()+"/aluno");
    }

}
