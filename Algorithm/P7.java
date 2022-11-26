import java.util.*;

public class P7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String pos = sc.next();
    System.out.println(pos);

    int x = Integer.valueOf(pos.substring(1));
    int y = pos.charAt(0);
    
    int minY = 'a';
    int maxY = 'h';

    int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
    int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

    int cnt = 0;
    for (int i = 0; i < 8; i++) {
      int nx = -1;
      int ny = -1;
      nx = x + dx[i];
      ny = y + dy[i];

      if (nx < 1 || nx > 8 || ny < 'a' || ny > 'h') continue;
      cnt += 1;
    }
    System.out.println(cnt);
  }
}