package assignment14;

public class Teacher extends Person{

    private String employeeId;
    private String subject;

    public Teacher(String name, int age, String address, String employeeId, String subject) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    public void setStudentGrade(Student student, int math, int science, int computer){
        student.setGrade(student.calculate(math,science,computer));
    }

    @Override
    public void details(){
        super.details();
        System.out.println("Employee Id: " + employeeId + '\n' +
                "Subject: " + subject);
    }

    public static void main(String[] args) {
        Student student = new Student("Student1", 18, "Student Address","St123");
        Teacher teacher = new Teacher("Teacher1", 30, "Teacher Address", "Tea123", "Maths");

        teacher.setStudentGrade(student,90,80,70);

        student.details();
        System.out.println();
        teacher.details();
    }
}
