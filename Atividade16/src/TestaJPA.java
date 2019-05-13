
import dao.ContatoDAO;
import entidades.Contato;


public class TestaJPA {
    
    public static void main(String[] args) {
        
        ContatoDAO dao = new ContatoDAO();
        Contato contato = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();
        Contato contato4 = new Contato();
        
        contato.setNome("Luiz");
        contato.setTelefone("61 98270 7629");  
        
        contato2.setNome("Manoel");
        contato2.setTelefone("61 98270 7629"); 
        
        contato3.setNome("Resplande");
        contato3.setTelefone("61 98270 7629"); 
        
        contato3.setNome("Oliveira");
        contato3.setTelefone("61 98270 7629"); 
        
        dao.persist(contato);
        dao.persist(contato2);
        dao.persist(contato3);     
        
        
        contato.setNome("Naruto");
        dao.merge(contato);   
        
        
        dao.remove(contato2);
        
        System.out.println(dao.find(contato3.getId()));
        System.out.println(dao.list());
        
    }
    
}
