import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[] numOfDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[20];

    int sum = 0;
    int place = 1;
    while (n > 0) {

      int digit = n%10;

      sum += digit * place;

      n /= 10;
      place *= 2;
    }

    sum *= 17;

    int cnt = 0;

    while (true) {

      if (sum < 2) {
        arr[cnt++] = sum;
        break;
      }

      arr[cnt++] = sum % 2;
      sum /= 2;
    }

    for (int i = cnt -1; i >= 0; i--) {
      System.out.print(arr[i]);
    }
  }
}