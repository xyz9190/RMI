// Concatenate.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Concatenate extends Remote {
    String concatenateStrings(String str1, String str2) throws RemoteException;
}

