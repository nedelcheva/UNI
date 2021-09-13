package KlausurSS20;

public class Aufgabe3 {
    int h; //Grad des Quadrats
    int[][] values = {{8,3,4},{1,5,9},{6,7,2}}; //Quadrat speichern

    public static void main(String[] args) {
        int row = new Aufgabe3().rowssum(0);
        System.out.println(row);
        int cow = new Aufgabe3().columsum(0);
        System.out.println(cow);
        int dL = new Aufgabe3().diagonalL();
        System.out.println(dL);
        int dR = new Aufgabe3().diagonalR();
        System.out.println(dR);
        System.out.println(new Aufgabe3().istMagisches(row, cow,dL, dR));

    }

//    public Aufgabe3(int h, int[][] values) {
//        this.h = h;
//        this.values = values;
//    }

    public int rowssum(int i) {
        int summe = 0;
        for (int j = 0; j < values.length; j++) {
            summe += values[j][i];
        }
        return summe;
    }

    public int columsum(int i) {
        int summe = 0;
        for (int j = 0; j < values[i].length; j++) {
            summe += values[i][j];
        }
        return summe;
    }

    public int diagonalL() {
        int summe = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if(i == j) {
                    summe += values[i][j];
                }
            }
        }
        return summe;
    }

    public int diagonalR() {
        int summe = 0;
        for (int i = values.length - 1; i >= 0; i--) {
            for (int j = values[i].length - 1; j >= 0 ; j--) {
                if(i == j) {
                    summe += values[i][j];
                }
            }
        }
        return summe;
    }

    public boolean istMagisches(int row, int cow, int dL, int dR) {
        if(row == cow && cow == dL && dL == dR) {
            return true;
        }
        return false;
    }
}
