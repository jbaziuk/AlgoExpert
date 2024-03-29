package AlgoExpertTests.Easy;

import AlgoExpert.Easy.Cypher;
import AlgoExpert.Easy.TournamentWinner;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class TournamentWinnerTests {

    @Test
    public void winningTeamIsReturmed() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();

        ArrayList<String> competiton1 = new ArrayList<>();
        competiton1.add(0, "HTML");
        competiton1.add(1, "C#");

        ArrayList<String> competiton2 = new ArrayList<>();
        competiton2.add(0, "C#");
        competiton2.add(1, "Python");

        ArrayList<String> competiton3 = new ArrayList<>();
        competiton3.add(0, "Python");
        competiton3.add(1, "HTML");

        competitions.add(competiton1);
        competitions.add(competiton2);
        competitions.add(competiton3);


        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        TournamentWinner tw = new TournamentWinner();

        String textResults = tw.tournamentWinner(competitions, results);

        Assert.assertEquals(textResults, "Python");
    }

    @Test
    public void testTernaryOperatorTrue() {

        int num = 18;
        String msg = num > 10
                ? "Number is greater than 10"
                : "Number is less than or equal to 10";

        Assert.assertEquals(msg, "Number is greater than 10");
    }

    @Test
    public void testTernaryOperatorInOneLineTrue() {

        int num = 18;
        String msg = num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";

        Assert.assertEquals(msg, "Number is greater than 10");

    }


    @Test
    public void testTernaryOperatorFalse() {
        int num = 8;
        String msg = num > 10
                ? "Number is greater than 10"
                : "Number is less than or equal to 10";

        Assert.assertEquals(msg, "Number is less than or equal to 10");
    }

}
