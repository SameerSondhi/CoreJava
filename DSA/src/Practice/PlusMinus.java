package Practice;

import java.text.DecimalFormat;

public class PlusMinus {
    public static void main(String[] args) {
    int[] array = {-1,-1,0,1,1};
    plusMinus(array);
    }
    public static void plusMinus(int[] arr){
        int length = arr.length;
        int countNegative = 0;
        int countPositive = 0;
        int countZeroes = 0;


        for (int j : arr) {
            if (j < 0) {
                countNegative++;
            } else if (j == 0) {
                countZeroes++;
            } else {
                countPositive++;
            }
        }
        double posRatio = (double)countPositive/length;
        double negRatio = (double)countNegative/length;
        double zeroRatio = (double)countZeroes/length;

        DecimalFormat df = new DecimalFormat("#.######");
        df.setMinimumFractionDigits(6); // Set minimum 6 decimal places
        df.setMaximumFractionDigits(6); // Set maximum 6 decimal places

        System.out.println(df.format(posRatio));
        System.out.println(df.format(negRatio));
        System.out.println(df.format(zeroRatio));
    }
}
