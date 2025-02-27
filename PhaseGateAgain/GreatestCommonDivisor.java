public class GreatestCommonDivisor {
    
    public static int findGreatestCommonDivisorBetweenTwoNumbers(int number1, int number2) {
        int gcd = 1;
        int smallest;
        
        if (number1 < number2) {
            smallest = number1;
        } else {
            smallest = number2;
        }
        
        for (int i = 1; i <= smallest; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        
        return gcd;
    }
    
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 40;
        int result = findGreatestCommonDivisorBetweenTwoNumbers(number1, number2);
        System.out.printf("GCD is: %d%n", result);
    }
}


