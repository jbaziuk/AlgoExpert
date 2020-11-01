package AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.List;

public class ProductSumOfSpecialArray {

    public static int productSum(List<Object> array) {
        if (array == null || array.size() == 0) {
            return 0;
        }
        return productSumHelper(array, 1);
    }

    public static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object item : array) {
            if (item.getClass().getSimpleName().equals("ArrayList")) {
                @SuppressWarnings("unchecked")
                List<Object> innerList = (ArrayList<Object>) item;
                sum += productSumHelper(innerList, multiplier + 1);
            } else {
                sum += (int) item;
            }
        }
        return sum * multiplier;
    }
}

