package assignment4;

public class Pattern1 {

    public void patter1(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= n/2; i++) {

            System.out.print("*");

            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
    }

    public void pattern2(int n){

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i > 0; i--){
            for (int j = i; j > 0; j--) {
                System.out.print("*");
    }
            System.out.println();
}
    }

    public void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern4(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 pattern1 = new Pattern1();
        pattern1.patter1(5);
        System.out.println();

        pattern1.pattern2(5);
        System.out.println();

        pattern1.pattern3(5);
        System.out.println();

        pattern1.pattern4(5);
    }
}
