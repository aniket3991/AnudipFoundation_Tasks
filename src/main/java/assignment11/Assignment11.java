package assignment11;

import java.util.HashMap;
import java.util.Map;

public class Assignment11 {
    public void signalCapacity(){
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i-1; j >= 0; j--) {
                if(arr[i] >= arr[j])
                    count++;
                else
                    break;
            }
            System.out.print(count + " ");
        }
    }

    public void productOfTwo(){
        int[] arr = {1, 2, 2, 3, 4, 25, 17};
        int k = 51;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.get(k/arr[i]) != null && k/arr[i] * arr[i] == k) {
                System.out.println(map.get(k/arr[i]) + " " + i);

            }else{
                map.put(arr[i], i);
            }
        }
    }



    public static void main(String[] args) {
        Assignment11 assignment11 = new Assignment11();
        //assignment11.signalCapacity();
        assignment11.productOfTwo();
    }
}
