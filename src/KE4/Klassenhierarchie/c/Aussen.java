package KE4.Klassenhierarchie.c;

import KE4.Klassenhierarchie.a.Ober;

public class Aussen {
    public void test() {
        Ober o = new Ober();
        //o.x = 10; // NEIN, weil keine Vererbung
        UnterUnter uu = new UnterUnter();
        //uu.x = 10; // NEIN, weil gleiche Paket aber x kommt von Vererbung
        uu.p = 10; // JA, weil gleiche Paket und hat nichts mit Vererbung zu tun
    }
}
