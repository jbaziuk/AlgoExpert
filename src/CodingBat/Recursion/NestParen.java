package CodingBat.Recursion;

public class NestParen {

    public static boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }

        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    public boolean nestParenUsingStartsAndEndsWith(String str) {
        if (str.length() == 0) {
            return true;
        }

        if(str.startsWith("(") && str.endsWith(")")){
            return nestParen(str.substring(1, str.length()-1));
        } else {
            return false;
        }
    }



}









