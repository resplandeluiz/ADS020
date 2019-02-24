
public class Empresa {
    
    private Funcionario[] funcionariosArray;
    private int totalFuncionarios = 0;
    
    public Empresa(int tamanho){
        
        funcionariosArray = new Funcionario[tamanho];
            
    }
    
    public void contratarFuncionario(Funcionario funcionario){
        
        funcionariosArray[totalFuncionarios] = funcionario;        
        totalFuncionarios++;  
        
    }
    
    public void exibirFolhaPagamento(){
        
        int totalFolha = 0;
        
        for(int i=0; i < totalFuncionarios ; i++){
            
            System.out.println(i+"º "+funcionariosArray[i].getSalario());
            
        }
        
    
    }
    
    
}
