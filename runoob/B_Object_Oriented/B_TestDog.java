package runoob.B_Object_Oriented;

class B_Object_Oriented_B_Animal {
   public void move() {
      System.out.println("动物可以移动");
   }
}

class B_Object_Oriented_B_Dog extends B_Object_Oriented_B_Animal {
   public void move() {
      System.out.println("狗可以跑和走");
   }

   public void bark() {
      System.out.println("狗可以吠叫");
   }
}

public class B_TestDog {
   public static void main(String args[]) {
      B_Object_Oriented_B_Animal a = new B_Object_Oriented_B_Animal(); // Animal 对象
      B_Object_Oriented_B_Animal b = new B_Object_Oriented_B_Dog(); // Dog 对象

      a.move();// 执行 Animal 类的方法
      b.move();// 执行 Dog 类的方法
      // b.bark();// 编译错误：b 是 Animal 类型的引用，Animal 类中没有 bark() 方法
   }
}
