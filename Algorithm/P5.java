//구현 4-1 예제 p110
import java.util.*;

public class P5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); //버퍼 비우기
    String[] plans = sc.nextLine().split(" ");
    
    int[] dx = {0,0,-1,1};  //상하좌우
    int[] dy = {-1,1,0,0};
    char[] move = {'L','R','U','D'};
    
    int x = 1;
    int y = 1;

    for (int i = 0; i < plans.length; i++) {
      char plan = plans[i].charAt(0);
      int nx = -1;
      int ny = -1;
      for (int j = 0; j < 4; j++) {
        if (plan == move[j]) {
          nx = x + dx[j];
          ny = y + dy[j];
        }
      }

      if (nx < 1 || nx > n || ny < 1 || ny > n) continue;

      x = nx;
      y = ny;
    }

    System.out.printf("%d %d", x, y);
  }
}