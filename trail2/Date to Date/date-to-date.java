import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());

    int[] numOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    int cnt = 1;

    while (true) {
      if (A == C && B == D) {
        break;
      }

      B++;
      cnt++;

      if (B > numOfDays[A]) {
        A++;
        B = 1;
      }
    }
    System.out.println(cnt);
  }
}