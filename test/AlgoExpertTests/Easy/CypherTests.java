package AlgoExpertTests.Easy;

import AlgoExpert.Easy.Cypher;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CypherTests {

    @Test
    public void canBeFound() {
        Assert.assertEquals("bbb", Cypher.caesarCypherEncryptor("aaa", 1));
    }


}
