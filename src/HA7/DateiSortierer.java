package HA7;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class DateiSortierer {

    public StringListe einlesen(String dateiname) throws DateiNichtGefundenAusnahme, IOException {
        StringListe list = new StringListe();
        try {
            BufferedReader br = new BufferedReader(new FileReader(dateiname));
            try{
                String line = br.readLine();
                while (line != null) {
                    list.add(line);
                    line = br.readLine();
                }
            } finally {
                br.close();
            }
        } catch (FileNotFoundException e) {
            throw new DateiNichtGefundenAusnahme(dateiname);
        } catch (IOException e) {
            throw new IOException();
        }
        return list;
    }

    public StringListe sortiere(StringListe unsortierteListe) {
        if (unsortierteListe == null) {
            throw new IllegalArgumentException("null ist ein ungueltiges Argument.");
        }
        Collections.sort(unsortierteListe);
        //unsortierteListe = unsortierteListe.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toCollection(StringListe::new));
        return unsortierteListe;
    }

    public void gebeAus(OutputStream out, StringListe zeilen) {
        PrintStream ps = new PrintStream(out);
        for (String s : zeilen) {
            ps.println(s);
        }
    }

    public void sortiereDatei(String dateiname) {
        StringListe liste = new StringListe();
        try {
            liste = einlesen(dateiname);
        } catch (DateiNichtGefundenAusnahme e) {
            System.err.print("Die Datei " + e.liefereDateinamen() + " konnte nicht gefunden werden.");

        } catch (IOException e) {
            System.err.print(e.getMessage());
        }

        liste = sortiere(liste);
        gebeAus(System.out, liste);
    }
}


class DateiNichtGefundenAusnahme extends Exception {
    private String dateiname;
    public DateiNichtGefundenAusnahme(String dateiname) {
        super("Datei wurde nicht gefunden.");
        this.dateiname = dateiname;
    }


    public String liefereDateinamen() {
        return this.dateiname;
    }

}

/**
 * eine Liste die Zeichenketten enthaelt
 * @author schreier
 *
 */
 class StringListe extends LinkedList<String> {

    /**
     * erzeugt eine neue leere Liste
     */
    public StringListe() {
    }

}