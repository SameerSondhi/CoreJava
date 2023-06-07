public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
        int moduloA = a % 10;
        int moduloB = b % 10;
        int moduloC = c % 10;
        if(moduloA == moduloB || moduloB == moduloC || moduloA==moduloC){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isValid(int number){
        if(number<10 || number>1000){
            return false;
        }
        else{
            return true;
        }
    }
}
