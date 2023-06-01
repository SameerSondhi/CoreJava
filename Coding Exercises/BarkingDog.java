public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        boolean wakeUp = true;
        if(isBarking && (hourOfDay<8 && hourOfDay>=0) || (hourOfDay==23)){
            return wakeUp;
        }
        else {
            wakeUp = false;
        }
        return wakeUp;
    }
}
