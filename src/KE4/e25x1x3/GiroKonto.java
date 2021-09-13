package KE4.e25x1x3;

public class GiroKonto extends Konto {
    private double dispo = 0;

    public GiroKonto(double kontoStand) {
        super(kontoStand);
    }

    public void setDispo(double limit) {
        this.dispo = limit;
    }

    public boolean aufheben(double geld) {
        if (geld > dispo) {
            System.out.printf("Sie können max %.2f abheben", kontoStand + dispo);
            return false;
        } else {
            this.kontoStand -= geld;
            return true;
        }
    }


}
