public class ArrayHighest {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 1000, 1000, -1000};
        int[] result = findTwoHighest(numbers);
        System.out.printf("Highest One : %d%n", result[0]);
        System.out.printf("Highest Two : %d%n", result[1]);
    }

    public static int[] findTwoHighest(int[] numbers) {
        int maximumOne = Integer.MIN_VALUE;
        int maximumTwo = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maximumOne) {
                maximumTwo = maximumOne;
                maximumOne = numbers[i];
            } else if (numbers[i] > maximumTwo && numbers[i] != maximumOne) {
                maximumTwo = numbers[i];
            }
        }
        
        int[] result = new int[2];
        result[0] = maximumOne;
        result[1] = maximumTwo;
        return result;
    }
}
