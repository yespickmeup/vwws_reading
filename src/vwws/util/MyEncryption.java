/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.util;

/**
 *
 * @author Guinness
 */
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import java.io.UnsupportedEncodingException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public class MyEncryption {

    private static Cipher ecipher;
    private static Cipher dcipher;

    private static SecretKey key;

    public static void main(String[] args) {

        try {

            // generate secret key using DES algorithm
            key = KeyGenerator.getInstance("Blowfish").generateKey();

            ecipher = Cipher.getInstance("Blowfish");
            dcipher = Cipher.getInstance("Blowfish");

            // initialize the ciphers with the given key
            ecipher.init(Cipher.ENCRYPT_MODE, key);

            dcipher.init(Cipher.DECRYPT_MODE, key);

//            String encrypted = encrypt("Ronald");
//            System.out.println("Encrypted: " + encrypted);
            String decrypted = decrypt("krFrBkQ0BgI=");

            System.out.println("Decrypted: " + decrypted);

        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm:" + e.getMessage());
        } catch (NoSuchPaddingException e) {
            System.out.println("No Such Padding:" + e.getMessage());
        } catch (InvalidKeyException e) {
            System.out.println("Invalid Key:" + e.getMessage());
        }

    }

    public static String encrypt(String str) {

        try {

            // encode the string into a sequence of bytes using the named charset
            // storing the result into a new byte array. 
            byte[] utf8 = str.getBytes("UTF8");

            byte[] enc = ecipher.doFinal(utf8);

// encode to base64
            enc = BASE64EncoderStream.encode(enc);

            return new String(enc);

        } catch (UnsupportedEncodingException | IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }

       

    }

    public static String decrypt(String str) {

        try {

            // decode with base64 to get bytes
            byte[] dec = BASE64DecoderStream.decode(str.getBytes());

            byte[] utf8 = dcipher.doFinal(dec);

// create new string based on the specified charset
            return new String(utf8, "UTF8");

        } catch (UnsupportedEncodingException | BadPaddingException | IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        }

    }
}
