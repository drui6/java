public class DH_Counter {
    private static int count = 0;
    
    public DH_Counter() {
        count++;
    }
    
    public static int getCount() {
        return count;
    }
    
    public static void main(String[] args) {
        DH_Counter c1 = new DH_Counter();
        DH_Counter c2 = new DH_Counter();
        DH_Counter c3 = new DH_Counter();
        System.out.println("目前为止创建的对象数: " + DH_Counter.getCount());
    }
}
