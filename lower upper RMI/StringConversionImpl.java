// StringConversionImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringConversionImpl extends UnicastRemoteObject implements StringConversion {
    public StringConversionImpl() throws RemoteException {
        super();
    }

    public String toUpperCase(String str) throws RemoteException {
        return str.toUpperCase();
    }

    public String toLowerCase(String str) throws RemoteException {
        return str.toLowerCase();
    }
}

