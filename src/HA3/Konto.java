package HA3;

public class Konto {
    long kontostand;
    long nummer;
    Bank bank;
    Kunde inhaber;

    Konto(long kontoNr, Bank bank, Kunde inhaber) {
        this.nummer = kontoNr;
        this.bank = bank;
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    void auszahlen(long cent) {
        this.kontostand -= cent;
    }

    void einzahlen(long cent) {
        this.kontostand += cent;
    }

    String liefereBankname() {
        return this.bank.liefereName();
    }

    long liefereBLZ() {
        return  this.bank.liefereBLZ();
    }

    String liefereInhabername() {
        return  this.inhaber.liefereName();
    }

    long liefereKontonummer() {
        return this.nummer;
    }

    long liefereKontostand() {
        return this.kontostand;
    }
}
