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

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[20];

    int sum = 0;
    int place = 1;
    while (n > 0) {

      int digit = n%10;

      sum += digit * place;

      n /= 10;
      place *= A;
    }

    int cnt = 0;

    while (true) {

      if (sum < B) {
        arr[cnt++] = sum;
        break;
      }

      arr[cnt++] = sum % B;
      sum /= B;
    }

    for (int i = cnt -1; i >= 0; i--) {
      System.out.print(arr[i]);
    }
  }
}