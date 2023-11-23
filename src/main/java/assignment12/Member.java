package assignment12;

public class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary){
        super();
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Salary");
    }
}
