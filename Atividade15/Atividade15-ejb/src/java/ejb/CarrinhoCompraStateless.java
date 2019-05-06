
package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(CarrinhoCompraLocal.class)
public class CarrinhoCompraStateless implements CarrinhoCompraLocal{
    
    private List<String> lista = new ArrayList<String>();

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
    
    @Override
    public void adicionarItem(String item) throws EJBException {
        lista.add(item);
        System.out.println("Item :" + item + " adicionado ao carrinho!");
    }

    @Override
    public List<String> listarItens() throws EJBException {
        System.out.println("Listando itens do carrinho ...");
        return lista;
    }

   
}
