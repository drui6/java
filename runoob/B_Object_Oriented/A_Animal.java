package runoob.B_Object_Oriented;

public class A_Animal {
    private String name;
    private int id;

    public A_Animal(String myName, int myid) {
        // 初始化属性值
        name = myName;
        id = myid;
    }

    public void eat() {
        System.out.println(name + "吃东西");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }

    public void introduction() {
        System.out.println("我是" + id + "号" + name);
    }
}
