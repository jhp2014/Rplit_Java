//미로탈출
import java.util.*;

class Node {
  private int x;
  private int y;
  
  public Node(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }
  public int getY() {
    return this.y;
  }
}

public class P10 {

  public static int n;
  public static int m;
  public static List<List<Integer>> graph = new ArrayList<>();

  static int[] dr = {-1, 1, 0, 0};
  static int[] dc = {0, 0, -1, 1};

  
  public static int bfs(int r, int c) {
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(r,c));

    while (!q.isEmpty()) {
      Node node = q.poll();
      r = node.getX();
      c = node.getY();

      for (int i = 0; i < 4; i++){
        int nr = r + dr[i];
        int nc = c + dc[i];

        if (nr >= 0 && nr < n && nc >=0 && nc < m && graph.get(nr).get(nc) == 1) {
          q.offer(new Node(nr, nc));
          graph.get(nr).set(nc, graph.get(r).get(c) + 1);
        }
      }
    
    }
    return graph.get(n-1).get(m-1);
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    sc.nextLine(); // 버퍼 지우기

    for (int i = 0; i < n; i++) {
      String str = sc.nextLine();
      List<Integer> lst = new ArrayList<>();
      for (int j = 0; j < m; j++) {
        lst.add(str.charAt(j) - '0');
      }
      graph.add(new ArrayList<Integer>(lst));
    }
    
    System.out.println(bfs(0, 0));
  }
}