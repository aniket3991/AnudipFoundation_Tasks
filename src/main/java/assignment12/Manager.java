package assignment12;

public class Manager extends Member{
    String specialisation;
    String department;

    @Override
    public String toString() {
        return "Manager{" +
                "specialisation='" + specialisation + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Manager(String name, int age, String phoneNumber, String address, double salary,
                   String specialisation, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialisation = specialisation;
        this.department = department;
    }
}
