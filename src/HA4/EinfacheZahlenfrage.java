package HA4;

public class EinfacheZahlenfrage extends AbstrakteZahlenfrage {
    private int richtigeAntwort;

    public EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort) {
        super(frage, punkte);
        this.richtigeAntwort = richtigeAntwort;
    }

    public boolean istRichtigBeantwortet() {
        if (this.istBeantwortet() && this.richtigeAntwort == this.antwort) {
            return true;
        }
        return false;
    }
}
