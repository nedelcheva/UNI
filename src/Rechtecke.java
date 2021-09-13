import java.util.Scanner;

public class Rechtecke {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        // perimetar and area of a rectangle
        double perimeter = 2 * (height + width);
        double area = width * height;



        // if two rectangles overlap
        int t1x = Integer.parseInt(scanner.nextLine());
        int t1y = Integer.parseInt(scanner.nextLine());
        int t2x = Integer.parseInt(scanner.nextLine());
        int t2y = Integer.parseInt(scanner.nextLine());

        int b1x = Integer.parseInt(scanner.nextLine());
        int b1y = Integer.parseInt(scanner.nextLine());
        int b2x = Integer.parseInt(scanner.nextLine());
        int b2y = Integer.parseInt(scanner.nextLine());

        if(t1x > b2x //R1 is right to R2
        || t2x > b1x //R1 is left to R2
        || b1y > t2y //R1 is above R2
        || b2y > t1y)//R1 is below R2

        // check if one is a line
        if(t1x == b1x || t1y == b1y || t2x == b2x || t2y == b2y) {
            System.out.println(false);
        }
//        // if on is on the left side of the other
////        if(t1x > b2x || t2x > b1x) {
////            System.out.println(false);
////        }
////        // if one is above the other
////        if (b1y > t2y || b2y > t1y) {
////            System.out.println(false);
////        }


        //scale
            double f = 4;
            f = Math.sqrt(f);
            width *= f;
            height *= f;

    }
}
