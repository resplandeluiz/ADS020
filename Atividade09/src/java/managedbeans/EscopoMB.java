/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 17114290048
 */
@ManagedBean
@SessionScoped
public class EscopoMB {

    private int valor= 1;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String recarregar(){
        this.valor++;
        return "";
    }
    /**
     * Creates a new instance of EscopoMB
     */
    public EscopoMB() {
    }
    
}