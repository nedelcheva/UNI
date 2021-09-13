package KlausurSS19;

public class Rechteck {
    double x;
    double y;
    double w; // breite
    double h; // hohe


    public Rechteck(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public double[][] getEdgePoints() {

        double[] axisX = {this.x - (this.w / 2), this.x + (this.w / 2)};
        double[] axisY = {this.y - (this.h / 2), this.y + (this.h / 2)};

        return new double[][]{axisX, axisY};
    }

    boolean collision(Rechteck neuRechteck, Rechteck meinRechteck) {

        double rechteckHorizontalMin = meinRechteck.getEdgePoints()[0][0];
        double rechteckHorizontalMax = meinRechteck.getEdgePoints()[0][1];
        double rechteckVertikalMin = meinRechteck.getEdgePoints()[1][0];
        double rechteckVertikalMax = meinRechteck.getEdgePoints()[1][1];

        double arechteckHorizontalMin = neuRechteck.getEdgePoints()[0][0];
        double arechteckHorizontalMax = neuRechteck.getEdgePoints()[0][1];
        double arechteckVertikalMin = neuRechteck.getEdgePoints()[1][0];
        double arechteckVertikalMax = neuRechteck.getEdgePoints()[1][1];




        boolean isHorizontalAlign = (arechteckHorizontalMin >= rechteckHorizontalMin && arechteckHorizontalMin <= rechteckHorizontalMax)
                || (arechteckHorizontalMax >= rechteckHorizontalMin && arechteckHorizontalMax <= rechteckHorizontalMax);
        boolean isVertikalAlign = (arechteckVertikalMin >= rechteckVertikalMin && arechteckVertikalMin <= rechteckVertikalMax)
                || (arechteckVertikalMax >= rechteckVertikalMin && arechteckVertikalMax <= rechteckVertikalMax);

        boolean aisHorizontalAlign = (rechteckHorizontalMin >= arechteckHorizontalMin && rechteckHorizontalMin <= arechteckHorizontalMax)
                || (rechteckHorizontalMax >= arechteckHorizontalMin && rechteckHorizontalMax <= arechteckHorizontalMax);
        boolean aisVertikalAlign = (rechteckVertikalMin >= arechteckVertikalMin && rechteckVertikalMin <= arechteckVertikalMax)
                || (rechteckVertikalMax >= arechteckVertikalMin && rechteckVertikalMax <= arechteckVertikalMax);




        if (isHorizontalAlign && isVertikalAlign) {
            return true;
        } else if(aisHorizontalAlign && aisVertikalAlign) {
            return true;
        }


        return false;
    }

    public static void main(String[] args) {

    }
}
