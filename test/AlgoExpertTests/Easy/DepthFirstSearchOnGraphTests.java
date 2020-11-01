package AlgoExpertTests.Easy;

import AlgoExpert.Easy.DepthFirstSearchOnGraph;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DepthFirstSearchOnGraphTests {
    DepthFirstSearchOnGraph.Node myGraph;

    @BeforeMethod
    public void beforeMethod() {
        myGraph = new DepthFirstSearchOnGraph.Node("A");
        myGraph.addChild("B");
        myGraph.addChild("C");
        myGraph.addChild("D");

        myGraph.children.get(0).addChild("E");
        myGraph.children.get(0).addChild("F");
        myGraph.children.get(0).children.get(1).addChild("I");
        myGraph.children.get(0).children.get(1).addChild("J");

        myGraph.children.get(2).addChild("G");
        myGraph.children.get(2).addChild("H");

        DepthFirstSearchOnGraph.Node now = myGraph.children.get(2).children.get(0).addChild("K");
        String temp = "1";
    }

    @Test
    public void printOutGraph() {
        List<String> expected = Arrays.asList("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H");
        Assert.assertEquals(expected, myGraph.depthFirstSearch(new ArrayList<>()));
    }

}
