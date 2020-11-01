package AlgoExpert.Easy;

public class Fibonacci {

    public static int getNthFib(int n) {
        int[] lastTwo = {0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextNum = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextNum;
            counter++;
        }
        if (n > 1) {
            return lastTwo[1];
        } else {
            return lastTwo[0];
        }
        //return n > 1 ? lastTwo[1] : lastTwo[0];
    }
}

