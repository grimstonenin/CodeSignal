package test.java;

import main.java.CommonCharacterCount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommonCharacterCountTest {

    private CommonCharacterCount commonCharacterCount;

    @Before
    public void init(){
        commonCharacterCount = new CommonCharacterCount();
    }

    @Test
    public void shouldCountCommonCharactersBetweenTwoStrings(){
        assertEquals(1, commonCharacterCount.commonCharacterCount("aba" , "bb"));
    }

}
