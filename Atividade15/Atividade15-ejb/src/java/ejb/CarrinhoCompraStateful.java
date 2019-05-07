/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateful;

/**
 *
 * @author 17114290048
 */
@Stateful
@Local(CarrinhoCompraLocal.class)
public class CarrinhoCompraStateful implements CarrinhoCompraLocal {

    private List<String> lista = new ArrayList<String>();
    
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

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
