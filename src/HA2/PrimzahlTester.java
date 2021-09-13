package HA2;

public class PrimzahlTester {

        /**
         * prueft ob die uebergebene nichtnegative Zahl eine Primzahl ist
         * wenn die uebergebene Zahl eine Primzahl ist, wir JA ausgegeben
         * ansonsten NEIN
         *
         * @param n die zu testende nichtnegative Zahl
         */
        public void istPrimzahl(long n) {
            // hier bitte den entsprechenden Quelltext ergaenzen
            boolean isPrimzahl = true;
            if(n == 1 || n == 0) {
                isPrimzahl = false;
            } else {
                // anfangen von i=2, weil 1 immer teilbar ist
                for (int i = 2; i < n; i++) {
                    // pruefen fuer jede Zahl zwischen 2 und n, ob es teilbar ist
                    if (n % i == 0) {
                        // wenn n Rest hat, ist sie nicht mehr Primzahl und folglich kann das Programm mit NEIN beenden
                        isPrimzahl = false;
                        break;
                    }
                }
            }
            if(isPrimzahl) {
                // wenn true
                System.out.println("JA");
            } else {
                // wenn false
                System.out.println("NEIN");
            }
        }


        // Opt. 1
        public static void main(String[] args) {
            // Diese Variable kaennen sie veraendern, um Ihre
            // Implementierung zu testen
            int x = 0;

            // Der nachfolgende Quelltext erzeugt nur die Ausgabe
            System.out.print("Ist ");
            System.out.print(x);
            System.out.println(" eine Primzahl?");
            new PrimzahlTester().istPrimzahl(x);
        }

        // Opt. 2  + static in istPrimzahl
    // public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //        long n = Long.parseLong(scanner.nextLine());
    //    istPrim(n);
    //
    //    }

    }
