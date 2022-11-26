
//그리디 4번 (실전문제) 1이될 때까지
import java.util.*;

public class P4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int cnt = 0;
    while (n != 1) {
      if (n % k == 0){
        n = n/k;
        cnt += 1;
      }else{
        n -= 1;
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}

/* DP로 풀었다. 그런데 그럴 필요가 없었네..?
public class P4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n + 1]; // 초기값 0
    arr[1] = 0;

    for (int i = 2; i < n + 1; i++) {
      if (i % k == 0) {
        arr[i] = Math.min(arr[i / k], arr[i - 1]) + 1;
      } else {
        arr[i] = arr[i - 1] + 1;
      }
    }

    System.out.println(arr[n]);

  }
}
*/