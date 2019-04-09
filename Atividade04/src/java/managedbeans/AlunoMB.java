/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import controle.ListarAlunoServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

/**
 *
 * @author 17114290048
 */
@ManagedBean
@RequestScoped
public class AlunoMB {

    /**
     * Creates a new instance of AlunoMB
     */
    public AlunoMB() {
    }
    
    public List<Aluno> listar() {
        
        List< Aluno> lista = new ArrayList<Aluno>();
        AlunoBO bo = new AlunoBO();
        
        try {
            lista = bo.listar();
        } catch (NegocioException ex) {
            Logger.getLogger(ListarAlunoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return lista;
    
    }
    
}
