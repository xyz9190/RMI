// StringLengthImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringLengthImpl extends UnicastRemoteObject implements StringLength {
    public StringLengthImpl() throws RemoteException {
        super();
    }

    public int getLength(String str) throws RemoteException {
        return str.length();
    }
}

