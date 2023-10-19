package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] testArr = {1,3,5,7,9};
        miniMaxSum(testArr);
    }

    public static void miniMaxSum(int[] arr){
        ArrayList <Integer> sums = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            int sum = 0;
            for(int j =0; j<arr.length; j++){
                if(i!=j){
                    sum = sum + arr[j];
                }
            }
            sums.add(sum);
        }
        System.out.println(Collections.min(sums) + " " + Collections.max(sums));
    }
}
