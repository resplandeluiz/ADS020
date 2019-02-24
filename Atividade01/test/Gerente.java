
public class Gerente extends Funcionario{
    
    private double bonus;

    public double getBonus() { return bonus;}

    public void setBonus(double bonus) {this.bonus = bonus;}
    
    public Gerente(int matricula, String nome, int sexo ,double salario,double bonus){
            
            super(matricula,nome,sexo,salario);
            this.bonus = bonus;
            
    }
    
    @Override
    public double getSalario(){        
        return salario+bonus;        
    }
    
}
