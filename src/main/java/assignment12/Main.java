package assignment12;

public class Main {
    public static void main(String[] args) {
//create an array of Animal class with size 3
        Animal[] animals = new Animal[3];
//initialise all 3 elements of this Animal class with
//Dog, Cat and Tiger class object.
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();
//call the all methods (eat,walk,makeNoise) from all
//the 3 objects.
        for (int i = 0; i < 3; i++) {
            animals[i].eat();
            animals[i].walk();
            animals[i].makeNoise();
        }
    }
}
