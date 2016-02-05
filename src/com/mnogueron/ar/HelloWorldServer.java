package com.mnogueron.ar;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by matthieu on 05/02/16.
 */
public class HelloWorldServer {

    public static void main(String args[]){
        // Crée et installe un Security Manager
        // nécessaire seulement si le code est téléchargé
        /*if(System.getSecurityManager() == null){
            System.setSecurityManager(new RMISecurityManager());
        }*/

        try {

            int port = 1099;
            LocateRegistry.createRegistry(port);

            // instancie l'objet Remote
            HelloWorld obj = new HelloWorldImpl();

            // enregistre l'objet auprès du registry
            Naming.bind("//:"+port+"/HelloWorldRemote", obj);
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
