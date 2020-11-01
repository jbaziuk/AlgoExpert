package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int potentialMatch = target - nums[i];
            if (numsMap.containsKey(potentialMatch)) {
                System.out.printf("%s,%s%n", nums[i], numsMap.get(potentialMatch));
                return new int[]{i, numsMap.get(potentialMatch)};
            } else {
                numsMap.put(nums[i], i);
            }
        }
        System.out.println("We found no pairs.");
        return new int[0];
    }
}
