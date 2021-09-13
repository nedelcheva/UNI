package KE4.e25x1x3;

public abstract class Konto  {
    double kontoStand;

    public Konto(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public double getGeld() {
        return kontoStand;
    }

    public void setGeld(double geld) {
        this.kontoStand = geld;
    }



    public void einzahlen(double geld) {
        if (geld <= 0) {
            System.out.println("Negative beitrag nicht erlaubt");
        }
        this.kontoStand += geld;
    }
}
