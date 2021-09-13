package KE5;

import java.util.Arrays;

public class SortierenDurchAuswahlen {

    public static void main(String[] args) {
        double [] folge = {1,5,3,7,2};
        new SortierenDurchAuswahlen().sortiere(folge);
        System.out.println(Arrays.toString(folge));
    }


    void sortiere(double[] feld) {
        for (int i = 0; i < feld.length - 1; i++) {
            int max = 0;
            for (int j = 0; j < feld.length - i; j++) {
                if(feld[j] > feld[max]) {
                    max = j;
                }
            }
            if (max != feld.length -1 - i) {
                double temp = feld[max];
                feld[max] = feld[feld.length - 1 - i];
                feld[feld.length - 1 - i] = temp;
            }
        }
    }
}
