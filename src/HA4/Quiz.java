package HA4;

public class Quiz  {
    private int fragenAnzahl = 0;
    private Zahlenfrage[] fragen;

    public Quiz(int fragenAnzahl) {
        this.fragen = new Zahlenfrage[fragenAnzahl];
    }

    public boolean fuegeFragenHinzu(Zahlenfrage f) {
        if(f == null) {
            return false;
        }

        if(fragen.length - 1 < fragenAnzahl) {
            this.fragen[this.fragenAnzahl] = f;
            this.fragenAnzahl++;
            return true;
        }
        return false;
    }

    public int berechneErreichtePunkte() {
        int summe = 0;
        for (Zahlenfrage f : this.fragen) {
            if(f == null) {
                continue;
            }
            summe += f.liefereErreichtePunkte();
        }
        return summe;
    }

    public int berechneMaximalMoeglichePunkte() {
        int summe = 0;
        for (Zahlenfrage f : this.fragen) {
            if(f == null) {
                continue;
            }
            summe += f.liefereMoeglichePunkte();
        }
        return summe;
    }

    public Zahlenfrage liefereFrage(int index) {
        if (index < 0 || index > this.liefereFrageAnzahl()) {
            return null;
        }
        return this.fragen[index];
    }

    public int liefereFrageAnzahl(){
        return this.fragenAnzahl;
    }


}
