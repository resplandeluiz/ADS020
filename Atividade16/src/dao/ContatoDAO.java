
package dao;

import entidades.Contato;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContatoDAO {

    public void persist(Contato object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("minhaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public void merge(Contato object){
        EntityManager em = new EntityManager();        
        em.merge(object);
    }
    
    
}
