package LeetCode.Easy;

public class ClimbingStairs {

    public static int OneOrTwoStepsToNthStair(int n) {
        if(n == 0){
            return 0;
        }
        int[] cache = new int[]{1, 2};
        for (int i = 3; i <= n; i++) {
            int currentTotal = cache[0] + cache[1];
            cache[0] = cache[1];
            cache[1] = currentTotal;
        }
        if (n == 1) {
            return cache[0];
        } else {
            return cache[1];
        }
    }

    public static int OneTwoOrThreeStepsToNthStair(int n) {
        if(n == 0){
            return 0;
        }
        int[] cache = new int[]{1, 1, 2};
        for (int i = 3; i <= n; i++) {
            int currentTotal = cache[0] + cache[1] + cache[2];
            cache[0] = cache[1];
            cache[1] = cache[2];
            cache[2] = currentTotal;
        }
        if (n == 1) {
            return cache[0];
        } else {
            return cache[2];
        }
    }

    public static int stepsToNthStair(int numberOfWays, int stepHeight) {
        if(stepHeight == 0){
            return 0;
        }
        int[] cache = new int[]{1, 1, 2};
        for (int i = 3; i <= stepHeight; i++) {
            int currentTotal = cache[0] + cache[1] + cache[2];
            cache[0] = cache[1];
            cache[1] = cache[2];
            cache[2] = currentTotal;
        }
        if (stepHeight == 1) {
            return cache[0];
        } else {
            return cache[2];
        }
    }
}
