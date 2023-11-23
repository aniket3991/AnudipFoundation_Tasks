package assignment12;

public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Parrot extends Bird {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am Singing");
    }

    public class Main {
        public static void main(String[] args) {
            Bird b1 = new Parrot();

//with this b1 reference call the fly method of Parrot
            b1.fly();
//and after downcasting this b1 reference to the Parrot class object,call the sing method also
            ((Parrot) b1).sing();
        }
    }

}
