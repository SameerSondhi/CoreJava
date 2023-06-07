public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int smallerNum = first>second ? second : first;
        int currentMax = 1;
        for(int divisor = 1; divisor<=smallerNum; divisor++){
            if(first % divisor == 0 && second % divisor == 0){
                currentMax = divisor;
            }
        }
        return currentMax;
    }
}
