
public class Funcionario extends Pessoa{
    
    
    
    private int matricula;    
    private double salario;

    public int getMatricula() { return matricula;}
    public void setMatricula(int matricula) { this.matricula = matricula; }   

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    
    
    public Funcionario(int matricula, String nome, int sexo ,double salario){
            
            super(nome,sexo);
            this.matricula = matricula;        
            this.salario = salario;
            
    }

    
    public String toString() {        
        return "Funcionário{matrícula="+ matricula + ", nome=" + this.getNome() + ", sexo="  + this.getSexo() + ", salário=" + salario + "}";
    }
    
    
    
    
    
    
}
