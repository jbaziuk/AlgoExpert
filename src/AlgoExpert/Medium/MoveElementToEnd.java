package AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        if (array == null || array.size() == 0) {
            return new ArrayList<>();
        }

        int start = 0;
        int end = array.size() - 1;

        while (start < end) {
            while (start < end && array.get(end) == toMove) {
                end--;
            }

            if (array.get(start) == toMove) {
                swap(start, end, array);
            }
            start++;
        }
        return array;
    }

    public static void swap(int start, int end, List<Integer> array) {
        int temp = array.get(start);
        array.set(start, array.get(end));
        array.set(end, temp);
    }

}
