package KE3;

import java.util.Scanner;

public class Auto {
    //18.4.3
    double tankCurrent;
    double tankMax;
    double verbrauch;
    double strecke;
    boolean isGefahren;

    public Auto(double tankMax, double verbrauch, double tankCurrent) {
        this.tankMax = tankMax;
        this.verbrauch = verbrauch;
        this.tankCurrent = tankCurrent;
    }

    public void tanken() {
        if(this.tankCurrent < this.tankMax) {
            tankCurrent = tankMax;
        }
    }

    public boolean fahren(double strecke) {
        double needed = (this.verbrauch / 100) * strecke;
        if (needed <= this.tankCurrent) {
            this.tankCurrent -= needed;
            return isGefahren = true;
        }
        return isGefahren = false;
    }

}

class Autofahrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tankMax = Double.parseDouble(scanner.nextLine());
        double tankCurren = Double.parseDouble(scanner.nextLine());
        double verbrauch = Double.parseDouble(scanner.nextLine());
        Auto auto = new Auto(tankMax, verbrauch,tankCurren);

        double strecke = Double.parseDouble(scanner.nextLine());
        if(auto.fahren(strecke)) {
            System.out.println("You arrived!");
        } else {
            System.out.println("Go tanken!");
            auto.tanken();
        }

    }
        }
