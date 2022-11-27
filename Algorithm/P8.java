// 게임 개발 p.119 구현

// 못풀었다.... 잘못된 풀이이다.
// 내일 다시 분석할 예정
import java.util.*;

/* My code
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
*/
// Solution
public class P8 {

    public static int n, m, x, y, direction;
    // 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
    public static int[][] d = new int[50][50];
    // 전체 맵 정보
    public static int[][] arr = new int [50][50];

    // 북, 동, 남, 서 방향 정의
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    // 왼쪽으로 회전
    public static void turn_left() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력받기
        n = sc.nextInt();
        m = sc.nextInt();
        
        // 현재 캐릭터의 X 좌표, Y 좌표, 방향을 입력받기
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1; // 현재 좌표 방문 처리

        // 전체 맵 정보를 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 시뮬레이션 시작
        int cnt = 1;
        int turn_time = 0;
        while (true) {
            // 왼쪽으로 회전
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            // 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }
            // 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
            else turn_time += 1;
            // 네 방향 모두 갈 수 없는 경우
            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                // 뒤로 갈 수 있다면 이동하기
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                // 뒤가 바다로 막혀있는 경우
                else break;
                turn_time = 0;
            }
        }

        System.out.println(cnt);
    }

}