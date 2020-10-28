package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> sums = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    sums.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if (targetSum > currentSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sums;
    }

}
