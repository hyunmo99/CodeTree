import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());

    int[][] arr = new int[N][N];

    for (int i = 0; i < N; i++) {
      arr[0][i] = 1;
      arr[i][0] = 1;
    }
    
    for (int i = 1; i < N; i++) {
      for (int j = 1; j < N; j++) {
        arr[i][j] = arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1];
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (arr[i][j] != 0) {
          System.out.print(arr[i][j] + " ");
        }
      }
      System.out.println();
    }
  }

}