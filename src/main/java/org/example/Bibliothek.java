package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Bibliothek {
private Buch[] buecher;

    public Buch[] getBuecher() {
        return buecher;
    }

    public void setBuecher(Buch[] buecher) {
        this.buecher = buecher;
    }



    public Bibliothek(Buch[] buecher) {
    this.buecher =buecher;

}


public void addBuch(Buch buch) {
        Buch[] neueBuch=Arrays.copyOf(buecher,buecher.length + 1);
        neueBuch[neueBuch.length-1]=buch;
        buecher=neueBuch;
}

public void deleteBuch(Buch buch) {
    ArrayList<Buch> buecherListe=new ArrayList<>(Arrays.asList(buecher));
    buecherListe.remove(buch);
    this.buecher=buecherListe.toArray(new Buch[buecherListe.size()]);

}

    @Override
    public String toString() {
        return "Bibliothek{" +
                "buecher=" + Arrays.toString(buecher) +
                '}';
    }
}
