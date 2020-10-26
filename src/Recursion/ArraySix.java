package Recursion;

public class ArraySix {

    public static boolean array6(int[] nums, int index) {
        if (index > nums.length -1){
            return false;
        }
        if(nums[index] == 6){
            return true;
        }
        return array6(nums, index+1);
    }

}









