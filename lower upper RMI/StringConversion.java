// StringConversion.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringConversion extends Remote {
    String toUpperCase(String str) throws RemoteException;
    String toLowerCase(String str) throws RemoteException;
}

