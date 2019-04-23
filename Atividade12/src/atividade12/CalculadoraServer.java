/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade12;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author 17114290048
 */
public class CalculadoraServer extends UnicastRemoteObject implements CalculadoraRemota {

    public CalculadoraServer() throws RemoteException {
    }

    @Override
    public int somar(int a, int b) throws RemoteException {

        a += b;
        return a;

    }

    @Override
    public int subtrair(int a, int b) throws RemoteException {
        a -= b;
        return a;

    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        a *= b;
        return a;

    }

    @Override
    public int dividir(int a, int b) throws RemoteException {
        a /= b;
        return a;

    }

    public static void main(String[] args) throws RemoteException {

        CalculadoraServer obj = new CalculadoraServer();

        try {
            
            LocateRegistry.createRegistry(1099);
            Naming.rebind("CalculadoraServer", obj);
            System.out.println("Calculadora ligada");
            
        } catch (Exception ex) {
            
            System.err.println("Erro: " + ex.getMessage());
            
        }
    }

}
