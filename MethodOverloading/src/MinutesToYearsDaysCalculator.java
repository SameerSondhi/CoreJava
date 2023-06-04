public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        int hours = (int)(minutes/60);
        int days = hours/24;
        int years = days/365;

        int remainingDays = days % 365;
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
