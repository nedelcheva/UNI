package HA3;

import java.util.Scanner;

public class Durchschnitt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] feld = new int[5];
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            feld[i] = number;
        }
        System.out.println(berechneDurchschnitt(feld)); // static in the method added

    }



    /**
     * Methode zur Berechnung des Durchschnittes eines Arrays
     * von nichtnegativen int-Zahlen.
     *
     * @param feld ein Array von int-Zahlen.
     * @return Der berechnete HA3.Durchschnitt der Zahlen im Array.
     */
    public static double berechneDurchschnitt(int[] feld) {
        // TODO: Hier bitte die entsprechende Berechnung ergaenzen.
        double sum = 0;
        if(feld.length == 0) {
            return 0.0;
        }
        for (int i = 0; i < feld.length; i++) {
            sum += feld[i];
        }

        return sum / feld.length;
    }
}
