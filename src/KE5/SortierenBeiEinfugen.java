package KE5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortierenBeiEinfugen { // von rechts nach links

    public static void main(String[] args) {
        String [] folge = {"ab","cd", "aa"};
        new SortierenBeiEinfugen().sortiereAbsteigend(folge);
        System.out.println(Arrays.toString(folge));
        new SortierenBeiEinfugen().sortiereAufsteigend(folge);
        System.out.println(Arrays.toString(folge));






        int[] feld = {2,8,5,6,3,1,4,7};

        int countVergleich=0;
        int countTausch = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = i; j > 0 ; j--) {
                countVergleich++;
                if (feld[j - 1]>(feld[j]) ) {
                    int temp = feld[j];
                    feld[j] = feld[j - 1];
                    feld[j - 1] = temp;
                    countTausch++;
                } else {
                    System.out.println(countVergleich);
                    System.out.println(countTausch);
                    break;
                }
            }
        }
    }

    void sortiereAbsteigend(String [] feld) {
        int countVergleich=0;
        int countTausch = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = i; j > 0 ; j--) {
                countVergleich++;
                if(feld[j - 1].compareTo(feld[j]) < 0 ) {
                    String temp = feld[j];
                    feld[j] = feld[j - 1];
                    feld[j - 1] = temp;
                    countTausch++;
                } else {
                    System.out.println(countVergleich);
                    System.out.println(countTausch);
                    break;
                }
            }
        }
    }

    void sortiereAufsteigend(String[] feld) {
        int countVergleich=0;
        int countTausch = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = i; j > 0 ; j--) {
                countVergleich++;
                if (feld[j - 1].compareTo(feld[j]) > 0) {
                    String temp = feld[j];
                    feld[j] = feld[j - 1];
                    feld[j - 1] = temp;
                    countTausch++;
                } else {
                    System.out.println(countVergleich);
                    System.out.println(countTausch);
                    break;
                }
            }
        }
    }
}
