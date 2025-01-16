import java.util.Arrays;

public class LargestNum {

  public static int largestElement(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
    int[] numbers = {1,5,3,4,5,14,15,900};
  System.out.println("Largest number: " + (largestElement(numbers)));
  System.out.println("Index: " + (numbers[0]));
  
  }

}



