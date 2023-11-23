package assignment12;

public class Main1 {
    public static void main(String[] args) {
        Member member = new Manager("name", 18, "1234567890", "address", 101.10,
                "Developer", "Department");
        Member member1 = new Employee("name1", 20, "12345678900", "address1", 102.10,
                "Developer1", "Department1");

        System.out.println(member);
        System.out.println(member1);
    }
}
