import org.junit.Test;
import static org.junit.Assert.*;

public class GreatestCommonDivisorTest {
    
    @Test
    public void testGCDWithPositiveNumbers() {
        assertEquals(6, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(12, 18));
        assertEquals(5, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(25, 15));
        assertEquals(1, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(7, 13));
    }
    
    @Test
    public void testGCDWithZero() {
        assertEquals(1, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(1, 0));
        assertEquals(1, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(5, 0));
        assertEquals(1, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(0, 0));
    } 
    
    @Test
    public void testGCDWithNegativeNumbers() {
        assertEquals(6, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(-12, 18));
        assertEquals(5, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(-25, -15));
        assertEquals(1, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(-7, 13));
    }
    
    @Test
    public void testGCDWithSameNumbers() {
        assertEquals(10, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(10, 10));
        assertEquals(25, GreatestCommonDivisor.findGreatestCommonDivisorBetweenTwoNumbers(25, 25));
    }
}


