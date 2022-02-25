package AlgoExpertTests.Easy;

import AlgoExpert.Easy.Cypher;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CypherTests {

    @Test
    public void canBeFound() {
        Assert.assertEquals("ccc", Cypher.caesarCypherEncryptor("aaa", 2));
    }

    @Test
    public void canBeFoundGreatThat26() {
        Assert.assertEquals(Cypher.caesarCypherEncryptor("abc", 30), "efg");
    }


}
