package Recursion;

public class Array220 {

    public static boolean array220(int[] nums, int index) {
        if(index > nums.length - 2 ){
            return false;
        }
        if (nums[index] * 10 == nums[index+1]){
            return true;
        }
        return array220(nums, index+1);
    }


}









