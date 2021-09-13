package HA3;

public class Bank {

    private long blz;

    private String name;

    /**
     * erzeugt eine neue HA3.Bank mit gegebenen Namen und BLZ
     * @param bankname der Name der HA3.Bank
     * @param bankleitzahl die BLZ
     */
    public Bank(String bankname, long bankleitzahl) {
        name = bankname;
        blz = bankleitzahl;
    }

    /**
     * liefert die Bankleitzahl der HA3.Bank
     * @return die BLZ
     */
    public long liefereBLZ() {
        return blz;
    }

    /**
     * liefert den Namen der HA3.Bank
     * @return der Name der HA3.Bank
     */
    public String liefereName() {
        return name;
    }
}


