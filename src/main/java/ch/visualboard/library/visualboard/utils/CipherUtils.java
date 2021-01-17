package ch.visualboard.library.visualboard.utils;

import java.security.SecureRandom;
import org.apache.commons.codec.digest.DigestUtils;

public class CipherUtils
{
    public static String cryptPasswordWithSHA256(String rawPassword, String salt)
    {
        String cryptedPasswordLevel1 = DigestUtils.sha256Hex(salt + rawPassword);
        return DigestUtils.sha256Hex(cryptedPasswordLevel1 + salt);
    }

    public static String generateRandomToken()
    {
        SecureRandom rnd = new SecureRandom();
        String value = String.valueOf(rnd.nextLong());
        return DigestUtils.sha1Hex(value);
    }
}
