package assignment14.Employee;

public class Manager extends Employee {
    private String department;
    private int numberOfReports;

    public Manager(String name, String employeeId, double salary, String department,
                   int numberOfReports) {
        super(name, employeeId, salary);
        this.department = department;
        this.numberOfReports = numberOfReports;
    }

    public void conductMeeting(String day, int time) {
        System.out.println("Meeting will start on " + day + " at" + time);
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Department: " + department + "\n" +
                "Total Reports: " + numberOfReports);
    }

    public void addPerformanceBonus(Developer developer, double bonus){
        developer.setSalary(developer.getSalary() + bonus);
    }
}
