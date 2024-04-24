// ConcatenateImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConcatenateImpl extends UnicastRemoteObject implements Concatenate {
    public ConcatenateImpl() throws RemoteException {
        super();
    }

    public String concatenateStrings(String str1, String str2) throws RemoteException {
        return str1 + str2;
    }
}

