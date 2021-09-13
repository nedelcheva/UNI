package KE5;

public class BinareSuche {

    public static void main(String[] args) {
        int wert = 7;
        int[] folge = {2, 4, 6, 7, 9};
        int start = 3;
        int end = 5;
        System.out.println(new BinareSuche().istEnthalten(wert,folge, start, end));

    }

    boolean istEnthalten(int wert, int[] feld, int start, int end) {
        //Basisfall: hat 2 Elemente
        if(end - start <= 1) {
            return feld[start] == wert || feld[end] == wert;
        }

        int mitte = start + (end - start) / 2;
        if (feld[mitte] == wert) {
            return true;
        }
        if (feld[mitte] > wert) {
            return istEnthalten(wert, feld, start, mitte - 1); // in linke Seite suchen
        } else  {
            return istEnthalten(wert, feld, mitte + 1, end); // in rechte Seite suchen
        }
    }
}
