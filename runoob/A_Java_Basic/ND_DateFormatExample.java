import java.util.Date;
public class ND_DateFormatExample {
   public static void main(String[] args) {
      Date date = new Date();
      System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ", date, date, date, date, date, date, date);
   }
}