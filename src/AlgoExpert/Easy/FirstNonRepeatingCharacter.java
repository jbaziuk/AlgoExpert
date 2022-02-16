package AlgoExpert.Easy;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char ch : string.toCharArray()) {
            updateCounts(ch, counts);
        }

        int index = 0;
        for (char ch : string.toCharArray()) {
            if (counts.get(ch) == 1) {
                return index;
            }
            index += 1;
        }

        return -1;
    }

    public void updateCounts(char ch, HashMap<Character, Integer> counts) {

        if (counts.containsKey(ch)) {
            counts.put(ch, counts.get(ch) + 1);
        } else {
            counts.put(ch, 1);
        }
    }
}

