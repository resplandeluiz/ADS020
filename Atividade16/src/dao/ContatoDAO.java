
package dao;

import entidades.Contato;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

public class ContatoDAO {
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("minhaPU");
     private EntityManager em = emf.createEntityManager();
     
     
    public void persist(Contato contatos) {
       
        em.getTransaction().begin();
        try {
            em.persist(contatos);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    
    public Contato find(Long id){       
        
        try {
            return em.find(Contato.class,id);            
        } catch (Exception e) {
        } 
        return new Contato();       
       
    }

    public void remove(Contato contato){      
       em.getTransaction().begin();        
        try {
            em.remove(contato);  
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Deu ruim!"+ e.getMessage());
            em.getTransaction().rollback();
        } 
       
    }
    
    public void merge(Contato contato){
        em.getTransaction().begin();
        
        try {
            em.merge(contato);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Deu ruim!"+ e.getMessage());
            em.getTransaction().rollback();
        } 
           
       
    }
    
    
    public List<Contato> list(){
        List<Contato> lista = new ArrayList<>();
       
        
        try {
           CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Contato.class));
            lista = em.createQuery(cq).getResultList();
        } catch (Exception e) {
            
            System.err.println("Deu ruim!"+ e.getMessage());
            
        } 
        return lista;
    
    }
    
   
    
    
}
