
public class TestaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(1711,"Luiz Resplande",Funcionario.SEXO_MASCULINO,1500.50);
        
       // System.out.println("Nome  " + funcionario.getNome());
       // System.out.println("Matrícula  " + funcionario.getMatricula());
       // System.out.println("Sexo  " + funcionario.getSexo());
       // System.out.println("Salário  " + funcionario.getSalario());
        
        
        System.out.println(funcionario.toString());
        
        
        
    }
}
