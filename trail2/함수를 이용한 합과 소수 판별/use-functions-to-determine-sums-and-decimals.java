import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int a =  Integer.parseInt(st.nextToken());
    int b =  Integer.parseInt(st.nextToken());
    int res = 0;
    for ( int i = a; i <= b; i++) {
      boolean flag = fn(i);

      int sum = 0;

      if (flag) {
        if (i >= 10) {
          int li = i % 10;
          int ten = i/10;

          sum = ten + li;
        } else {
          sum = i;
        }
        if (sum % 2 == 0) {
          res++;
        }
      }
    }
    System.out.println(res);
  }

  private static boolean fn(int a) {

    if (a < 2) {
      return false;
    }

    for (int i = 2; i < a; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }


}