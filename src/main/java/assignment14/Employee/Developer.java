package assignment14.Employee;

public class Developer extends Employee {
    private String programmingLanguage;
    private int projectsCompleted;

    public Developer(String name, String employeeId, double salary, String programmingLanguage,
                     int projectsCompleted) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
    }
    public void codingMessage(){
        System.out.println("Coding is a great opportunity to increase logical thinking.");
    }

    @Override
    public void details(){
        super.details();
        System.out.println("Programming Language: " + programmingLanguage + "\n" +
                "Projects Completed: " + projectsCompleted);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Manager1", "Man123", 20000, "IT", 20);
        Developer developer = new Developer("Developer1", "Dev123", 30000, "JAVA", 5);

        manager.conductMeeting("Friday", 5);
        developer.codingMessage();

        manager.details();
        developer.details();

        manager.addPerformanceBonus(developer, 5000);
    }
}
