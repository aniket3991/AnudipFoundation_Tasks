package assignment13;

public class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;

    public Student(Address address, String name, String gender, int studentId, String courseEnrolled, int courseFee) {
        super(address, name, gender);
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
