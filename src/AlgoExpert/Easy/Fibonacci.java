package AlgoExpert.Easy;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static int getNthFibUsingDynamicProgrammingUsingWhileLoop(int n) {
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

    public static int getNthFibUsingDynamicProgrammingUsingForLoop(int n) {

        int first = 0;
        int second = 1;

        for (int x=3; x <= n; x++){
            int nextFib = first + second;
            first = second;
            second = nextFib;
        }

        return n > 1 ? second : first;
    }

    public static int getNthFibUsingDynamicProgrammingUsingForLoop2(int n) {
        // 1  2  3  4  5 - index
        // 0, 1, 1, 2, 3, 5

        if (n < 2) {
            return 0;
        }

        if (n == 2 || n == 3) {
            return 1;
        }

        int fibOfNMinusTwo = 1;
        int fibOfNMinusOne = 1;
        int fib = 0;

        for (int i = 4; i <= n; i++){
            fib = fibOfNMinusOne + fibOfNMinusTwo;
            fibOfNMinusOne = fibOfNMinusTwo;
            fibOfNMinusTwo = fib;
        }

        return fib;
    }

    public static int getNthFibRecursive(int n) {
        if (n == 2){
            return 1;
        } else if (n == 1){
            return 0;
        } else{
            return getNthFibRecursive(n - 1) + getNthFibRecursive(n - 2);
        }
    }


    public static int getNthFibUsingRecursiveWithMemoization(int n) {
        Map<Integer,Integer> memoize = new HashMap<>();
        memoize.put(1,0);
        memoize.put(2,1);
        return getNthFib(n, memoize);
    }

    private static int getNthFib(int n, Map<Integer, Integer> memoize) {
        if (memoize.containsKey(n)) {
            return memoize.get(n);
        } else {
            memoize.put(n, getNthFib(n - 1, memoize) + getNthFib(n - 2, memoize));
            return memoize.get(n);
        }
    }

    public static int fibGoldenRatio(int N) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(goldenRatio, N) / Math.sqrt(5));
    }

}

