/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17114290048
 */
public class Pessoa {
    
    public static int SEXO_MASCULINO  = 1;
    public static int SEXO_FEMININO = 2;
     
    private String Nome;
    private int Sexo;
    public String getNome() { return Nome; }
    public void setNome(String Nome) { this.Nome = Nome; }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

    

     public Pessoa(String Nome, int Sexo) {        
            this.Nome = Nome;
            this.Sexo = Sexo;
    }
    
    
    public static void main(String[] args) {
        
       Pessoa pessoa =  new Pessoa("Luiz Resplande",Pessoa.SEXO_MASCULINO);

    }
    
}
