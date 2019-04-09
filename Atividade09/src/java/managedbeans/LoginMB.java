/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import static java.lang.System.console;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author 17114290048
 */
@ManagedBean
@RequestScoped
public class LoginMB {

    /**
     * Creates a new instance of LoginMB
     */
    private String matricula;
    private String senha;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LoginMB() {
    }

    public String entrar() {
       
        matricula = this.getMatricula();
        senha = this.getSenha();
        
        if (matricula.equals("2019000") && senha.equals("123456")) {
            return "index";
        } else {
            
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage mensagem = new FacesMessage("Login inválido!");
            context.addMessage(null, mensagem);
            return "Login inválido!";
        }
    }
}
