package AlgoExpert.Medium;

public class MaxSubsetSumNoAdjacent {



    public int rob(int[] nums, int[] memo) {
        return this.robFrom(0, nums, memo);
    }

    private int robFrom(int i, int[] nums, int[] memo) {

        // No more houses left to examine.
        if (i >= nums.length) {
            return 0;
        }

        // Return cached value.
        if (memo[i] > -1) {
            return memo[i];
        }

        // Recursive relation evaluation to get the optimal answer.
        int ans = Math.max(this.robFrom(i + 1, nums, memo), this.robFrom(i + 2, nums, memo) + nums[i]);

        // Cache for future use.
        memo[i] = ans;
        return ans;
    }

}

