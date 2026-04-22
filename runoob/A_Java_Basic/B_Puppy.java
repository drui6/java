public class B_Puppy {
    private int age;
    private String name;

    // 构造器
    public B_Puppy(String name) {
        this.name = name;
        //这个构造器仅有一个参数：name
        System.out.println("dog name: " + name);
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 获取名称
    public String getName() {
        return name;
    }

    // 主方法
    public static void main(String[] args) {
        // 创建一个Puppy对象
        B_Puppy myPuppy = new B_Puppy("tommy");

        // 通过方法来设定 age
        myPuppy.setAge(2);

        // 通过方法来获取 age
        int age = myPuppy.getAge();
        System.out.println("dog age: " + age);

        // 也可以直接访问成员变量（通过 getter 方法）
        System.out.println("变量值 : " + myPuppy.getAge());
    }
}
