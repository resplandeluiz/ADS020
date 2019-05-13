/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade16;

import dao.ContatoDAO;
import entidades.Contato;

public class Atividade16 {

    
    public static void main(String[] args) {
    
        ContatoDAO dao = new ContatoDAO();
        Contato contato = dao.find(1L);
        System.out.println(contato);
        

        
    }
    
}
