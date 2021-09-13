package KE3;

public class Angestellter {
    String name;
    double gehalt;
    Abteilung abteilung;

    public Angestellter(String name, double gehalt, Abteilung abteilung) {
        this.name = name;
        this.gehalt = gehalt;
        this.abteilung = abteilung;
    }

    public String getName() {
        return name;
    }

    public double getGehalt() {
        return gehalt;
    }

    public Abteilung getAbteilung() {
        return abteilung;
    }
    //Gehalt erhohen
    void erhoeheGehalt(final double prozentsatz) {
        this.gehalt *= (1+prozentsatz);
    }
}

class Abteilung {
    long nummer;
    String name;

    public Abteilung(long nummer, String name) {
        this.nummer = nummer;
        this.name = name;
    }
}
