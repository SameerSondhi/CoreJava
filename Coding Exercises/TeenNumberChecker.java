public class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3){
        boolean isTeenAge = true;
        if(age1>=13 && age1<=19 || age2>=13 && age2<=19 || age3>=13 && age3<=19){
            return isTeenAge;
        }
        else{
            isTeenAge = false;
        }
        return isTeenAge;
    }

    public static boolean isTeen(int age){
        boolean checkOneAge = true;
        if(age>=13 && age<=19){
            return checkOneAge;
        }
        else{
            checkOneAge = false;
        }
        return checkOneAge;
    }
}
