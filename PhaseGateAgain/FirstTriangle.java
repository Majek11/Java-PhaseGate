public class FirstTriangle {
  
  public static void main(String[] args) {
  
  int num = 10;
  
  for (int row = 1; row <= num; row++) {
    for ( int col = 1; col <= row; col++) {
    System.out.print("*");
  }
  System.out.println();
  }
}
}
