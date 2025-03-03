public class FourthTriangle {
  public static void main(String[] args) {
  
   int num = 10;
  
  for ( int row = num; row > 0; row-- ) {
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
