package assignment13;

public class Main {
    public static Person generatePerson(Person person){
        return person;
    }

    public static void main(String[] args) {
        Address address = new Address("city", "state", "123456");
        Person newStudent = generatePerson(new Student(address, "name", "Male",
                123, "13456", 101));
        Person newInstructor = generatePerson(new Instructor(new Address("city", "state",
                "123"), "name", "Male", 123456,1234));
        System.out.println(newStudent);
        System.out.println(newInstructor);
    }
}
