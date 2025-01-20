// Given an integer n, return the number of prime numbers that are strictly less than n

public class PrimeNumbes {
  
  public static int prime(int number){
    
    int prime = 0;
   //  int count = 0;
    
    while ( number != 0 ) {
      for ( int i = 3; i < number; i++) {
        if ( number % i == 0 )prime++;
           // System.out.println(prime);
      }
      number = number - 1; 
    }
    return prime;      
  }
  public static void main(String[] args) {
    int number = 7;

    System.out.println(prime(number));
  }
}
