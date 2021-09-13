package HA4;

public interface Zahlenfrage {
    boolean istBeantwortet();
    boolean istRichtigBeantwortet();
    void legeAnwortFest(int antwort);
    int liefereErreichtePunkte();
    String liefereFrage();
    int liefereMoeglichePunkte();
}
