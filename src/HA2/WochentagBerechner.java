package HA2;

public class WochentagBerechner {

        /**
         * es wird der Wochentag zu einem gueltigen Datum bestimmt
         *
         * @param tag der Tag (0 < tag <= 31)
         * @param monat der Monat (0 < monat <= 12)
         * @param jahr die vierstellige Jahreszahl (z. B. 2009)
         */
        public void berechneWochentag(int tag, int monat, int jahr) {
            switch (monat) {
                case 1:
                    monat = 13;
                    jahr--;
                    break;
                case 2:
                    monat = 14;
                    jahr--;
                    break;

            }
            int c = jahr / 100;
            jahr = jahr % 100;


            int wochentag = (tag + (26 * (monat + 1))/10 + (5 * jahr)/4 + c/4 + 5 * c - 1) % 7;

            switch (wochentag) {
                case 0:
                    System.out.println("Sonntag");
                    break;
                case 1:
                    System.out.println("Montag");
                    break;
                case 2:
                    System.out.println("Dienstag");
                    break;
                case 3:
                    System.out.println("Mittwoch");
                    break;
                case 4:
                    System.out.println("Donnerstag");
                    break;
                case 5:
                    System.out.println("Freitag");
                    break;
                case 6:
                    System.out.println("Samstag");
                    break;
            }


        }

        public static void main(String[] args) {
            // Diese Variablen koennen sie veraendern, um Ihre
            // Implementierung zu testen
            int t = 6; // der Tag
            int m = 1; // der Monat
            int j = 2000; // das Jahr
            // Der nachfolgende Quelltext erzeugt nur die Ausgabe
            System.out.print("Der ");
            System.out.print(t);
            System.out.print(".");
            System.out.print(m);
            System.out.print(".");
            System.out.print(j);
            System.out.print(" ist ein ");
            new WochentagBerechner().berechneWochentag(t, m, j);

            int y = 6;
            do {
                System.out.print("X");
                if (y * 2 > 6) {
                    y = y - 1;
                } else {
                    y = y - 2;
                }
            } while (y >= 3);

        }


    }

