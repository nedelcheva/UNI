package KE4.Klassenhierarchie.b;

import KE4.Klassenhierarchie.a.Ober;
import KE4.Klassenhierarchie.c.UnterUnter;

public class Unter extends Ober {

    public void test() {
        x = 9; // geerbt von Ober
        Ober o = new Ober();
        // o.x = 10; // NEIN in Ober ist protected kann nur bei Element von Typ U oder Subtyp von U
        Unter u = new Unter();
        u.x = 10; // JA Element von Typ U
        Ober ou = new Unter();
        //ou.x = 10; // NEIN weil es ist Element von O
        UnterUnter uu = new UnterUnter();
        uu.x = 10; // JA, weil Elemnt von Subtyp von U

    }
}
