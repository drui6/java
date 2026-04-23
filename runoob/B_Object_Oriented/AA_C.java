package runoob.B_Object_Oriented;

public class AA_C implements A, B {
    public void eat() {
        System.out.println("吃东西");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void show() {
        System.out.println("展示");
    }
}

interface A {
    public void eat();

    public void sleep();
}

interface B {
    public void show();
}