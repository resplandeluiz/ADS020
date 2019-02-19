
public class TesteGerente {
    
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente(1711,"Resplande",Funcionario.SEXO_MASCULINO,1950.40,350.47);
        Funcionario funcionario = new Funcionario(1711,"Resplande",Funcionario.SEXO_MASCULINO,1950.40);
        System.out.println(funcionario);
        
    }
    
}
