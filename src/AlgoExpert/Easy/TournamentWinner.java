package AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {

    public int HOME_TEAM_WON = 1;

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBestTeam = "";
        HashMap<String,Integer> pointsTable = new HashMap<>();
        pointsTable.put(currentBestTeam, 0);

        for(int idx = 0; idx < competitions.size(); idx++ ) {

            ArrayList<String> comp = competitions.get(idx);
            String homeTeam = comp.get(0);
            String awayTeam = comp.get(1);

            int result = results.get(idx);

            String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

            updatePoints(winningTeam, 3, pointsTable);

            if (pointsTable.get(winningTeam) > pointsTable.get(currentBestTeam)){
                currentBestTeam = winningTeam;
            }
        }
        return currentBestTeam;
    }

    public void updatePoints(String team, int points, HashMap<String,Integer> pointsTable){
        if (!pointsTable.containsKey(team)){
            pointsTable.put(team, 0);
        }
        pointsTable.put(team, pointsTable.get(team) + points);
    }



}

