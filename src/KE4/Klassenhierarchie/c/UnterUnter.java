package KE4.Klassenhierarchie.c;

import KE4.Klassenhierarchie.b.Unter;

public class UnterUnter extends Unter {

    protected int p;
    public void test() {
        x = 10; // geerbt von Unter von Ober
        Unter u = new Unter();
        //u.x = 10; // NEIN, weil Element von Oberklasse
        UnterUnter uu = new UnterUnter();
        uu.x = 10; // JA, weil ELement von Unterklasse
    }
}
