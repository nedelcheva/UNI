package HA4;

public abstract class AbstrakteZahlenfrage implements Zahlenfrage{
    private String frage;
    private int punkte;
    private boolean istBeantwortet;
    protected int antwort;
    public AbstrakteZahlenfrage(String frage, int punkte) {
        this.frage = frage;
        this.punkte = punkte;
        this.antwort = 0;
    }

    @Override
    public boolean istBeantwortet() {
        return istBeantwortet;
    }


    @Override
    public void legeAnwortFest(int antwort) {
        this.istBeantwortet = true;
        this.antwort = antwort;
    }

    @Override
    public int liefereErreichtePunkte() {
        if(!istBeantwortet) {
            return 0;
        }
        if (this.istRichtigBeantwortet()) {
            return this.liefereMoeglichePunkte();
        }
        return 0;
    };
    @Override
    public String liefereFrage() {
        return this.frage;
    }

    @Override
    public int liefereMoeglichePunkte() {
        return this.punkte;
    }
}




















