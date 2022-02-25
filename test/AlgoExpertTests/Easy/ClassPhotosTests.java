package AlgoExpertTests.Easy;

import AlgoExpert.Easy.ClassPhotos;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassPhotosTests {

    @Test
    public void minWaitTime() {
        ClassPhotos photos = new ClassPhotos();
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(5,8,1,3,4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(6,9,2,4,5));
        Assert.assertEquals(photos.classPhotos(redShirtHeights, blueShirtHeights), true);
    }

}
