public class EqualSumChecker {
    public static boolean hasEqualSum(int one, int two, int three){
        boolean equalSum = true;
        int sum = one + two;
        if(sum == three){
            return equalSum;
        }
        else{
            equalSum = false;
        }
        return equalSum;
    }
}
