/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;

/**
 *
 * @author 17114290048
 */
public class Aluno implements Serializable {
    
    int id; 
    int matricula;
    String nome;

    public int getId() {   return id;  }
    public void setId(int id) {   this.id = id;  }

    public int getMatricula() { return matricula;  }
    public void setMatricula(int matricula) {  this.matricula = matricula;  }

    public String getNome() { return nome; }
    public void setNome(String nome) {  this.nome = nome;  }
    
}