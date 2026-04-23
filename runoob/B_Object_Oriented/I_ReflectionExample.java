package runoob.B_Object_Oriented;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class I_ReflectionExample {

    public static void main(String[] args) throws Exception {
        // 获取 Class 对象
        Class<?> clazz = I_Person.class;

        // 创建对象
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Object person = constructor.newInstance("John", 30);

        // 访问字段
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Name: " + nameField.get(person));

        // 修改字段
        nameField.set(person, "Doe");
        System.out.println("Updated Name: " + nameField.get(person));

        // 调用方法
        Method greetMethod = clazz.getMethod("greet", String.class);
        greetMethod.invoke(person, "World");
    }
}

class I_Person {
    private String name;
    private int age;

    public I_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet(String message) {
        System.out.println(name + " says: " + message);
    }
}