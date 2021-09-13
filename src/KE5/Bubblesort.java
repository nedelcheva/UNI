package KE5;

import java.util.Arrays;

public class Bubblesort { // von links nach rechts
    public static void main(String[] args) {
        int[] feld = {2,8,5,6,3,1,4,7};
        //new Bubblesort().bubblesort(feld);

        int countVergleich=0;
        int countTausch = 0;


        for (int i = 0; i < feld.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < feld.length - 1 - i; j++) {
                countVergleich++;
                if(feld[j] > feld[j + 1]) {
                    int temp = feld[j];
                    feld[j] = feld[j + 1];
                    feld[j + 1] = temp;
                    countTausch++;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }

        System.out.println(countVergleich);
        System.out.println(countTausch);
        System.out.println(Arrays.toString(feld));
    }

    void bubblesort(int[] feld) {
        for (int i = 0; i < feld.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < feld.length - 1 - i; j++) {
                if(feld[j] > feld[j + 1]) {
                    int temp = feld[j];
                    feld[j] = feld[j + 1];
                    feld[j + 1] = temp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
    }
}
