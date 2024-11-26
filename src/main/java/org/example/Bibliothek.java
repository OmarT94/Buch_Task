package org.example;

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

    @Override
    public String toString() {
        return "Bibliothek{" +
                "buecher=" + Arrays.toString(buecher) +
                '}';
    }
}
