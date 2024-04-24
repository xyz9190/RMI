// SubstringSearchImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubstringSearchImpl extends UnicastRemoteObject implements SubstringSearch {
    public SubstringSearchImpl() throws RemoteException {
        super();
    }

    public boolean containsSubstring(String mainString, String subString) throws RemoteException {
        return mainString.contains(subString);
    }
}

