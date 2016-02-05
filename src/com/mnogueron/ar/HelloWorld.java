package com.mnogueron.ar;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by matthieu on 05/02/16.
 */
public interface HelloWorld extends Remote {

    String sendHello() throws RemoteException;

}
