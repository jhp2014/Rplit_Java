import java.util.*;

public class P3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int result = 0;

    List<Integer> OutLst = new ArrayList<>();
    List<Integer> InLst = new ArrayList<>();
    
    for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++){
        int val = sc.nextInt();
        InLst.add(val);
      }
      
      Collections.sort(InLst);
      OutLst.add(InLst.get(0));
      InLst.clear();
    }
    System.out.println(OutLst);
  }
}