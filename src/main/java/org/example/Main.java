package org.example;

public class Main {
    public static void main(String[] args) {

        Buch buch  =new Buch("testTitel","testAutor","testISBN");
        Buch buch1 =new Buch("HamburgTest!","autorOmar","AbS123");
        Buch buch3 =new Buch("TestAdd_Delete_Methode","TestAdd_Delete_Methode","TestAdd_Delete_Methode");


        Bibliothek bibliothek= new Bibliothek( new Buch[]{buch,buch1});

        System.out.println("Bibliothek bevor add oder delete Methode ");
        System.out.println(bibliothek);

        bibliothek.addBuch(buch3);
        System.out.println("Add_Methode");
        System.out.println(bibliothek);

        bibliothek.deleteBuch(buch3);
        System.out.println("Delete_Methode");
        System.out.println(bibliothek);
    }
}