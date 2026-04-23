package runoob.B_Object_Oriented;

public class E_RunEncap {

    public static void main(String args[]) {
        E_EncapTest encap = new E_EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() +
                " Age : " + encap.getAge());
    }
}