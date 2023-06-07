public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sumOfDivisors = 0;
        for(int divisor = 1; divisor<=number/2; divisor++){
            if(number % divisor == 0){
                sumOfDivisors += divisor;
            }
        }
        return (sumOfDivisors == number) ? true : false;
    }
}
