package AlgoExpert.Easy;

import java.util.HashMap;

public class GenerateDocument {

    public boolean generateDocument(String characters, String document) {

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char ch : characters.toCharArray()) {
            if(counts.containsKey(ch)){
                counts.put(ch, counts.get(ch) + 1);
            } else {
                counts.put(ch, 1);
            }
        }
        for (char ch : document.toCharArray()){
            if(!counts.containsKey(ch) || counts.get(ch) == 0){
                return false;
            } else {
                counts.put(ch, counts.get(ch) - 1);
            }
        }

        return true;
    }
}

