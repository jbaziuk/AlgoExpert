package Easy;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        if (array == null) {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int indexOfFoundInt = -1;

        if (array.length == 0 || target < array[leftIndex] || target > array[rightIndex]) {
            return indexOfFoundInt;
        }

        while (leftIndex <= rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            int potentialMatch = array[middle];
            if (target == potentialMatch) {
                indexOfFoundInt = middle;
                break;
            } else if (target < potentialMatch) {
                rightIndex = middle - 1;
            } else {
                leftIndex = middle + 1;
            }
        }
        return indexOfFoundInt;
    }
}

