package runoob.B_Object_Oriented;

public class DA_Salary extends D_Employee {
    private double salary; // Annual salary

    public DA_Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }

    // 任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
    // public double computePay() {
    //     System.out.println("Computing salary pay for " + getName());
    //     return salary / 52;
    // }
}