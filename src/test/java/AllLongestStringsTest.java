package test.java;

import main.java.AllLongestStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AllLongestStringsTest {

    private AllLongestStrings allLongestStrings;

    @Before
    public void init(){
        allLongestStrings = new AllLongestStrings();
    }

    @Test
    public void testIfStringsAreCollected() {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        String[] resultArray = {"aba", "vcd", "aba"};
        assertArrayEquals(resultArray, allLongestStrings.allLongestStrings(inputArray));

    }

}
