package com.company;

import java.math.BigInteger;

public class Euklideszi {

    public static void main(String[] args) {
        System.out.println(euklidesz(BigInteger.valueOf(2525), BigInteger.valueOf(225)));
    }

    public static BigInteger euklidesz(BigInteger a, BigInteger b){
        while(!b.equals(BigInteger.ZERO)){
            BigInteger r = a.mod(b);
            a = b;
            b = r;
        }
        return a;
    }

}
