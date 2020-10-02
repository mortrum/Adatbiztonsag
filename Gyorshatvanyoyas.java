package com.company.titkozas;

import java.math.BigInteger;

public class Gyorshatvanyoyas {

    public static int modPow(int a, int e, int m){
        int result = 1;
        int apow = a;
        while (e !=0){
            if ((e & 0x01) == 0x01){
                result = (result * apow) % m;
            }
            e >>= 1;
            apow = (apow * apow) % m;
        }
        return result;
    }

    public static BigInteger modPow(BigInteger a, BigInteger e, BigInteger m){
        BigInteger result = new BigInteger("1");
        BigInteger apow = a;
        while (!e.equals(BigInteger.ZERO)){
            if (e.testBit(0)){
                result = (result.multiply(apow)).mod(m);
            }
            e=e.shiftRight(1);
            apow = (apow.multiply(apow)).mod(m);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("6^73 mod100 = " + modPow(6,73,100));
        System.out.println("Biginteger: 6^73 mod100 = " + modPow(new BigInteger("6"),new BigInteger("73"),new BigInteger("100")));
    }
}

