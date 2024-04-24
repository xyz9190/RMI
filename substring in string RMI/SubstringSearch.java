// SubstringSearch.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SubstringSearch extends Remote {
    boolean containsSubstring(String mainString, String subString) throws RemoteException;
}

