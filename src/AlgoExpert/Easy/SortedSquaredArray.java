package AlgoExpert.Easy;

import java.util.*;

public class SortedSquaredArray {


    public static int[] sortedSquaredArray(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }

        int[] squares = new int[array.length];
        int counter = 0;

        for(int num : array){
            squares[counter] = num * num;
            counter++;
        }

        Arrays.sort(squares);

        return squares;
    }

    public int[] sortedSquaredArray2(int[] array) {
        int[] squares = new int[array.length];
        for(int idx = 0; idx < array.length; idx++){
            int value = array[idx];
            squares[idx] = value * value;
        }
        Arrays.sort(squares);
        return squares;
    }
}
