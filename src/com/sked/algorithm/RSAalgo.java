package com.sked.algorithm;

import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

/**
 * Created by Android on 11/7/2017.
 */
public class RSAalgo {

    private BigInteger p, q, N, phi, d, e;
    private int bitLength = 1024;
    private int bitSize = 256;

    // block size in byte

    private Random random;


    public RSAalgo() {
        random = new Random();

        p = BigInteger.probablePrime(bitLength, random);
        q = BigInteger.probablePrime(bitLength, random);

        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitLength / 2, random);

        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0) {
            e.add(BigInteger.ONE);
        }

        d = e.modInverse(phi);
    }

    public RSAalgo(BigInteger e, BigInteger d, BigInteger n) {
        this.e = e;
        this.d = d;
        this.N = n;
    }

    public static String byteToString(byte[] encrypted) {
        String test = "";
        for (byte b: encrypted){
            test += Byte.toString(b);
        }
        return test;
    }

    /**
     *  Encrypt message
     */

    public byte[] encrypt(byte[] message){
        return (new BigInteger(message)).modPow(e,N).toByteArray();
    }

    /**
     *  Decrypt message
     */

    public byte[] decrypt(byte[] message){
        return (new BigInteger(message)).modPow(d,N).toByteArray();
    }

    public static void main(String[] args) throws IOException {
        RSAalgo rsa=new RSAalgo();
        DataInputStream dip=new DataInputStream(System.in);
        String testString;
        System.out.println("Enter plain text");
        testString = dip.readLine();
        System.out.println("Encrypting String : "+testString);
        System.out.println("String in byte: "+byteToString(testString.getBytes()));

        // encrypt
        byte[] encrypted = rsa.encrypt(testString.getBytes());

        System.out.println("encrpted string in byte: "+byteToString(encrypted));

        //decrypt

        byte[] decryptrd = rsa.decrypt(encrypted);
        System.out.println("decrpted string in byte: "+byteToString(decryptrd));
        System.out.println("Decrypted String "+new String(decryptrd));
    }
}
