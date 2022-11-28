//음료수 얼려 먹기
import java.util.*;

public class P9 {
  
  public static int[] dr = {-1,1,0,0};
  public static int[] dc = {0,0,-1,1};

  public static void dfs(int row, int column, int[][] arr) {
    arr[row][column] = '1';

    for (int i = 0; i < 4; i++) {
      int nr = row + dr[i];
      int nc = column + dc[i];
      if (nr >= 0 && nr < arr.length && nc >= 0 && nc < arr[0].length && arr[nr][nc] == '0') {
        dfs(nr,nc,arr);
      }
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    sc.nextLine(); //버퍼 비우기

    for (int i = 0; i < n; i++){
      String line = sc.nextLine();
      for (int j = 0; j < m; j++){
        arr[i][j] = line.charAt(j);
      }
    }

    int count = 0;
    for (int r = 0; r < n; r++){
      for (int c = 0; c < m; c++) {
        if (r >= 0 && r < n && c >= 0 && c < m && arr[r][c] == '0') {
          count += 1;
          P9.dfs(r, c, arr);
        }
      }
    }

    System.out.println(count);
  }
}