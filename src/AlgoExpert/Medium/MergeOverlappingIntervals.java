package AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {


    public int[][] mergeOverlappingIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> mergedIntervals = new ArrayList<>();

        for (int[] interval : intervals) {
            if (mergedIntervals.isEmpty()) {
                mergedIntervals.add(interval);
                continue;
            }

            int currentIntervalStart = interval[0];
            int currentIntervalEnd = interval[1];
            int mergedIntervalStart = mergedIntervals.get(mergedIntervals.size() - 1)[0];
            int mergedIntervalEnd = mergedIntervals.get(mergedIntervals.size() - 1)[1];

            if (currentIntervalStart <= mergedIntervalEnd) {
                int end = Math.max(currentIntervalEnd, mergedIntervalEnd);
                mergedIntervals.set(mergedIntervals.size() - 1, new int[]{mergedIntervalStart, end});
            } else {
                mergedIntervals.add(new int[]{currentIntervalStart, currentIntervalEnd});
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

}
