package HA5;

import java.util.Scanner;

public class HA5_2 {
    public static void main(String[] args) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
        Scanner scanner = new Scanner(System.in);
        int tag = Integer.parseInt(scanner.nextLine());
        int km = Integer.parseInt(scanner.nextLine());
        System.out.println(new HA5_2().berechneMietpreis(tag, km));
    }

    public long berechneMietpreis(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
        double cost;
        if (tage <= 0) {
            throw new UngueltigeTagesanzahlAusnahme("Bei negativer Tagesanzahl wird keine Ausnahme geworfen.");
        }

        if(km < 0) {
            throw new UngueltigeKilometerangabeAusnahme("Bei negativer Kilometeranzahl wird keine Ausnahme geworfen.");
        }
        if(tage < 14) {
            cost = (2000 * tage) + 4000;
            if(km > 200) {
                cost += (km - 200) * 15;
            }
        } else {
            cost = 30000 + (km * 12);
        }
        return (long) cost;
    }

    class UngueltigeTagesanzahlAusnahme extends Exception {
        public UngueltigeTagesanzahlAusnahme(String message) {
            super(message);
        }

    }

    class UngueltigeKilometerangabeAusnahme extends Exception {
        public UngueltigeKilometerangabeAusnahme(String message) {
            super(message);
        }
    }

//     public static void main(String[] args) throws UngultigeTagesanzahl, UngultigeKilometreangabe {
//        Scanner scanner = new Scanner(System.in);
//        int tage = Integer.parseInt(scanner.nextLine());
//        int km = Integer.parseInt(scanner.nextLine());
//        System.out.println(new TEST().berechne(tage, km));
//    }
//
//    public long berechne (int tage, int km) throws UngultigeTagesanzahl, UngultigeKilometreangabe {
//        long summe = 0;
//        if(tage <= 0) {
//            throw new UngultigeTagesanzahl();
//        }
//        if(km <= 0) {
//            throw new UngultigeKilometreangabe();
//        }
//
//        if(tage < 14) {
//            summe += ((2000 * tage) + 4000) ;
//            if(km > 200) {
//                km -= 200;
//                summe += (16 * km);
//            }
//        }
//        summe += (30000 + (km * 12));
//
//        return summe/100;
//    }
//
//    private class UngultigeTagesanzahl extends Exception {
//        public UngultigeTagesanzahl() {
//            super("Must be positiv");
//        }
//    }
//
//    private class UngultigeKilometreangabe extends Exception {
//        public UngultigeKilometreangabe() {
//            super("Must be positiv");
//        }
//    }



}
