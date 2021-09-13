package KE5;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int [] feld = {7,35,17,67,5,2,23,11,3,15,21,45};
        int start = 0;
        int end = 9;
        new Quicksort().quicksort(feld,start,end);
        System.out.println(Arrays.toString(feld));
    }

    void quicksort(int[] feld, int start, int end) {
        //Basisfall: leer
        if(end < start) {
            return;
        }

        //Basisfall: max 2 Elements
        if (end - start <= 1) {
            if(feld[start] > feld[end]) {
                int temp = feld[end];
                feld[end] = feld[start];
                feld[start] = feld[temp];
            }
            return;
        }
        int grenze = aufteilen(feld, start, end);
        quicksort(feld, start, grenze - 1); // linke Seite sortieren
        quicksort(feld, grenze + 1, end); // rechte Seite sortieren
    }

    int aufteilen(int[]feld, int start, int end) {
        int l = start + 1; // index von links
        int r = end; // index von rechts
        int pivot = feld[start];


        while (l < r) {
            // erste Element grosser als pivot finden
            while (feld[l] <= pivot && l < r) {
                l++;
            }
            // erste Element kleiner als pivot finden
            while (feld[r] > pivot && l < r) {
                r--;
            }
            int temp = feld[l];
            feld[l] = feld[r];
            feld[r] = temp;
        }

        if(feld[l] > pivot) {
            l--;
        }
        feld[start] = feld[l];
        feld[l] = pivot;
        return l;

    }
}
