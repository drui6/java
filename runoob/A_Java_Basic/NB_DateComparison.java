import java.util.Date;

public class NB_DateComparison {
    public static void main(String[] args) {
        // 使用 getTime() 方法比较
        Date date1 = new Date(121, 5, 15); // 2021年6月15日
        Date date2 = new Date(121, 5, 20); // 2021年6月20日
        
        // 比较毫秒数
        if (date1.getTime() < date2.getTime()) {
            System.out.println("date1 在 date2 之前");
        } else if (date1.getTime() > date2.getTime()) {
            System.out.println("date1 在 date2 之后");
        } else {
            System.out.println("两个日期相同");
        }

        // 使用 before(), after() 和 equals() 方法
        // 使用 before() 方法
        System.out.println("date1 在 date2 之前吗？ " + date1.before(date2));
       
        // 使用 after() 方法
        System.out.println("date1 在 date2 之后吗？ " + date1.after(date2));
       
        // 使用 equals() 方法
        System.out.println("两个日期相同吗？ " + date1.equals(date2));

        // 使用 compareTo() 方法
        int result = date1.compareTo(date2);
       
        if (result < 0) {
            System.out.println("date1 在 date2 之前");
        } else if (result > 0) {
            System.out.println("date1 在 date2 之后");
        } else {
            System.out.println("两个日期相同");
        }
    }
}