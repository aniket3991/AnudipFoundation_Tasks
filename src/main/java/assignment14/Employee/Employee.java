package assignment14.Employee;

public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void details(){
        System.out.println("Name: " + name + "\n" +
                "Employee ID: " + employeeId + "\n" +
                "Salary: " + salary);
    }
}
