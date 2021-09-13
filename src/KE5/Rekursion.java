package KE5;

public class Rekursion {
    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        String s = "abba";
        System.out.println(new Rekursion().summeRekursiv(n));
        System.out.println(new Rekursion().fakultaetRekursiv(n));
        System.out.println(new Rekursion().power(p, n));
        System.out.println(new Rekursion().fibonachi(n));
        System.out.println(new Rekursion().fibIterativ(n));
        System.out.println(new Rekursion().zufallszahlen(n));
        System.out.println(new Rekursion().isPalindrom(s));

    }

    int summeIterativ(int n) {
        int ergebniss = 0;
        for (int i = 0; i <= n; i++) {
            ergebniss += n;
        }
        return ergebniss;
    }

    int summeRekursiv(int n) {
        //Basisfall
        if(n == 0) {
            return 0;
        }
        return summeRekursiv(n - 1) + n; // (2-1) + 2; (1-1) + 1; answer: 3 = (2 + 1)
    }

    int fakultaetRekursiv(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fakultaetRekursiv(n - 1);// 2 * (2-1); 1 * (1-1); answer: 2 = (2*1)
    }

    double power(int p, int n) { // p^n = 3^2 = 3 * 3 = 9
        if(n == 0) {
            return 1;
        }
        return p * power(p, n - 1);

    }

    long fibonachi(int n) { // the next number is found by adding the two before 0 1 2 3 5
        if(n == 0 || n == 1) {
            return n;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);
    }

    long fibIterativ(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i < n; i++) {
            //fib(i) = fib(i - 1) + fib(i - 2)
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }


    long zufallszahlen(int n) {
        if (n < 3) {
            return n + 1;
        }
        return 1 + (((zufallszahlen(n -1) - zufallszahlen(n -2)) * zufallszahlen(n - 3)) % 100);
    }

    boolean isPalindrom (String s) { // vorwärts und rückwärts gleich abba
        if(s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrom(s.substring(1, s.length() - 1)); // abba, bb (take away first and last character)
    }
}
