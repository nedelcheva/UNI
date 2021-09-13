package KE4.e24x3x1;

import KE4.e24x3x1x2.C;

public class A {
    public int f;
    // protected only in the same package, without children
    // without only in the same package
    // private not even in the method in the same class

    public void test() {
        C c1 = new C();
        c1.f = 6;
        f = 8;
    }
}
