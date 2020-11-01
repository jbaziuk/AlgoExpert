package AlgoExpert.Easy;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        if (str == null || str.equals("")) {
            return false;
        }

        int startingIndex = 0;
        int endingIndex = str.length() - 1;
        boolean isPal = true;
        while (startingIndex < endingIndex) {
            if (str.charAt(startingIndex) != str.charAt(endingIndex)) {
                isPal = false;
                break;
            }
            startingIndex += 1;
            endingIndex -= 1;
        }

        return isPal;
    }
}
