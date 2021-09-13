package HA2;

import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        int a = 2;
        int b = 14;
        a *= b++ % 3;
        b = -b + (a*7);

        System.out.println(a);
        System.out.println(b);

        //int x = 8.0; falsch
        double z = 7 * 3;
        double t = 3; t++;
        //int b = 3; double b = 5.0; falsch

        int x = 10;
        while (x > 1) {
            System.out.println("Hallo!");
            x -= x / 2;
        }

        int y = 6;
        do {
            System.out.print("X");
            if (y * 2 > 6) {
                y = y - 1;
            } else {
                y = y - 2;
            }
        } while (y >= 3);

    }
}
