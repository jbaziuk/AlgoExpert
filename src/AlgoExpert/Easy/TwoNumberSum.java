package AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    public static int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
    public static int targetSum = 10;

    public static int[] twoNumberSum(int[] numbers, int targetSum) {
        Set<Integer> nums = new HashSet<>();
        for (int num : numbers) {
            int potentialMatch = targetSum - num;
            if (nums.contains(potentialMatch)) {
                System.out.printf("%s,%s%n", num, potentialMatch);
                return new int[]{num, potentialMatch};
            } else {
                nums.add(num);
            }
        }
        System.out.println("We found no pairs.");
        return new int[0];
    }

    public static ArrayList<int[]> returnAllPairsForTwoNumberSum(int[] numbers, int targetSum) {
        Set<Integer> nums = new HashSet<>();
        ArrayList<int[]> pairs = new ArrayList<>();

        for (int num : numbers) {
            int potentialMatch = targetSum - num;
            if (nums.contains(potentialMatch)) {
                System.out.printf("We found a pair: %s,%s%n", num, potentialMatch);
                pairs.add(new int[]{num, potentialMatch});
            } else {
                nums.add(num);
            }
        }
        return pairs;
    }


}
