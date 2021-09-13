package HA4;

public class HA4 {

    public static void main(String[] args) {
    }
        public class A {
            private int a =1;
            public int b =2;

            private int g() {
                a++;
                b++;
                return a + b;
            }

            public void h(B obj) {
                obj.c += a;
                obj.d++;
                obj.i();
            }
        }

        public class B {
            private int c=3;
            public int d=4;

            public int i() {
                c++;
                d++;
                return d + c;
            }

            private void k(A obj) {
                obj.a += c;
                obj.b = obj.g();
            }
        }
    }


