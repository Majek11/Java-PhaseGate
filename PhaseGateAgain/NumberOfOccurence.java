public class NumberOfOccurence {

    public static void main(String[] args) {
        String word = "Hello World Mr Tobi Facilitator";
        char letter = 'o';
        int result = countOccurrences(word, letter);
        System.out.println("Number of '" + letter + "'s: " + result);
    }

    public static int countOccurrences(String word, char letter) {
        int count = 0;
        int length = word.length();
        
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
