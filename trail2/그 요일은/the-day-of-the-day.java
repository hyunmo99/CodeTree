import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[] numOfDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int m1 = Integer.parseInt(st.nextToken());
    int d1 = Integer.parseInt(st.nextToken());
    int m2 = Integer.parseInt(st.nextToken());
    int d2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    String day = st.nextToken();

    String[] dayOfTheWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    int start = getDayOfYear(m1, d1);
    int end = getDayOfYear(m2, d2);
    int differ = end - start;

    int cnt = differ / 7;

    int index = 0;

    for (int i = 0; i < 7; i++) {
      if (dayOfTheWeek[i].equals(day)) {
        index = i;
      }
    }

    if (differ % 7 >= index) {
      cnt++;
    }

    System.out.println(cnt);

  }

  private static int getDayOfYear(int m1, int d1) {
    int num = 0;

    for (int i = 1; i < m1; i++) {
      num += numOfDays[i];
    }

    return num + d1;
  }
}