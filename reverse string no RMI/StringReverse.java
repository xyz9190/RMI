// StringReverse.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringReverse extends Remote {
    String reverseString(String str) throws RemoteException;
}

