package runoob.B_Object_Oriented;

public class C_Test {
    public static void main(String[] args) {
        show(new B_Object_Oriente_C_Cat()); // 以 Cat 对象调用 show 方法
        show(new B_Object_Oriente_C_Dog()); // 以 Dog 对象调用 show 方法

        B_Object_Oriente_C_Animal a = new B_Object_Oriente_C_Cat(); // 向上转型
        a.eat(); // 调用的是 Cat 的 eat
        B_Object_Oriente_C_Cat c = (B_Object_Oriente_C_Cat) a; // 向下转型
        c.work(); // 调用的是 Cat 的 work
    }

    public static void show(B_Object_Oriente_C_Animal a) {
        a.eat();
        // 类型判断
        if (a instanceof B_Object_Oriente_C_Cat) { // 猫做的事情
            B_Object_Oriente_C_Cat c = (B_Object_Oriente_C_Cat) a;
            c.work();
        } else if (a instanceof B_Object_Oriente_C_Dog) { // 狗做的事情
            B_Object_Oriente_C_Dog c = (B_Object_Oriente_C_Dog) a;
            c.work();
        }
    }
}

abstract class B_Object_Oriente_C_Animal {
    abstract void eat();
}

class B_Object_Oriente_C_Cat extends B_Object_Oriente_C_Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class B_Object_Oriente_C_Dog extends B_Object_Oriente_C_Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}