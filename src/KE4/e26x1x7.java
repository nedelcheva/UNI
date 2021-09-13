package KE4;

public class e26x1x7 {

    public boolean ckeckName(String name) {
        if (!isEmptyString(name) && firstIsChar(name) && restInNameChar(name)) {
            printName(name);
            return true;
        }
        System.out.println("Illigal name");
        return false;
    }

    private void printName(String name) {
        System.out.println(name.substring(0,1).toUpperCase());
        System.out.println(name.substring(1,name.length()).toLowerCase());
    }

    private boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z')
                || (c >= 'a' && c <= 'z');
    }


    private boolean isNameChar(char c) {
        return isLetter(c) || isHyphen(c);
    }

    private boolean isHyphen(char c) {
        return c == '-';
    }

    private boolean isEmptyString(String name) {
        return name.length() == 0;
    }

    private boolean firstIsChar(String name) {
        return isLetter(name.charAt(0));
    }

    private boolean restInNameChar(String name) {
        boolean yes = true;
        for (int i = 0; i < name.length(); i++) {
            if(!isNameChar(name.charAt(i))) {
                yes = false;
                break;
            }
        }
        return yes;
    }
}
