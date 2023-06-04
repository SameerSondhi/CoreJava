public class OverloadedMethodChallenge {

    public static void main(String[] args){
        System.out.println(convertToCentimeters(50));
        System.out.println(convertToCentimeters(5, 10));
    }
    public static double convertToCentimeters(int height){
        double heightInCentimeters = (double)(height) * 2.54;
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        int heightInInches = (heightInFeet * 12) + remainingHeightInInches;
        return convertToCentimeters(heightInInches);
    }
}
