package managedbean;

import ejb.AlunoEJB;
import entity.Aluno;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.enterprise.context.RequestScoped;


@RequestScoped
@LocalBean
public class AlunoMB implements Serializable {

    @EJB
    private AlunoEJB alunoEJB;
    private List<Aluno> listaAluno;
    private Aluno aluno;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> list() {
        if (listaAluno == null) {
            listaAluno = alunoEJB.findAll();
        }
        return listaAluno;
    }

    public String create() {
        aluno = new Aluno();
        return "create";
    }

    public String edit(Aluno aluno) {
        this.aluno = aluno;
        return "edit";
    }

    public String remove(Aluno aluno) {
        alunoEJB.remove(aluno);
        listaAluno = alunoEJB.findAll();
        
        return "list";
    }

    public String save(Aluno aluno, boolean novo) {
        if (novo) {
            alunoEJB.create(aluno);
        } else {
            alunoEJB.edit(aluno);
        }
        listaAluno = alunoEJB.findAll();
        return "list";
    }

}
