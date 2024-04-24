// StringReverseImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringReverseImpl extends UnicastRemoteObject implements StringReverse {
    public StringReverseImpl() throws RemoteException {
        super();
    }

    public String reverseString(String str) throws RemoteException {
        return new StringBuilder(str).reverse().toString();
    }
}

