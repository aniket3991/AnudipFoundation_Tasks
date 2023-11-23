package assignment8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment8 {
    public void basicMath(){
        int[] arr = {9, 8, 5, 2, 4};
        int sum = 0;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int tempSum = sum;
        for(int i = 0; i < arr.length; i++){
            if((sum - arr[i]) % 7 == 0 && ans == -1){
                ans = i;
            } else if ((sum - arr[i]) % 7 == 0 && arr[ans] > arr[i]) {
                ans = i;
            }
        }
        System.out.println(ans);
    }

    public void vowelConsonant(){
        String str = "sfjasfhfjsfi";

        String vowel = "";
        String consonant = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowel += str.charAt(i);
            }else
                consonant += str.charAt(i);
        }

        System.out.println(vowel);
        System.out.println(consonant);
    }

    public void intersection(){
        int[] arr1 = {3, 5, 6};
        int[] arr2 = {2, 4, 5};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            map.put(arr1[i], i);
        }
        for(int i = 0; i < arr2.length; i++){
            if(map.get(arr2[i]) != null){
                System.out.println(arr2[i]);
                break;
            }
        }
    }

    public void areaParameter(){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++){
            int l = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.print(l * b + " ");
            System.out.println(2 * (l + b));
        }
        scanner.close();
    }



    public static void main(String[] args) {
        Assignment8 assignment8 = new Assignment8();
        //assignment8.basicMath();
        //assignment8.vowelConsonant();
        //assignment8.intersection();
        //assignment8.areaParameter();







    }
}