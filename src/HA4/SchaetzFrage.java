package HA4;

public class SchaetzFrage extends AbstrakteZahlenfrage {
    private int richtigeAntwort;
    private int pozentualeAbweichung;
    public SchaetzFrage(String frage, int punkte, int richtigeAntwort, int pozentualeAbweichung) {
        super(frage, punkte);
        this.richtigeAntwort = richtigeAntwort;
        this.pozentualeAbweichung = pozentualeAbweichung;
    }

    @Override
    public boolean istRichtigBeantwortet() {
        if(this.istBeantwortet()
                && this.antwort >= (richtigeAntwort * (100 - pozentualeAbweichung) / 100)
                && this.antwort <= (richtigeAntwort * (100 + pozentualeAbweichung) / 100)) {
            return true;
        }
        return false;
    }
}
