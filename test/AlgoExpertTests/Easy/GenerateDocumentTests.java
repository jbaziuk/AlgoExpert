package AlgoExpertTests.Easy;

import AlgoExpert.Easy.GenerateDocument;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GenerateDocumentTests {

    @Test
    public void canGenerateDocTest() {
        GenerateDocument doc = new GenerateDocument();
        Assert.assertTrue(doc.generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
    }


}
