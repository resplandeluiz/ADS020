
package dao;

import entidades.Contato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

public class ContatoDAO {

    public void persist(Contato contatos) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("minhaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(contatos);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
    public Contato find(Long id){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("minhaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try {
            return em.find(Contato.class,id);            
        } catch (Exception e) {
            e.printStackTrace();            
        } finally {
            em.close();
        }
        return new Contato();       
       
    }

    public void remove(Contato contato){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("minhaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try {
            em.remove(contato);  
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();            
        } finally {
            em.close();
        }
           
       
    }
    
    public void merge(Contato contato){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("minhaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try {
            em.merge(contato);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();            
        } finally {
            em.close();
        }
           
       
    }
    
    
    public List<Contato> list(){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("minhaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try {
           CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Contato.class));
            return em.createQuery(cq).getResultList();     
        } catch (Exception e) {
            e.printStackTrace();            
        } finally {
            em.close();
        }
        return null;
    
    }
    
   
    
    
}
