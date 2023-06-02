public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        boolean isEqual = true;
        one = one * 1000;
        two = two * 1000;
        int first = (int) one;
        int second = (int) two;
        if(first==second){
            return isEqual;
        }
        else{
            isEqual = false;
        }

        return isEqual;
    }
}
