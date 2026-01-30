package myPackage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VowelSwapTest{

    @Test
    public void testThatSwapVowelsMethodExist(){
        Assertions.assertNotNull(VowelSwap.swapVowels("dayo",'a')); 
    }

    @Test
    public void testThatCharacterIsNotPresent(){
        String actual = VowelSwap.swapVowels("vowels",'i');
        String expected = "vowels";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatCharacterIsPresent(){
        String actual = VowelSwap.swapVowels("dayo",'a');
        String expected = "daoy";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatEmptyStringReturnsEmptyString(){
        String actual = VowelSwap.swapVowels("",'a');
        String expected = "";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testThatEmptyCharacterReturnsString(){
        String actual = VowelSwap.swapVowels("dayo",' ');
        String expected = "dayo";
        Assertions.assertEquals(actual,expected);
    }
}
