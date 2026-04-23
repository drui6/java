package runoob.B_Object_Oriented;

class B_Object_Oriented_BA_Animal {
   public void move() {
      System.out.println("动物可以移动");
   }
}

class B_Object_Oriented_BA_Dog extends B_Object_Oriented_BA_Animal {
   public void move() {
      super.move(); // 应用super类的方法
      System.out.println("狗可以跑和走");
   }
}

public class BA_TestDog {
   public static void main(String args[]) {
      B_Object_Oriented_BA_Animal b = new B_Object_Oriented_BA_Dog(); // Dog 对象

      b.move();// 执行 Dog 类的方法
   }
}
