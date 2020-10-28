package Medium;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int start = 0;
        int end = array.size() - 1;

        if (array.equals(null) || array.size() == 0) {
            return new ArrayList<>();
        }

        while (start < end) {
            if (array.get(start).equals(toMove) && !array.get(end).equals(toMove)) {
                swap(array, start, end);
                start += 1;
                end -= 1;
            } else if (!array.get(start).equals(toMove)) {
                start += 1;
            } else if (array.get(end).equals(toMove)) {
                end -= 1;
            }
        }
        return array;
    }

    public static void swap(List<Integer> array, int start, int end) {
        int temp = array.get(start);
        array.set(start, array.get(end));
        array.set(end, temp);
    }


}
