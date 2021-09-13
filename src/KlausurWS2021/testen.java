package KlausurWS2021;

import java.util.Scanner;

public class testen {
    public static int x;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a) testen.x richtig
        String abc = "Kurs 1622"; // ein String Literal ja
        String o = "abc";
        String p = "ab";
        String leer = "";

        //int[] x = new int[5];
//        x[5] = 2; falsch

        //int x = 5/0; falsch

//        for (int i = 1; i > 0; i++) {
//            System.out.println(i);
//        }
        System.out.println(new testen().stringCheck(o));
        System.out.println(new testen().stringCheck(p));

        boolean x = false;
        boolean y = false;
        boolean z = true;
        System.out.println(boolcheck(x, y, z));

        int c = 4;
        System.out.println(intcheck(c));

        int schlussel = 3;
        String [] word = scanner.nextLine().split("");
        StringBuilder newWord = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            char temp = word[i].charAt(0);
            temp -= 3;
            newWord.append(temp);
        }

        System.out.println(newWord);

        double zahl = 0;
        double f = -100000000;
        for (int i = 1; i <= 100; i++) {
            double current = i*i*i - 150 * (i*i) + 4500 * i - 40000;
            if(current > f) {
                zahl = i;
                f = current;
            }
        }
        System.out.println(zahl);
        System.out.println(f);
    }



    boolean stringCheck(String x) {
        byte s = 0;
        for (int i = 0; i < x.length(); ++i) {
            switch (s) {
                case 0:
                    s= 1;
                    break;
                case 1:
                    s=0;
                    break;
            }
        }
        return s==0;
    }

    public static boolean boolcheck(boolean x, boolean y, boolean z) {
        return x && y && !z || !x && y && z || x && !y && z;
    }

    public static boolean intcheck(int x) {
        if(x <= 1) {
            return false;
        }
        for (int i = 2; i < x/2; ++i) {
            if(x/i*i == x) {
                return false;
            }
        }
        return true;
    }
}
