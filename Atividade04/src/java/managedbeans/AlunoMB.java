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
    
    
    private String nome;
    private String senha;
    private String matricula;   

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
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
    
    
    public String incluir(){
        
        return "incluir";
    
    }
    
    public String salvar() throws NegocioException{
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(Integer.parseInt(this.getMatricula()));
        aluno.setNome(this.getNome());
        System.out.println(aluno);

        AlunoBO bo = new AlunoBO();

        try {
            bo.incluir(aluno);
        } catch (NegocioException e) {
            throw new NegocioException("", e);
        }
        
        return "index";
    
        
    }
    
    
}
