public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        if(number<=9){
            return number*2;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        int sum = 0;
        while(number>9){
            number = number/10;
        }
        firstDigit+=number;
        sum = firstDigit + lastDigit;
        return sum;
    }
}
