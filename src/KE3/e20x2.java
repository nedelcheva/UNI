package KE3;

public class e20x2 {
    public static void main(String[] args) {

        int[][] dreieck = new int[8][];
        for (int i = 0; i < dreieck.length; i++) {
            dreieck[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                System.out.print(dreieck[i][j] = i + j);
            }
            System.out.println();
        }


        double[][] einheitsmatrix = new double[6][6];
        for (int row = 0; row < einheitsmatrix.length; row++) {
            for (int col = 0; col < einheitsmatrix[row].length; col++) {
                if(row == col) {
                    System.out.print(einheitsmatrix[row][col] = 1);
                } else {
                    System.out.print(einheitsmatrix[row][col] = 0);
                }
            }
            System.out.println();
        }

        int[][][] my3Array = new int[3][5][4];
        int summe = 0;
        for (int i = 0; i < my3Array.length; i++) {
            for (int j = 0; j < my3Array[i].length; j++) {
                for (int k = 0; k < my3Array[i][j].length; k++) {
                    summe += my3Array[i][j][k];
                }
            }
        }

    }

    int maximum(double feld[]) {
        if(feld.length <= 0) {
            return 0;
        }
        double max = feld[0];
        for (int i = 0; i < feld.length; i++) {
            if(feld[i] > max) {
                max = feld[i];
            }
        }
        return (int) max;
    }

    int minimum(double[][][] feld) {
        double min = feld [0][0][0];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                for (int k = 0; k < feld[i][j].length; k++) {
                    if(feld[i][j][k] < min) {
                        min = feld[i][j][k];
                    }
                }

            }
        }
        return (int) min;
    }
}
