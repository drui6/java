package runoob.B_Object_Oriented;

public class DA_AbstractDemo {
    public static void main(String[] args) {
        DA_Salary s = new DA_Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        D_Employee e = new DA_Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
