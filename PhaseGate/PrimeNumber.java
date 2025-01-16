import java.util.Arrays;

public class PrimeNumber {

public static int[] getPrimeNumber(int[] number) {
      
    int count = 0;
    for (int i = 0; i < number.length; i += 2) count++;

    int[] result = new int[count];
    int index = 0;
    for (int i = 0; i < number.length; i += 2) {
            result[index++] = number[i];
        }
        return result;
  }
  
   public static void main(String[] args) {
    int[] listOfNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  System.out.println("Prime numbers: " + Arrays.toString(cd ..
  getPrimeNumber(listOfNumbers)));
  
  }
}
