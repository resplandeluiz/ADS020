package ejb;

import entity.Aluno;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
@LocalBean
public class AlunoEJB {

    @PersistenceContext(unitName = "cadastroPU")
    private EntityManager em;

    public void create(Aluno entity) {
        em.persist(entity);
    }

    public void edit(Aluno entity) {
        em.merge(entity);
    }

    public void remove(Aluno entity) {
        em.remove(em.merge(entity));
    }

    public Aluno find(Object id) {
        return em.find(Aluno.class, id);
    }

    public List<Aluno> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Aluno.class));
        return em.createQuery(cq).getResultList();
    }

}
