package SumOfTheNumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jaymilnamow on 5/23/16.
 */

public class SumOfTheNumbersSpec {

    @Test
    public void sumOfLesserValuesTest(){
        SumOfTheNumbers test;
        test = new SumOfTheNumbers();
        int expectedValue = 6;
        int actualValue = test.sumOfLesserValues();
        assertEquals("Expected value should add up to 6",expectedValue,actualValue);
    }

}
