package AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {

    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        redShirtHeights.sort(Collections.reverseOrder());
        blueShirtHeights.sort(Collections.reverseOrder());

        if (redShirtHeights.get(0) == blueShirtHeights.get(0)){
            return false;
        }

        String shirtColorInFirstRow = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "RED" : "BLUE";


        for (int idx = 0; idx < redShirtHeights.size(); idx++) {
            int redShirtHeight = redShirtHeights.get(idx);
            int blueShirtHeight = blueShirtHeights.get(idx);

            if (shirtColorInFirstRow == "RED"){
                if (redShirtHeight >= blueShirtHeight){
                    return false;
                }
            } else {
                if (blueShirtHeight >= redShirtHeight){
                    return false;
                }
            }
        }
        return true;
    }

}

