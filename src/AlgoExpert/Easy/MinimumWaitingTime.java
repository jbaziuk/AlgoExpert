package AlgoExpert.Easy;

import java.util.Arrays;

public class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        int totalWaitingTime = 0;
        int count = 0;
        Arrays.sort(queries);

        for(int currentQueryDuration : queries){
            int queriesLeft = queries.length - (count + 1);
            totalWaitingTime += queriesLeft * currentQueryDuration;
            count +=1;
        }
        return totalWaitingTime;
    }

}

