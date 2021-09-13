package KlausurSS19;

import KlausurSS19.Rechteck;

public class Aufgabe3 {

    public static void main(String[] args) {
        Rechteck alt = new Rechteck(3, 3, 1, 6);
        Rechteck neu = new Rechteck(4, 4, 4, 10);

        System.out.println(alt.collision(neu,alt));

    }
}
