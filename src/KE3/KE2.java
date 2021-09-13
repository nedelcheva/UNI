package KE3;

import java.util.Scanner;

public class KE2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = Integer.parseInt(scanner.nextLine());;
        int n = Integer.parseInt(scanner.nextLine());;

        long rest = 1;

        while (n > 0) {
            rest *= p;
            n--;
        }

        System.out.println(rest);
    }




}
