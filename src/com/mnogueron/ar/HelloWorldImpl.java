package com.mnogueron.ar;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by matthieu on 05/02/16.
 */
public class HelloWorldImpl extends UnicastRemoteObject implements  HelloWorld{

    protected HelloWorldImpl() throws RemoteException {
        super();
    }

    @Override
    public String sendHello() throws RemoteException{
        return "Hello world !";
    }
}
