package KlausurSS19;

public class Aufgabe2 {

    public static void main(String[] args) {
        System.out.println(new Aufgabe2().gaius("java", true));
        System.out.println(new Aufgabe2().gaius("ofaf", false));

    }

    String gaius(String s, boolean enc) {
        String resul = "";
        char l = 'a';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= l && s.charAt(i) <= l+25) { // if it is from a to z tests
                resul += e(s.charAt(i), enc ? 5 : -5); // if oben ist true nimmt 5 if oben ist false nimmt -5
            }
        }
        return resul;
    }

    char e(char x, int y) {
        x += y;
        if (y >0 && x>'z') {
            x -= 'z' - 'a' + 1;
        }
        if (y<0 && x<'a') {
            x+='z' - 'a' + 1;
        }
        return x;
    }
}
