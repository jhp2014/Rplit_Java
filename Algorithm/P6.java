import java.util.*;
public class P6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();

    int cnt = 0;

    for (int i = 0; i <= h; i++){
      String hour = String.valueOf(i);
      if (hour.contains("3")) {
        cnt += 3600;
        continue;
      }
      for (int j = 0; j < 60; j++){
        String min = String.valueOf(j);
        if (min.contains("3")) {
          cnt += 60;
          continue;
        }
        for (int k = 0; k < 60; k++){
          String sec = String.valueOf(k);
          if (sec.contains("3")) cnt += 1;
        }
      }
    }

    System.out.println(cnt);
    
    
  }
}