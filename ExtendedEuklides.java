package com.company;

import java.math.BigInteger;
import java.util.Arrays;

public class ExtendedEuklides{

    public static BigInteger[] extendedEuklidesz(BigInteger a, BigInteger b){
        BigInteger[] result = null;

        BigInteger x0 = new BigInteger("1");
        BigInteger x1 = new BigInteger("0");
        BigInteger y0 = new BigInteger("0");
        BigInteger y1 = new BigInteger("1");
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("0");
        BigInteger n = new BigInteger("1");

        BigInteger r = new BigInteger("0");
        BigInteger q = new BigInteger("0");

        while (!b.equals(BigInteger.ZERO)) {
            r = a.mod(b);
            q = a.divide(b);
            a = b;
            b = r;
            x = x1;
            y = y1;
            x1 = q.multiply(x1).add(x0);
            y1 = q.multiply(y1).add(y0);
            x0 = x;
            y0 = y;

            if (n.signum() == 1)
                n= n.negate();
            else
                n = n.abs();
        }
        x = n.multiply(x0);

        if (n.signum() == 1)
            n = n.negate();
        else
            n = n.abs();

        y = n.multiply(y0);
        result = new BigInteger[] {a, x, y};


        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extendedEuklidesz(BigInteger.valueOf(45),BigInteger.valueOf(211))));
    }
}
