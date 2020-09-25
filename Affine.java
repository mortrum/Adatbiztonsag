package com.company.titkozas;

public class Affine {


    public static String encrypt(String str, int a, int b) {
        String cipherText = "";

        for (int i = 0; i < str.length(); i++) {
            int x = (a * (str.charAt(i) + b)) % 26;
            x += 'A';
            cipherText += (char) x;
        }

        return cipherText;
    }



    public static String decrypt(String cipherText, int a, int b) {
        String original = "";
        int flag = 0;
        int a_inv = 0;
        for (int i = 0; i < 26; i++) {
            flag = (a * i) % 26;

            if (flag == 1)
                a_inv = i;

        }

        for (int i = 0; i < cipherText.length(); i++) {
            int x = ((cipherText.charAt(i) * a_inv) - b) % 26;
            x += 'A';
            original += (char) x;
        }

        return original;
    }
}
