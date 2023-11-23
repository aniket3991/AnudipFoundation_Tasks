package assignment13;

public class Instructor extends Person{
    int instructorID;
    int salary;

    public Instructor(Address address, String name, String gender, int instructorID, int salary) {
        super(address, name, gender);
        this.instructorID = instructorID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorID=" + instructorID +
                ", salary=" + salary +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
