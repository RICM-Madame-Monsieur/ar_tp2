package com.mnogueron.ar;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by matthieu on 05/02/16.
 */
public class HelloWorldClient {

    public static void main(String args[]){
        try {
            int port = 1099;
            HelloWorld obj = (HelloWorld) Naming.lookup("//:"+port+"/HelloWorldRemote");

            String hello = obj.sendHello();
            System.out.println(hello);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
