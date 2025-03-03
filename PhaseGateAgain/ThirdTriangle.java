public class ThirdTriangle {
  public static void main(String[] args) {
  
   int num = 10;
  
  for ( int row = 1; row <= num; row++ ) {
    for ( int space = 1; space <= row; space++ ) {
      System.out.print(" ");
    }
    for ( int repeat = row; repeat <= num; repeat++ ) {
      System.out.print("*");
    }
    System.out.println();
  }  
}
}
