package DynamicProgramming;

public class AddNumbers {

    public static int addNumbersToN(int n){
        int[] sums = new int[]{0,0};
        for(int i=1; i<=n; i++){
            int currentTotal = sums[1] + i;
            sums[0] = sums[1];
            sums[1] = currentTotal;
        }
        if (n == 0){
            return sums[0];
        } else {
            return sums[1];
        }
    }

    public static int addNumbersToN2(int n){
        int currentTotal = 0;
        for(int i=1; i<=n; i++){
            currentTotal = currentTotal + i;
        }
        return currentTotal;
    }

}
