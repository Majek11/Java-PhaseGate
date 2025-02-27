public class CheckingIndex {

    public static void main(String[] args) {
        String num1 = "1210";
        boolean result1 = isChecking(num1);
        System.out.println("Return Value for Num1: " + result1);
        
        String num2 = "030";
        boolean result2 = isChecking(num2);
        System.out.println("Return Value for Num2: " + result2);
    }

    public static boolean isChecking(String num) {
        int length = num.length();
        
        int[] count = new int[10];
        
        for (int i = 0; i < length; i++) {
            int digit = num.charAt(i) - '0';
            count[digit] = count[digit] + 1; 
        }
        
        for (int i = 0; i < length; i++) {
            int expectedCount = num.charAt(i) - '0';
            int actualCount = count[i];              
            if (expectedCount != actualCount) {
                return false;
            }
        }
        
        return true;
    }
}

