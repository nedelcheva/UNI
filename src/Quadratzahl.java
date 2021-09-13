import java.util.Scanner;

public class Quadratzahl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int square = Integer.parseInt(scanner.nextLine());

        double fourthPower = Math.pow(number, square);
        System.out.println(fourthPower);


        // Calculate the sum of square of all odd numbers in an array

        int [] feld = {1,4,6,3,8,7,9,5};
        int sum = 0;

        for (int i = 0; i < feld.length; i++) {

            if (feld[i] % 2 != 0) {
                sum += (Math.pow(feld[i], 2));
            }
        }
        System.out.println(sum);


        // Calculate the sum of square of all odd positions in an array
        int summ = 0;
        for (int i = 0; i < feld.length; i++) {
            if (i % 2 != 0) {
                summ += (Math.pow(feld[i], 2));
            }
        }
        System.out.println(summ);


        //Check if it is a perfect square, ends with 0,1,4,9,25
        double current = Math.sqrt(number);
        double flooor = Math.floor(current);
        if (current - Math.floor(current) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(flooor);

        // Find all perfect square numbers (a*a when both are the same we search their result 3*3 = 9 9 is perfect) in an range
        // and calculate how many of them there are

        int start = 1;
        int end = 100;
        int count = 0;
        for (int i = start; i <= end; i++) {
            int sqr = (int) Math.sqrt(i);
            if ((sqr * sqr) == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

        //Wie viele Quadratzahlen von 1 bis 200 gibt
        int countZahl = 0;
        int grenze = 0;
        int zahl = 1;
        while (grenze <= 200) {
            grenze = zahl * zahl;
            countZahl++;
            zahl++;
        }
        System.out.println(countZahl - 1);
    }
}
