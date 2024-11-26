package org.example;

public class Main {
    public static void main(String[] args) {

        Buch buch = new Buch("testTitel","testAutor","testISBN");
        Buch buch1 = new Buch("HamburfTest!","autorOmar","AbS123");


        Bibliothek bibliothek= new Bibliothek( new Buch[]{buch,buch1});

        System.out.println(bibliothek);
    }
}