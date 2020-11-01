package AlgoExpert.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidateSubSequence {

    public static List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
    public static List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;

        while (arrIdx < array.size() && seqIdx < sequence.size()) {
            if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
                seqIdx++;
            }
            arrIdx++;
        }
        return Objects.equals(seqIdx, sequence.size());
    }

    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        if (array == null || array.size() == 0) {
            return false;
        } else if (sequence == null || sequence.size() == 0) {
            return false;
        } else if (array.size() < sequence.size()) {
            return false;
        }

        int seqIndex = 0;
        boolean isSubSequence = false;

        for (int num : array) {
            if (num == sequence.get(seqIndex)) {
                seqIndex++;
            }

            if (seqIndex > sequence.size() - 1) {
                isSubSequence = true;
                break;
            }

        }
        return isSubSequence;
    }


}
