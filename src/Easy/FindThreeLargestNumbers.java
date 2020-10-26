package Easy;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        for (int num : array) {
            updateLargest(threeLargest, num);
        }
        return threeLargest;
    }

    public static void updateLargest(int[] threeLargest, int num) {
        if (num > threeLargest[2]) {
            shiftAndUpdate(threeLargest, num, 2);
        } else if (num > threeLargest[1]) {
            shiftAndUpdate(threeLargest, num, 1);
        } else if (num > threeLargest[0]) {
            shiftAndUpdate(threeLargest, num, 0);
        }
    }

    public static void shiftAndUpdate(int[] threeLargest, int num, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                threeLargest[i] = num;
            } else {
                threeLargest[i] = threeLargest[i + 1];
            }
        }
    }
}

