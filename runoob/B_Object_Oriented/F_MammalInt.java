package runoob.B_Object_Oriented;

public class F_MammalInt implements F_Animal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        F_MammalInt m = new F_MammalInt();
        m.eat();
        m.travel();
    }
}