public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        double convertKilometersToMiles = (1/1.609);
        double milesPerHour = ((kilometersPerHour) * (convertKilometersToMiles));
        long roundedValue = Math.round(milesPerHour);
        if(kilometersPerHour<0){
            return -1;
        }
        return roundedValue;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour>=0){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }

}
