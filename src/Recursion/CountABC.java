package Recursion;

public class CountABC {

    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'c') {
            return 1 + countAbc(str.substring(1));
        } else if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'a') {
            return 1 + countAbc(str.substring(1));
        } else {
            return countAbc(str.substring(1));
        }
    }

}









