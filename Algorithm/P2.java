import java.util.*;

public class P2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    int first = arr[n-1];
    int second = arr[n];

    int bigCount = (m / (k+1)) * k;
    bigCount += m % (k+1);

    int result = 0;
    result += bigCount * first;
    result += ((m - bigCount) * second);
  }
}