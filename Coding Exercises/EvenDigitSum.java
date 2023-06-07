public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int originalNumber = number;
        int digit =0;
        int evenCheck = 0;
        int evenNumbers = 0;

        if(number<0){
            return -1;
        }
        if(originalNumber<9 && originalNumber %2 == 0){
            return number;
        }

        while(number>1){
            digit = number % 10;
            evenCheck = digit % 2;
            if(evenCheck == 0){
                evenNumbers += digit;
            }
            number /= 10;
        }

        return evenNumbers;
    }
}
