/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

@WebServlet(name = "ListarAlunoServlet", urlPatterns = {"/aluno"})
public class ListarAlunoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List< Aluno> lista = new ArrayList<Aluno>();
        AlunoBO bo = new AlunoBO();

        try {
            lista = bo.listar();
        } catch (NegocioException e) {

            throw new ServletException("", e);

        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro de Alunos</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Listagem de Alunos</h1>");
        out.println("<a href='" + request.getContextPath()+"/aluno/incluir" + "'>Incluir</a>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>Matrícula</th>");
        out.println("<th>Nome</th>");
        out.println("<th>Ações</th>");
        
        for (Aluno aluno : lista) {
            out.println("<tr>");
            out.println("<td>" + aluno.getMatricula() + "</td>");
            out.println("<td>" + aluno.getNome() + "</td>");
            out.println("<td><a href='" + response.encodeURL("/Atividade04/aluno/alterar?id=") + aluno.getId() + "'>Alterar</a>");
            out.println("<a href=''>Excluir</a></td>");
            out.println("</tr>");
        }

        out.println("</tr>");
        out.println("</table>");      
        out.println("<table>");
        out.println("</body>");
        out.println("</html>");
        out.println("</tr>");
        out.println("</table>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        throw new ServletException("Método não suportado");
    }

}
