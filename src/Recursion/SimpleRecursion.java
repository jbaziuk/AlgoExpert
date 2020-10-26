package Recursion;

public class SimpleRecursion {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum2(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x + sum(x - 1);
        }
    }

}
