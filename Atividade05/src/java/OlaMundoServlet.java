/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 17114290048
 */
@WebServlet(urlPatterns = {"/OlaMundoServlet"})
public class OlaMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        String nome = request.getParameter("nome");
        if (nome != null && nome.isEmpty() == false) {
            out.println("<h1>Olá " + nome + "!</h1>");
        } else {
            out.println("<h1>Olá Mundo!</h1>");
        }
                out.println("<a href=" + response.encodeURL(request.getContextPath()+"/index.jsp") + ">Voltar</a>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
    

}
