import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHighestTest {

    @Test
    public void testNormalArray() {
        int[] numbers = new int[8];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 1000;
        numbers[6] = 1000;
        numbers[7] = -1000;
        
        int[] result = ArrayHighest.findTwoHighest(numbers);
        assertEquals(1000, result[0]); 
        assertEquals(50, result[1]);   
    }
    
}
