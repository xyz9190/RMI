// StringLength.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringLength extends Remote {
    int getLength(String str) throws RemoteException;
}

