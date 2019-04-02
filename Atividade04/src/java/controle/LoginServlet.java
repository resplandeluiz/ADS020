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
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author 17114290048
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            
        //request.setAttribute("lista", lista);
        
        request.getRequestDispatcher("/WEB-INF/visao/login_aluno.jsp").forward(request, response);
            
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
   }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sistema Acadêmico</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Efetuar Login</h1>");
        out.println("<form action='"+ request.getContextPath()+"/login' method='post'>");
        out.println("<div>");
        out.println("<label>Matrícula:</label>");
        out.println("<input type='text' name='matricula' size='15' value=''>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label>Senha:</label>");
        out.println("<input type='password' name='senha' size='15' value=''>");
        out.println("</div>");
        out.println("<input type='submit' value='Entrar'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("senha");
        
        if ( matricula.isEmpty() || senha.isEmpty() ){
            
             response.sendRedirect( request.getContextPath() + "/login" );
            
        }else {
            
            HttpSession sessao = request.getSession();
            sessao.setAttribute("autenticado", true);
            response.sendRedirect( request.getContextPath() + "/aluno" );
        }
        
    }
        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
