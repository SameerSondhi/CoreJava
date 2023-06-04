public class SecondsAndMinutes {

    public static void main(String[] args){
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(65, 105));
    }

    public static String getDurationString(int seconds){
        int minutes = seconds/60;
        if(seconds<0) {
            return "Invalid number of seconds";
        }
        else{
        return getDurationString(minutes, seconds);
    }
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = minutes/60;

        int remainingMinutes = minutes % 60;

        int remainingSeconds= seconds % 60;
        if(minutes<0 || seconds>59 || seconds<0){
            return "Invalid value(s)";
        }
        else {
            return hours + " hours " + remainingMinutes + " minutes " + remainingSeconds + " seconds ";
        }
        }
    }

