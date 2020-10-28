package Recursion;

public class SumDigets {

    public static int sum(int n) {
        if (n % 10 == n) {
            return n;
        } else {
            return n % 10 + sum(n / 10);
        }
    }

    public static int sum2(int n) {
        int sum = 0;
        int moddedNumber;
        int divNumber;
        while (true) {
            moddedNumber = n % 10;
            divNumber = n / 10;
            if (moddedNumber == n) {
                return n;
            } else {
                return n % 10 + sum(n / 10);
            }
        }
    }


}
