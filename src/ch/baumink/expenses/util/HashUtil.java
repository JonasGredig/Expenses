package ch.baumink.expenses.util;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigInteger;
import java.security.MessageDigest;

public class HashUtil {

    public static String getSecurePassword(String passwordToHash, String salt) {
        String generatedPassword = null;

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(salt.getBytes());
            byte[] bytes = messageDigest.digest(passwordToHash.getBytes());

            generatedPassword = String.format("%064x", new BigInteger(1, bytes));

        } catch (Exception e) {
            throw new NotImplementedException();
        }
        return generatedPassword;
    }

}
