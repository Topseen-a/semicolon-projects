package myPackage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BaseTenTest{

    @Test
    public void testThatConvertToBaseTenMethodExist(){
        Assertions.assertNotNull(BaseTen.convertToBaseTen(1010));
    }

    @Test
    public void testThatBinaryNumbersReturnBaseValue(){
        int actual = BaseTen.convertToBaseTen(1010);
        int expected = 10;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatNegativeBinaryNumbersReturnPositiveBaseValue(){
        int actual = BaseTen.convertToBaseTen(-1010);
        int expected = 10;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatZeroReturnsZero(){
        int actual = BaseTen.convertToBaseTen(0);
        int expected = 0;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatLargeBinaryNumbersReturnBaseValue(){
        int actual = BaseTen.convertToBaseTen(1111101000);
        int expected = 1000;
        Assertions.assertEquals(actual,expected);
    }
}
