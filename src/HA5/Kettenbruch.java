package HA5;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class Kettenbruch {
    // die lineare Darstellung des Kettenbruchs
    private int[] werte;

    /**
     * erzeugt einen Kettenbruch aus der linearen Darstellung
     * @param werte
     */
    public Kettenbruch(int[] werte) {
        this.werte = werte;
    }

    /**
     * berechnet rekursiv den Wert des Kettenbruchs
     * @return den rekursiv berechneten Wert des Kettenbruchs, bei fehlenden Werten 0
     */
    public double werteRekursivAus() {
        // TODO
        if(werte.length == 0) {
            return 0;
        }
        return werteRekursivAus(0);

    }

    private double werteRekursivAus(int i) {
        if(i == werte.length - 1) {
            return werte[i];
        }
        return werte[i] + 1/werteRekursivAus(i + 1);
    }

    /**
     * berechnet iterativ den Wert des Kettenbruchs
     * @return den iterativ berechneten Wert des Kettenbruchs, bei fehlenden Werten 0
     */
    public double werteIterativAus() {
        // TODO
        if(werte.length == 0) {
            return 0;
        }
        if(werte.length == 1) {
            return werte[0];
        }
        double ergebnis = 1.0 / werte[werte.length - 1];
        for (int i = werte.length - 2; i >= 1 ; i--) {
            ergebnis = 1 / (werte[i] + ergebnis);
        }
        return ergebnis + werte[0];

    }

    /**
     * approximiert den Wert der Quadratwurzel von 2 mit Hilfe der Kettenbruchdarstellung mit n Elementen
     * @param n die Anzahl der fuer die Approximation verwendeten Elemente
     * @return der approximierte Wert von Wurzel 2
     */
    public static double approximiereWurzel2(int n) {
        // TODO
        int [] folge = berechneWurzel2Folge(n);
        return new Kettenbruch(folge).werteIterativAus();
    }

    /**
     * approximiert den Wert der eulerschen Zahl mit Hilfe der Kettenbruchdarstellung mit n Elementen
     * @param n die Anzahl der fuer die Approximation verwendeten Elemente
     * @return der approximierte Wert fuer die eulersche Zahl
     */
    public static double approximiereE(int n) {
        // TODO
        int[] eFolge = berechneEFolge(n);
        return new Kettenbruch(eFolge).werteIterativAus();
    }

    /**
     * berechnet die Folge fuer die Kettenbruch-Darstellung der Quadratwurzel von 2 mit den ersten n Elementen
     * @param n die Anzahl der Elemente
     * @return die Folge als Array, bei n <= 0 ein leeres Array
     */
    public static int[] berechneWurzel2Folge(int n) {
        // TODO
        if(n <= 0) {
            return new int[0];
        }
        int[] folge = new int[n];
        Arrays.fill(folge, 2);
        folge[0] = 1;
        return folge;
    }

    /**
     * berechnet die Folge fuer die Kettenbruch-Darstellung der eulerschen Zahl mit den ersten n Elementen
     * @param n die Anzahl der Elemente
     * @return die Folge als Array,  bei n <= 0 ein leeres Array
     */
    public static int[] berechneEFolge(int n) {
        // TODO
        if (n <= 0) {
            return new int[0];
        }
        int[] folge = new int[n];
        // erstes Element ist 2
        folge[0] = 2;
        // die folgenden Elemente besitzen das folgende Schema: 1, (2 * (i / 3 + 1)), 1
        // wobei die beiden 1 an den Positionen 3*n + 1 und 3*n auftreten
        for (int i = 1; i < n; i++) {
            switch(i % 3) {
                case 0:
                case 1:
                    folge[i] = 1;
                    break;
                case 2:
                    folge[i] = 2 * (i / 3 + 1);
            }
        }
        return folge;
    }

    // public class Kettenbruch {
    //
    //	// die lineare Darstellung des Kettenbruchs
    //	private int[] werte;
    //
    //	/**
    //	 * erzeugt einen Kettenbruch aus der linearen Darstellung
    //	 * @param werte
    //	 */
    //	public Kettenbruch(int[] werte) {
    //		this.werte = werte;
    //	}
    //
    //	/**
    //	 * berechnet rekursiv den Wert des Kettenbruchs
    //	 * @return den rekursiv berechneten Wert des Kettenbruchs, bei fehlenden Werten 0
    //	 */
    //	public double werteRekursivAus() {
    //		// Sonderfall
    //		if (werte.length == 0) {
    //			return 0;
    //		}
    //		// rekursive Hilfsmethode aufrufen, Berechnung bei index 0 starten lassen
    //		return werteRekursivAus(0);
    //	}
    //
    //	private double werteRekursivAus(int i) {
    //		// wenn der letzte Index erreicht wird, den Wert zurueckgeben,
    //		// da ein einelementiger Kettenbruch genau den Wert des einen Elements besitzt
    //		if (i == werte.length - 1) {
    //			return werte[i];
    //		}
    //		// Ansonsten den restlichen Kettenbruch rekursiv auswerten und die entsprechende Summe bilden
    //		return werte[i] + 1/werteRekursivAus(i+1);
    //	}
    //
    //	/**
    //	 * berechnet iterativ den Wert des Kettenbruchs
    //	 * @return den iterativ berechneten Wert des Kettenbruchs, bei fehlenden Werten 0
    //	 */
    //	public double werteIterativAus() {
    //		// bei keinem Element wird 0 zurueckgeliefert
    //		if (werte.length == 0) {
    //			return 0;
    //		}
    //		// bei nur einem Element wird dieser Wert zurueckgeliefert
    //		if (werte.length == 1) {
    //			return werte[0];
    //		}
    //		// der Startwert ist der Kehrwert des letzten Element
    //		double result = 1.0 / werte[werte.length - 1];
    //		// alle Werte rueckwerts dazunehmen
    //		for (int i = werte.length - 2; i >= 1; i--) {
    //			// aktuellen Wert dazuaddieren und anschließend den Kehrwert bilden
    //			result = 1 / (werte[i] + result);
    //		}
    //		// den vordersten Wert ohne Kehrwert dazuaddieren
    //		return result + werte[0];
    //	}
    //
    //	/**
    //	 * approximiert den Wert der Quadratwurzel von 2 mit Hilfe der Kettenbruchdarstellung mit n Elementen
    //	 * @param n die Anzahl der fuer die Approximation verwendeten Elemente
    //	 * @return der approximierte Wert von Wurzel 2
    //	 */
    //	public static double approximiereWurzel2(int n) {
    //		int[] folge = berechneWurzel2Folge(n);
    //		return new Kettenbruch(folge).werteIterativAus();
    //	}
    //
    //	/**
    //	 * approximiert den Wert der eulerschen Zahl mit Hilfe der Kettenbruchdarstellung mit n Elementen
    //	 * @param n die Anzahl der fuer die Approximation verwendeten Elemente
    //	 * @return der approximierte Wert fuer die eulersche Zahl
    //	 */
    //	public static double approximiereE(int n) {
    //		int[] eFolge = berechneEFolge(n);
    //		return new Kettenbruch(eFolge).werteIterativAus();
    //	}
    //
    //	/**
    //	 * berechnet die Folge fuer die Kettenbruch-Darstellung der Quadratwurzel von 2 mit den ersten n Elementen
    //	 * @param n die Anzahl der Elemente
    //	 * @return die Folge als Array, bei n <= 0 ein leeres Array
    //	 */
    //	public static int[] berechneWurzel2Folge(int n) {
    //		if (n <= 0) {
    //			return new int[0];
    //		}
    //		int[] folge = new int[n];
    //		// das gesamte Feld mit 2 befuellen
    //		// alternativ kann hier auch eine Schleife zum Befuellen verwendet werden
    //		Arrays.fill(folge, 2);
    //		// den ersten Wert durch eine 1 ersetzen
    //		folge[0] = 1;
    //		return folge;
    //	}
    //
    //	/**
    //	 * berechnet die Folge fuer die Kettenbruch-Darstellung der eulerschen Zahl mit den ersten n Elementen
    //	 * @param n die Anzahl der Elemente
    //	 * @return die Folge als Array,  bei n <= 0 ein leeres Array
    //	 */
    //	public static int[] berechneEFolge(int n) {
    //		if (n <= 0) {
    //			return new int[0];
    //		}
    //		int[] folge = new int[n];
    //		// erstes Element ist 2
    //		folge[0] = 2;
    //		// die folgenden Elemente besitzen das folgende Schema: 1, (2 * (i / 3 + 1)), 1
    //		// wobei die beiden 1 an den Positionen 3*n + 1 und 3*n auftreten
    //		for (int i = 1; i < n; i++) {
    //			switch(i % 3) {
    //			case 0:
    //			case 1:
    //				folge[i] = 1;
    //				break;
    //			case 2:
    //				folge[i] = 2 * (i / 3 + 1);
    //			}
    //		}
    //		return folge;
    //	}
    //
    //}
}
