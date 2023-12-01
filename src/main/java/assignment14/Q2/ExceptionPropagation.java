package assignment14.Q2;

public class ExceptionPropagation {

    public int calculateSalary(int hours, int rate) throws ArithmeticException {
        if (rate < 0)
            throw new ArithmeticException();
        return hours * rate;
    }

    public int processEmployee(int hours, int rate) {
        try {
            return calculateSalary(hours, rate);
        } catch (ArithmeticException e) {
            System.out.println("Rate should not be negative");
            return calculateSalary(hours, 10);
        }
    }

    public static void main(String[] args) {

        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        int salary = exceptionPropagation.processEmployee(100, 5);
        System.out.println("Salary " + salary);
        int salary2 = exceptionPropagation.processEmployee(100, -1);
        System.out.println("Salary with negative rate: " + salary2);
    }
}
