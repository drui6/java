package runoob.B_Object_Oriented;

enum B_Object_Oriented_GD_Color {
    RED, GREEN, BLUE;

    // 构造函数
    private B_Object_Oriented_GD_Color() {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class GD_Test {
    // 输出
    public static void main(String[] args) {
        B_Object_Oriented_GD_Color c1 = B_Object_Oriented_GD_Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}