package Recursion;

public class CountOfX {

    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return 1 + countX(str.substring(0, str.length() - 1));
        } else {
            return countX(str.substring(0, str.length() - 1));
        }
    }
}









