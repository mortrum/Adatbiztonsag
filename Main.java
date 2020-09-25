package com.company.titkozas;

public class Main {
    public static void main(String[] args) {
        String text = "ADATBIZTONSAG";
        String key = "ALMA";

        key = Vigenere.generateKey(text, key);

        String titkosUzi = Vigenere.encrypt(text, key);

        System.out.println("Titkositot uzi: " + titkosUzi);

        System.out.println("Decrypted uzi: " + Vigenere.decrypt(titkosUzi, key));

        System.out.println("Affine");

        System.out.println("Titkositot affine uzi: " + Affine.decrypt(text, 5, 8));
        System.out.println("Decrypted affine uzi: " + Affine.encrypt(Affine.decrypt(text, 5, 8), 5, 8));
    }
}
