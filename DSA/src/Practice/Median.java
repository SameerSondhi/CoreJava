package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] testArr = {3,4,5,1,2,6,7};
        System.out.println(findMedian(testArr));
    }

    public static int findMedian(int[] arr) {
        Arrays.sort(arr);
        int firstHalf = 0;
        int secondHalf = arr.length-1;
        while(firstHalf!=secondHalf){
            firstHalf++;
            secondHalf--;
        }
        return arr[firstHalf];
    }


}