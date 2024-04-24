// PalindromeImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PalindromeImpl extends UnicastRemoteObject implements Palindrome {
    public PalindromeImpl() throws RemoteException {
        super();
    }

    public boolean isPalindrome(int number) throws RemoteException {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}

