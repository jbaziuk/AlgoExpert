package AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        getPermutations(array, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    private static void getPermutations(
            List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> permutations) {
        if (array.size() == 0 && currentPermutation.size() > 0) {
            permutations.add(currentPermutation);
        } else {
            for (int i = 0; i < array.size(); i++) {
                List<Integer> newArray = new ArrayList<Integer>(array);
                newArray.remove(i);
                List<Integer> newPermutation = new ArrayList<Integer>(currentPermutation);
                newPermutation.add(array.get(i));
                getPermutations(newArray, newPermutation, permutations);
            }
        }
    }

    public static List<List<Integer>> getPermutationsUsingSwap(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        getPermutationsUsingSwap(0, array, permutations);
        return permutations;
    }

    private static void getPermutationsUsingSwap(int i, List<Integer> array, List<List<Integer>> permutations){
        if (i == array.size() - 1) {
            permutations.add(new ArrayList<Integer>(array));
        } else {
            for (int j = i; j < array.size(); j++) {
                swap(array, i, j);
                getPermutationsUsingSwap(i + 1, array, permutations);
                swap(array, i, j);
            }
        }
    }

    public static void swap(List<Integer> array, int i, int j) {
        Integer temp = array.get(i);
        array.set(i, array.get(j));
        array.set (j, temp);
    }

}
