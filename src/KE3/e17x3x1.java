package KE3;

public class e17x3x1 {
    public static void main(String[] args) {


        Rechnung re1 = new Rechnung();
        re1.betrag = 12.0;
        Rechnung re2 = new Rechnung();
        re2.betrag = 24.0;
        Rechnung re3 = new Rechnung();
        re3.betrag = 36.0;
        re2.betrag = re3.betrag;
        re3 = re2;
        re1.betrag = re3.betrag;


        System.out.println(re1.betrag);
        System.out.println(re2.betrag);
        System.out.println(re3.betrag);
    }
}
