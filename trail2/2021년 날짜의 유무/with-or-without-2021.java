import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int month = Integer.parseInt(st.nextToken());
    int day = Integer.parseInt(st.nextToken());

    String res = isTrueDay(month, day);
    System.out.println(res);




  }

  private static String isTrueDay(int month, int day) {

    if (month < 1 || month > 12) {
      return "No";
    }
    if (day < 1 || day > 31) {
       return "No";
    }
    if (month == 2 && day >= 29) {
      return "No";
    }
    boolean validDay = YearMonth.of(2021, month).isValidDay(day);

    if (validDay) {
      return "Yes";
    }
    else {
      return "No";
    }
  }


}