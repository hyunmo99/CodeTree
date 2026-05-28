import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[] numOfDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[20];
    int n = Integer.parseInt(st.nextToken());

    int cnt = 0;
    while (true) {
      if (n < 2) {
        arr[cnt++] = n;
        break;
      }

      arr[cnt++] = n % 2;
      n /= 2;
    }

    for (int i = cnt - 1; i >= 0; i--) {
      System.out.print(arr[i]);
    }
  }
}