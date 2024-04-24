// Palindrome.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Palindrome extends Remote {
    boolean isPalindrome(int number) throws RemoteException;
}

