import java.util.*;

public class P11 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
      
    }

    System.out.println(Arrays.toString(arr));


    
    
  }
  
}