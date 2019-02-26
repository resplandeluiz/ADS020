
public class TestaEmpresa {
    
    
    public static void main(String[] args) {
       
        Empresa empresa = new Empresa(10); 
        
       
      empresa.contratarFuncionario(new Funcionario(1711,"Luiz",Funcionario.SEXO_MASCULINO,1225.40));
      empresa.contratarFuncionario(new Funcionario(1722,"Manoel",Funcionario.SEXO_MASCULINO,1225.40));
      empresa.contratarFuncionario(new Funcionario(1645,"Luz",Funcionario.SEXO_MASCULINO,1225.40));
      empresa.contratarFuncionario(new Funcionario(1900,"Clara",Funcionario.SEXO_FEMININO,1225.40));
        
      empresa.contratarFuncionario(new Gerente(1711,"Resplande",Funcionario.SEXO_MASCULINO,1950.40,355));
      empresa.contratarFuncionario(new Gerente(1710,"Luana",Funcionario.SEXO_FEMININO,2500.40,355));
       
      empresa.exibirFolhaPagamento();
        
        
    }
    
    
    
    
    
    
    
    
}
