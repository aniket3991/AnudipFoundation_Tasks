package assignment9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Assignment9 {
    public void patternXSquare(int n) {

        for (int j = 0; j < n; j++)
            System.out.print("*");
        System.out.println();

        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.print("*");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < n - 4 - i * 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int i = 1; i < n / 2; i++) {
            System.out.print("*");

            for (int j = n/2 - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < i*2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = n/2 - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int j = 0; j < n; j++)
            System.out.print("*");
        System.out.println();
    }

    public void coinChange(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int coin = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int amount = scan.nextInt();
        scan.close();
        Arrays.sort(arr);

        for(int i = n - 1; i >= 0; i--){
            coin += amount / arr[i];
            amount %= arr[i];
            if(amount == 0)
                break;
        }
        if(amount == 0)
            System.out.println(coin);
        else
            System.out.println(-1);
    }

    public void strongPassword(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }
        scan.close();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (char ch : arr[i].toCharArray()) {
                if(ch == '@' || ch == '$' || ch == '#' || ch == '*'){
                    System.out.print("strong ");
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print("weak ");
        }
    }
    public void missingInteger(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        long sum = 0;
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
            sum += arr[i];
        }
        System.out.println(((long) (arr.length + 1) * (arr.length + 2)/2) - sum);
    }

    public void symmetryCheck(String[][] matrix){
        boolean row = false;
        boolean column = false;

        for (int i = 0; i < matrix.length/2; i++) {
            row = rowCheck(i, matrix.length - 1 - i, matrix);
            if(!row)
                break;
        }

        for (int i = 0; i < matrix[0].length/2; i++) {
            column = columnCheck(i, matrix[0].length - 1 - i, matrix);
            if(!column)
                break;
        }

        if(row && column){
            System.out.println("Both");
        }else if(row){
            System.out.println("Horizontal");
        }else if(column){
            System.out.println("Vertical");
        }else
            System.out.println("No");
    }

    public void minimizeCoin(){
        int[] arr = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int coin = 0;
        int amount = 29;

        for (int i = 0; i < arr.length; i++) {
            coin += amount / arr[i];
            amount %= arr[i];
            if(amount == 0)
                break;
        }
        System.out.println(coin);
    }
    public static void main(String[] args) {
        Assignment9 assignment9 = new Assignment9();
        //assignment9.patternXSquare(21);
        ////assignment9.coinChange();
        //assignment9.strongPassword();
        //assignment9.missingInteger();
        //assignment9.symmetryCheck(m3);
        //assignment9.minimizeCoin();
    }
    private boolean rowCheck(int n1, int n2, String[][] matrix){
        for(int i = 0; i < matrix[0].length; i++){
            if(!matrix[n1][i].equals(matrix[n2][i]))
                return false;
        }
        return true;
    }

    private boolean columnCheck(int n1, int n2, String[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            if(!matrix[i][n1].equals(matrix[i][n2]))
                return false;
        }
        return true;
    }

    static String[][] m1 = {{"*", ".", "*", "."},
            {".", "*", ".", "*"},
            {".", "*", ".", "*"},
            {".", "*", ".", "*"}};

    static String[][] m2 = {{ ".", "*", "."},
            {"*", ".", "*"},
            {".", "*", "."}};
    static String[][] m3 = {{ ".", ".", "*"},
            {"*", "*", "."},
            {".", ".", "*"}};
}
