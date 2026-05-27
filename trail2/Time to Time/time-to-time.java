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
    
    int cnt = 0;

    while (true) {
      if (A == C && B == D) {
        break;
      } 
      
      B++;
      cnt++;

      if (B == 60) {
        A++;
        B = 0;
      }
    }
    System.out.println(cnt);
  }
}