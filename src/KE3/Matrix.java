package KE3;

public class Matrix {
    double[][] eintraege;

    Matrix(int x, int y) {
        if(x <= 0 || y <= 0) {
            System.out.println("Ungueltige Matrix");
            return;
        }
        this.eintraege = new double[x][y];
    }

    Matrix(final double[][] eintraege) {
        if (eintraege.length <= 0 || eintraege[0].length <= 0) {
            System.out.println("Keine gueltige Matrix.");
            return;
        }
        this.eintraege = new double[eintraege.length][eintraege[0].length];
        for (int i = 0; i < this.eintraege.length; i++) {
            double[] e = eintraege[i];
            if(e.length != this.eintraege[0].length) {
                System.out.println("Eine Matrix muss rechteckig sein.");
                return;
            }
            for (int j = 0; j < this.eintraege[i].length; j++) {
                this.eintraege[i][j] = e[j];
            }
        }
    }

    Matrix transportiere() {
        Matrix transportiert = new Matrix(this.eintraege[0].length, this.eintraege.length);
        for (int i = 0; i < this.eintraege.length; i++) {
            for (int j = 0; j < this.eintraege[i].length; j++) {
                transportiert.eintraege[j][i] = this.eintraege[i][j];
            }
        }
        return transportiert;
    }

    Matrix addiereMit(Matrix m) {
        if(m.eintraege.length != this.eintraege.length || m.eintraege[0].length != this.eintraege[0].length) {
            System.out.println("Matrizen haben nicht das gleiche grosse.");
            return null;
        }
        Matrix summe = new Matrix(this.eintraege.length, this.eintraege[0].length);
        for (int i = 0; i < this.eintraege.length; i++) {
            for (int j = 0; j < this.eintraege[i].length; j++) {
                summe.eintraege[i][j] = this.eintraege[i][j] + m.eintraege[i][j];
            }
        }
        return summe;
    }
}
