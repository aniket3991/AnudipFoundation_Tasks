package assignment14.Q2;

import java.util.Scanner;

public class DemoArithimaticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("Inside Finally Block");
        }
    }
}
