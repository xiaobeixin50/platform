package com.beiken.saas.platform.utils.wx;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class WeChatUtils {
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WeChatUtils.class);

    // Random shared instance
    public static final Random RAND = new Random(System.currentTimeMillis());

    // time in seconds
    public static int now() {
        return (int) (System.currentTimeMillis() / 1000L);
    }

    // Digest
    private static final char[] DIGITS_LOWER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
            'e', 'f' };
    private static final char[] DIGITS_UPPER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
            'E', 'F' };

    private static String hex(byte[] input, boolean upperCase) {
        StringBuffer buf = new StringBuffer();
        for (int j = 0; j < input.length; j++) {
            if (upperCase) {
                buf.append(DIGITS_UPPER[(input[j] >> 4) & 0x0f]);
                buf.append(DIGITS_UPPER[input[j] & 0x0f]);
            } else {
                buf.append(DIGITS_LOWER[(input[j] >> 4) & 0x0f]);
                buf.append(DIGITS_LOWER[input[j] & 0x0f]);
            }
        }
        return buf.toString();
    }

    /**
     * Lower case sha1
     *
     * @param input
     * @return
     */
    public static String sha1hex(String input) throws Exception {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(input.getBytes(Charset.forName("utf-8")));
            return hex(digest, false);
        } catch (NoSuchAlgorithmException e) {
            LOG.warn("Cannot find SHA1 digest algorithm", e);
            throw new Exception(e);
        }
    }

    // Nonce generation
    private static final String NONCE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String nonce() {
        int length = WeChatUtils.RAND.nextInt(5) + 5;
        char[] ret = new char[length];
        for (int i = 0; i < length; ++i) {
            ret[i] = NONCE.charAt(WeChatUtils.RAND.nextInt(NONCE.length()));
        }
        return new String(ret);
    }
}
