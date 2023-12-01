package assignment14;

public class Student extends Person{
    private String studentId;
    private char grade;

    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
        this.grade = '\0';
    }

    public char calculate(int math, int science, int computer){
        int avg = (math + science + computer)/3;
        if(avg > 90)
            return 'A';
        if(avg > 80)
            return 'B';
        if(avg > 70)
            return 'C';
        else
            return 'D';
    }

    public void setGrade(char grade){
        this.grade = grade;
    }

    @Override
    public void details(){
        super.details();
        System.out.println("Student ID: " + studentId + '\n' +
                "Grade: " + grade);
    }
}
