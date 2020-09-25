package com.company.titkozas;

public class Vigenere {
    public static String generateKey(String str, String key){
        String result = "";
        while (result.length() < str.length()){
            result = result + key;
        }
        return result.substring(0,str.length());
    }

    public static String encrypt(String str, String key){
        String cipherText = "";

        for (int i = 0; i < str.length(); i++) {
            int x = (str.charAt(i) + key.charAt(i)) % 26;
            x += 'A';
            cipherText += (char) x;
        }

        return cipherText;
    }

    public static String decrypt(String cipherText, String key){
        String original = "";

        for (int i = 0; i < cipherText.length(); i++) {
            int x = (cipherText.charAt(i) - key.charAt(i) + 26) % 26;
            x += 'A';
            original += (char) x;
        }

        return original;
    }

}
