package assignment13;

public class Person {
    Address address;
    String name;
    String gender;

    public Person(Address address, String name, String gender) {
        this.address = address;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
