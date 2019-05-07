package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ejb.CarrinhoCompraLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 17114290048
 */
@WebServlet(urlPatterns = {"/carrinho/adicionar"})
public class AdicionarItemCarrinhoServlet extends HttpServlet {

    private CarrinhoCompraLocal carrinho;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        carrinho = (CarrinhoCompraLocal) request.getSession().getAttribute("ejb_stateful");
        
        if (carrinho == null) {
            try {
                Context contexto = new InitialContext();
                carrinho = (CarrinhoCompraLocal) contexto.lookup("java:global/Atividade15/Atividade15-ejb/CarrinhoCompraStateful!ejb.CarrinhoCompraLocal");
            } catch (NamingException e) {
                throw new ServletException(e);
            }
            request.getSession().setAttribute("ejb_stateful", carrinho);
        }

        String item = (String) request.getParameter("item");

        carrinho.adicionarItem(item);

        List<String> lista = carrinho.listarItens();

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            if (lista.isEmpty()) {
                out.println("<p>Nenhum adicionado ao carrinho</p>");
            }

            for (String listaItem : lista) {
                out.println("<p>" + listaItem + "</p>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
