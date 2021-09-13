package KE4.e25x1x3;

public class Sparkonto extends Konto {
    public Sparkonto(double kontoStand) {
        super(kontoStand);
    }

    public void auszahlen(double geld) {
        if (this.kontoStand > geld) {
            kontoStand -= geld;
        } else {
            System.out.println("Not enough money");
        }
    }
}
