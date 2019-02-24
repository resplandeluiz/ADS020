
public class Gerente extends Funcionario{
    
    private double bonus;
    
    public Gerente(int matricula, String nome, int sexo ,double salario,double bonus){
            
            super(matricula,nome,sexo,salario);
            this.bonus = bonus;
            
    }
    
    @Override
    public double getSalario(){        
        return this.getSalario() + bonus;        
    }
    
}
