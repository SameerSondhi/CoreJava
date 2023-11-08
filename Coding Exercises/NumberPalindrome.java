public class NumberPalindrome {
    // write code here

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNum = number;
        while(originalNum !=0){
            reverse = (reverse*10)+(originalNum%10);
            originalNum /= 10;
        }
        return reverse == number;
    }
}