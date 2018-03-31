package ch.baumink.expenses.util;

import java.security.SecureRandom;

public class SaltUtil {

    public static String getSalt() {

        SecureRandom secureRandom = new SecureRandom();

        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);

        return salt.toString();
    }


}
