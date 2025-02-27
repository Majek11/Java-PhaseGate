import java.util.Arrays;

public class UniqueElementt {
    public static void main(String[] args) {
        int[] input = {1, 3, 3, 3, 4, 1};
        int result = findFirstIndexOfMostOccurring(input);

        if (result != -1) {
            System.out.println("Output: " + result);
            int sum = sumMostOccurring(input);
            System.out.println("Sum of most occurring: " + sum);
        } else {
            System.out.println("Output: " + Arrays.toString(input));
        }
    }

    public static int findFirstIndexOfMostOccurring(int[] numbers) {
        int length = numbers.length;
        if (length == 0) {
            return -1;
        }

        int[] count = new int[10];
        
        for (int i = 0; i < length; i++) {
            int num = numbers[i];
            if (num >= 0 && num < 10) {
                count[num] = count[num] + 1;
            }
        }
        
        int maxCount = 0;
        int mostOccurring = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostOccurring = i;
            }
        }
        
        for (int i = 0; i < length; i++) {
            if (numbers[i] == mostOccurring) {
                return i;
            }
        }
        
        return -1;
    }

    public static int sumMostOccurring(int[] numbers) {
        int length = numbers.length;
        if (length == 0) {
            return 0;
        }

        int[] count = new int[10];
        
        for (int i = 0; i < length; i++) {
            int num = numbers[i];
            if (num >= 0 && num < 10) {
                count[num] = count[num] + 1;
            }
        }
        
        int maxCount = 0;
        int mostOccurring = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostOccurring = i;
            }
        }
        

        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] == mostOccurring) {
                sum = sum + numbers[i];
            }
        }
        
        return sum;
    }
}
