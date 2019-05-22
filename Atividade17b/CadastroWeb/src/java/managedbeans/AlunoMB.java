/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import ejbs.AlunoFacade;
import entities.Aluno;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author 17114290048
 */
@Named(value = "alunoMB")
@SessionScoped
public class AlunoMB implements Serializable {

    @EJB
    private AlunoFacade alunoFacade;
    
    private Aluno aluno = new Aluno();
  

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public AlunoMB() {
    }
    
    
    public List<Aluno> listar(){
        
        return alunoFacade.findAll();
    
    }
    
}
