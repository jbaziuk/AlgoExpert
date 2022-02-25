package AlgoExpert.Medium;

public class MonotonicArray {

    /* https://stackoverflow.com/questions/18788063/why-does-false-falsefalsetrue-return-true

        true && false = false // Evaluates false because the second is false
        false && true = false // Evaluates false because the first is false
        true && true = true // Evaluates true because both are true
        false && false = false// Evaluates false because both are false*/

    /*  true || false = true // Evaluates true because the first is true
        false || true = true // Evaluates true because the second is true
        true || true = true // Evaluates true because both are true
        false || false = false // Evaluates false because both are false*/


    public static boolean isMonotonic(int[] array) {
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;

        for(int i = 1; i < array.length; i++){
            int previousNumber = array[i - 1];
            int currentNumber = array[i];

            if(currentNumber < previousNumber){
                isNonDecreasing = false;
            }
            if(currentNumber > previousNumber){
                isNonIncreasing = false;
            }
        }
        return isNonDecreasing || isNonIncreasing;
    }

}
