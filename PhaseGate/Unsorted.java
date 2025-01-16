import java.util.Arrays;

public class Unsorted {
  
  public static int[] sortedLists(int[] array1, int[] array2) {
    int[] sorted = new int[array1.length + array2.length];
    System.arraycopy(array1, 0, sorted, 0, array2.length );
    System.arraycopy(array2, 0, sorted, array1.length, array2.length );
    return sorted;
  }
  public static void main(String[] args) {
        int[] list1 = {6, 7, 8, 9, 10};
        int[] list2 = {1, 2, 3, 4, 5};
    System.out.println("Sorted List: " + Arrays.toString((concatenateLists(list1, list2))));
 }
}



