/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 17114290048
 */
@WebServlet(urlPatterns = {"/CicloVidaServlet"})
public class CicloVidaServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Iniciando o Servlet!!");
    }

    @Override
    public void destroy() {
       System.out.println("Destruindo o Servlet!!");
    }

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
           System.out.println("Executando o Servlet!!");
    }

    
}
