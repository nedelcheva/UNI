import java.util.Arrays;
import java.util.Scanner;




public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int u = 0;
        int v = 0;
        int w = 0;
        int y = 0;
        int x = 0;
        int z = 0;

       // !(u && v || w && !x || y && z && !u || z && v && !y || (x && (y || !(x && z && w) && !(y || z))) && !(!z && !y || y && x && !z))

        System.out.println(Integer.MAX_VALUE + 1 > Integer.MAX_VALUE);

        int schlussel = 3;
        String [] word = scanner.nextLine().split("");
        StringBuilder newWord = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            char temp = word[i].charAt(0);
            temp -= 3;
            newWord.append(temp);
        }

        System.out.println(newWord);
    }





























}

