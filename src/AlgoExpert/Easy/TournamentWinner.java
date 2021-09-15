package AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.Hashtable;

public class TournamentWinner {

    public int HOME_TEAM_WON = 1;

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBestTeam = "";
        Hashtable<String,Integer> pointsTable = new Hashtable<>();
        pointsTable.put(currentBestTeam, 0);

        int counter = 0;

        for( ArrayList<String> comp: competitions) {

            String homeTeam = comp.get(0);
            String awayTeam = comp.get(1);

            String winningTeam = (results.get(counter) == HOME_TEAM_WON) ? homeTeam : awayTeam;

            updatePoints(winningTeam, 3, pointsTable);

            if (pointsTable.get(winningTeam) > pointsTable.get(currentBestTeam)){
                currentBestTeam = winningTeam;
            }
            counter++;
        }
        return currentBestTeam;
    }

    public void updatePoints(String team, int points, Hashtable<String,Integer> pointsTable){
        if (!pointsTable.containsKey(team)){
            pointsTable.put(team, 0);
        }
        pointsTable.put(team, pointsTable.get(team) + points);
    }



}

