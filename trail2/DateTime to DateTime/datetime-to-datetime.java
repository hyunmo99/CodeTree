import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = 11;
    int b = 11;
    int c = 11;
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());



    int cnt = 0;

    while (true) {
      
      if (a > A && b > B && c > C) {
        cnt = -1;
        break;
      }

      if (A == a && B == b && C == c) {
        break;
      }

      c++;
      cnt++;

      if (c == 60) {
        b++;
        c = 0;
      }

      if (b == 24) {
        a++;
        b = 0;
      }
    }
    System.out.println(cnt);
  }
}