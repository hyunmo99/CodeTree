import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int[] arr1 = new int[a];
    int[] arr2 = new int[b];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < a; i++) {
      arr1[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < b; i++) {
      arr2[i] = Integer.parseInt(st.nextToken());
    }

    String res = fn(arr1, arr2);
    System.out.println(res);
  }

  private static String fn(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length - arr2.length + 1; i++) {
      int sum = 0;
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i + j] != arr2[j]) {
          break;
        }
        else {
          sum++;
        }
      }
      if (arr2.length == sum) {
        return "Yes";
      }
    }
    return "No";
  }
}