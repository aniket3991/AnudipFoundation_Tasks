package assignment12;

public class Employee extends Member{
    String specialisation;
    String department;

    @Override
    public String toString() {
        return "Employee{" +
                "specialisation='" + specialisation + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int age, String phoneNumber, String address, double salary,
                    String specialisation, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialisation = specialisation;
        this.department = department;
    }
}
