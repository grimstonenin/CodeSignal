package test.java;

import main.java.IsLuckyNumber;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsLuckyNumberTest {

    private IsLuckyNumber isLuckyNumber;

    @Before
    public void init(){
        isLuckyNumber = new IsLuckyNumber();
    }

    @Test
    public void shouldReturnFalse(){
        isLuckyNumber.isLucky(4567);
    }

    @Test
    public void shouldReturnTrue(){
        assertTrue(isLuckyNumber.isLucky(1230));
    }
}
