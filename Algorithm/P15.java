import java.util.*;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int start = 0;
        int end = Arrays.stream(arr).max().getAsInt();

        while (start <= end) {
            int total = 0;
            int mid = (start + end) / 2;

            for ( int i = 0; i < n; i++) {
                if ((arr[i] - mid) > 0) {
                    total += (arr[i] - mid);
                }
            }

            if (total < m) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
            
        }

        System.out.print(result);
        
    }
}