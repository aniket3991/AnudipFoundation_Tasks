package assignment5;

import java.util.Scanner;

public class Matrix {
    public void squareMatrix() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(++arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void rectangleMatrix() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(++arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void transposeMatrix() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        int[][] newArr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void reverseMatrix() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void traverse2dArray() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = arr[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }

    public void nTraversal() {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();


        for (int test = 0; test < t; test++) {

            int n = scan.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }


            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i][0] + " ");
            }

            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i][i] + " ");
            }

            for (int i = arr.length - 2; i >= 0; i--) {
                System.out.print(arr[i][arr.length - 1] + " ");
            }
        }

    }

    public void diamondTraversal() {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();


        for (int test = 0; test < t; test++) {

            int n = scan.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            int i = n / 2;
            int j = arr[0].length - 1;

            while (i >= 0) {
                System.out.print(arr[i][j] + " ");
                i--;
                j--;
            }
            i += 2;
            while (j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;
            }
            j += 2;
            while (i < arr.length) {
                System.out.print(arr[i][j] + " ");
                i++;
                j++;
            }
            i -= 2;
            while (j < arr[0].length - 1) {
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
        }
    }

    public void spiralTraversalSquareMatrix() {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int test = 0; test < t; test++) {

            int n = scan.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            for (int round = 0; round <= n / 2; round++) {
                int start = round;

                while (start < n - round) {
                    System.out.print(arr[n - 1 - round][start] + " ");
                    start++;
                }
                start -= 2;

                while (start >= round) {
                    System.out.print(arr[start][n - 1 - round] + " ");
                    start--;
                }
                start = n - 2 - round;

                while (start >= round) {
                    System.out.print(arr[round][start] + " ");
                    start--;
                }
                start += 2;

                while (start < n - 1 - round) {
                    System.out.print(arr[start][round] + " ");
                    start++;
                }
            }
        }
    }

    public void spiralTraversalRectangleMatrix() {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int test = 0; test < t; test++) {

            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            int size = Math.min(n, m);
            int total = n * m;
            int count = 0;

            for (int round = 0; round <= size / 2; round++) {

                int start = round;

                while (start < arr[0].length - round && count != total) {
                    System.out.print(arr[arr.length - 1 - round][start] + " ");
                    count++;
                    start++;
                }
                start = arr.length - 2 - round;

                while (start >= round && count != total) {
                    System.out.print(arr[start][arr[0].length - 1 - round] + " ");
                    count++;
                    start--;
                }

                start = arr[0].length - 2 - round;
                while (start >= round && count != total) {
                    System.out.print(arr[round][start] + " ");
                    count++;
                    start--;
                }

                start += 2;
                while (start < arr.length - 1 - round & count != total) {
                    System.out.print(arr[start][round] + " ");
                    count++;
                    start++;
                }
            }
        }

    }

    public void zigzag() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i = i + 2) {

            for (int j = m - 1; j >= 0; j--)
                System.out.print(arr[i][j] + " ");
            for (int j = 0; j < m && (i + 1) < n; j++)
                System.out.print(arr[i + 1][j] + " ");
        }

    }

    public int absoluteDifference() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;
        int max = Math.max(n, m);
        int mid1 = n / 2;
        int mid2 = m / 2;

        for (int i = 0; i < max; i++) {
            if (i < m)
                sum2 += arr[mid1][i];
            if (i < n)
                sum1 += arr[i][mid2];
        }

        for (int i = 0; i < mid2 || i < mid1; i++) {
            if (i < mid2) {
                sum1 += arr[0][m - 1 - i];
                sum1 += arr[n - 1][i];
            }
            if (i < mid1) {
                sum2 += arr[i][0];
                sum2 += arr[n - 1 - i][m - 1];
            }
        }
        return Math.abs(sum1 - sum2);
    }

    public void specificDiagonal() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int k = scan.nextInt();
        int i = 0, j = 0;
        boolean flag = false;

        for (; i < n; i++) {
            j = 0;
            for (; j < m; j++) {
                if (arr[i][j] == k) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }


        int min = Math.min(i, j);

        for (int row = i - min, column = j - min; row < arr.length && column < arr[0].length; row++, column++) {
            System.out.print(arr[row][column] + " ");
        }


        System.out.println();

        min = Math.min(arr[0].length - 1 - j, i);

        for (int row = i - min, column = j + min; row < arr.length && column >= 0; row++, column--) {
            System.out.print(arr[row][column] + " ");
        }

    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        //matrix.squareMatrix();
        //matrix.rectangleMatrix();
        //matrix.transposeMatrix();
        //matrix.reverseMatrix();
        //matrix.traverse2dArray();
        //matrix.nTraversal();
        //matrix.diamondTraversal();
        //matrix.spiralTraversalSquareMatrix();
        //matrix.spiralTraversalRectangleMatrix();
        //matrix.zigzag();
        //System.out.println(matrix.absoluteDifference());
        //matrix.specificDiagonal();
    }
}
