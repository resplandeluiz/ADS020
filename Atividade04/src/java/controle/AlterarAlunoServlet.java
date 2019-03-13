/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AlterarAlunoServlet", urlPatterns = {"/aluno/alterar"})
public class AlterarAlunoServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
            
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Aluno aluno = new Aluno();
        int id = Integer.parseInt(request.getParameter("id"));
        
        AlunoBO bo = new AlunoBO();
        try {
            bo.consultar(id);
        } catch (NegocioException ex) {
            
            Logger.getLogger(AlterarAlunoServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
       out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("<title>Cadastro de Alunos</title>");
       out.println("</head>");
       out.println("<body>");
       out.println("<h1>Alterar Aluno</h1>");
       out.println("<form action=\""+ request.getContextPath() +"/aluno/alterar\" method=\"post\">");
       out.println("<input type=\"hidden\" name=\"id\" value=\"\"/>");
       out.println("<div>");
       out.println("<label>Matrícula:</label>");
       out.println("<input type=\"text\" name=\"matricula\" size=\"15\" value=\"\">");
       out.println("</div>");          	
        out.println("<div>");
	out.println("<label>Nome:</label>");
        out.println("<input type=\"text\" name=\"nome\" size=\"30\" value=\"\">");
	out.println("</div>");		
        out.println("<input type=\"submit\" value=\"Salvar\"/>");
        out.println("<a href=\""+ request.getContextPath() +"/aluno/listar\">Desistir</a>");
	out.println("</form>");
        out.println("</body>");
        out.println("</html>");
		
  
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
            
    }

    

}
