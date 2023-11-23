package assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPractice {

    public void firstGreater() {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        // 10, 45, 56, 12, 5, 65, 40
        int q = scan.nextInt(); // 2

        for (int i = 0; i < q; i++) {
            int n = scan.nextInt(); // 12
            int target = n; // 12

            for (int b = 0; b < arr.length; b++) {
                if (arr[b] > n && n == target) { // 10 > 12 && 12 == 12
                    target = arr[b];
                }
                if (arr[b] > n && target > arr[b]) {
                    target = arr[b];
                }
            }
            System.out.println(target);
            if (n == target)
                System.out.println(-1);
        }
    }

    public void DetectPalindrome() {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {

            int[] letters = new int[26];
            int n = scan.nextInt();
            int sum = 0;

            scan.nextLine();
            String s = scan.nextLine();

            for (char ch : s.toCharArray()) {
                int idx = ch - 97;
                if (letters[idx] == 0) {
                    letters[idx]++;
                } else {
                    letters[idx]--;
                }
            }

            for (int j = 0; j < 26; j++) {
                sum += letters[j];

                if (sum > 1)
                    break;
            }

            if ((n % 2 == 0 && sum == 0) || (n % 2 == 1 && sum == 1)) {
                System.out.println("Possible!");
            } else {
                System.out.println("Not Possible!");
            }
        }
    }

    public void checkPalindrome() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        boolean flag = true;

        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void checkPalindromeNumber() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev = 0;
        int dup = n;

        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }

        if (rev == dup) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void generateSubstring() {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();

            for (int j = 0; j < s.length(); j++) {
                for (int k = j; k < s.length(); k++) {
                    System.out.println(s.substring(j, k + 1));
                }
            }
        }
    }

    public void reverseString() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    public void borderless() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public void evilSearch() {
        Scanner scan = new Scanner(System.in);
        boolean result = false;

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
            int target = scan.nextInt();

            int start = 0;
            int end = n - 1;

            while (start < end) {
                int mid = (start + end) / 2;

                if (arr[mid][0] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            int row = start;

            start = 0;
            end = m - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (arr[row][mid] == target) {
                    result = true;
                    break;
                }
                if (arr[row][mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            System.out.println(result);
        }
    }

    public void specialPair() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        List<Integer> primeNum = prime(n);

        for (int num : primeNum) {
            int i = 0;
            for (int j = num; j < arr.length; j++, i++) {
                sum += Math.abs(arr[j] - arr[i]);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        StringPractice stringPractice = new StringPractice();

        //stringPractice.firstGreater();
        //stringPractice.DetectPalindrome();
        //stringPractice.checkPalindrome();
        //stringPractice.checkPalindromeNumber();
        //stringPractice.generateSubstring();
        //stringPractice.reverseString();
        //stringPractice.borderless();
        //stringPractice.evilSearch();
        stringPractice.specialPair();

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(5));
    }


    private List<Integer> prime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                list.add(i);
        }
        return list;
    }
}

