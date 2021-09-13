package HA5;

public class HA_3 {
    static int counter;
    public static int a(int x, int y) { // hier sind alle Knoten, ein Baum zeichnen mit diese Zahlen und fertig
    counter++;
        if (x <= 0 || y < 0) {
            return x - y + 2;
        }
        if (x % 2 == 0) {
            return a(x / 2, y) + a(x, y - 1);
        }
        return a(x - 1, y - 2);
    }

    public static void main(String[] args) {
        System.out.println(a(6,3));
        System.out.println(counter);
    }
}
