package myPackage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BinaryTest{

    @Test
    public void testThatGetBinaryMethodExist(){
        Assertions.assertNotNull(Binary.getBinary(-5));
    }

    @Test
    public void testThatPositiveNumbersReturnPositveValue(){
        String actual = Binary.getBinary(5);
        String expected = "101";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatNegativeNumbersReturnPositiveValue(){
        String actual = Binary.getBinary(-10);
        String expected = "1010";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatZeroReturnsZero(){
        String actual = Binary.getBinary(0);
        String expected = "0";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatLargeNumbersReturnStringValueOfLargeNumbers(){
        String actual = Binary.getBinary(1000);
        String expected = "1111101000";
        Assertions.assertEquals(actual,expected);
    }
}
