package HA3;

public class HA3_1 {
    private int a;
    static double b;
    private int staticC;
    public double d;
    private static float c;

//    public void g() {
//        d *= h(a);
//    }

//    private static double h(double z) {
//        return z * 3 + a;
//    }

    void i(double x) {
        b += x * c;
        x *= 2;
    }

    public static void k(HA3_1 obj) {
        obj.d = 7.0;
    }

//    public static void main(String[] args) {
//        int f = (int) c;
//        i(f);
//    }


    public static void main(String[] args) {
//        HA3.HA3_1 a1 = new HA3.HA3_1();
//        HA3.HA3_1 a2 = new HA3.HA3_1();
//        HA3.HA3_1 a3 = a1;
//        a1.d = 5.0;
//        a2.d = 6.0;
//
//        k(a1);
//        double x = a1.d;
//        double y = a2.d;
//        double z = a3.d;
//        a3.i(y);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

        int[] x = new int[21];
        double[] y = { 3.4, 3, 7, 9.8, 12.9 };
        char[][][] z = new char[13][2][7];
        int len = z.length;
        double a = y[4];
        System.out.println(a);


    }

}
