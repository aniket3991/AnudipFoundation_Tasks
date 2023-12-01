package assignment14.Q1;

import java.util.Scanner;

public class AgeExceptionDemo {
    public void validateAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 120)
            throw new InvalidAgeException("Age is Not Valid!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeExceptionDemo ageExceptionDemo = new AgeExceptionDemo();
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        try {
            ageExceptionDemo.validateAge(age);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
