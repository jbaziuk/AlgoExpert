package AlgoExpert.Medium;

import java.util.HashSet;

public class FirstDuplicateValue {


    public int firstDuplicateValueUsingNegativeMarking(int[] array) {
        for (int value : array) {
            int absValue = Math.abs(value);
            if (array[absValue - 1] < 0) {
                return absValue;
            }
            array[absValue - 1] *= -1;
        }
        return -1;
    }

    public int firstDuplicateValueUsingSet(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            if (set.contains(num)){
                return num;
            } else{
                set.add(num);
            }
        }
        return -1;
    }

}
