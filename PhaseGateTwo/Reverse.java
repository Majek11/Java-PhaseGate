public class Reverse {

  public static int reverse(int number) {
  
  int reverse = 0;
  int extract = 0;
  
  while ( number != 0 ) {
    extract = number % 10;
    reverse = 10 * reverse + extract;
    number /= 10;
    }
    return reverse;
  }
  
  public static void main(String[] args) {
    int number = -882123;
    System.out.println(reverse(number));
  }
}
