package KE5;

public class SucheTeilfolge {
    public static void main(String[] args) {
        int [] folge = {1,2,3,4,5,6,7,8,9};
        int [] suchen = {4,5,6};

        System.out.println(new SucheTeilfolge().isTeilfolge(folge, suchen));
    }


        boolean isTeilfolge(int[] feld, int[] gesuchteFolge) {
            for (int i = 0; i < feld.length - gesuchteFolge.length + 1; i++) {
                for (int j = 0; j < gesuchteFolge.length; j++) {
                    if(feld[i + j] != gesuchteFolge[j]) {
                        break;
                    } else if (j == gesuchteFolge.length - 1) {
                        return true;
                    }
                }
            }
            return false;
        }

}
