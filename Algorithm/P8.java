// 게임 개발 p.119 구현

// 못풀었다.... 잘못된 풀이이다.
// 내일 다시 분석할 예정
import java.util.*;

public class P8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int dir = sc.nextInt();

    int cnt = 1;
    
    int[] dx = {0, -1, 0, 1};  //북,동,남,서 
    int[] dy = {-1, 0, 1, 0};
    
    int[][] map = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j< M; j++) {
        map[i][j] = sc.nextInt();
      }
    }

    if (map[x][y] == 1) {
      System.out.println(0);
      return;
    }

    
    while (true) {
      int pos_x = x;
      int pos_y = y;
      for (int i = 0; i < 4; i++) {
        int nx = pos_x + dx[dir];
        int ny = pos_y + dy[dir];
        
        if (map[nx][ny] == 0){
          x = nx;
          y = nx;
          dir = (dir + 3) % 4;
          map[nx][ny] = 2;
          cnt += 1;
          break;
          
        } else{
          dir = (dir + 3) % 4;
        }
      }
      
      if (pos_x == x && pos_y == y){
        int back = (dir + 2) % 4;
        x = x + dx[back];
        y = y + dx[back];

        if (map[x][y] == 1) {
          System.out.println(cnt);
          return;
        }
      }
    }
  }
}