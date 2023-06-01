public class PositiveNegativeZero {
    //Method called checkNumber that tests whether the argument integer is a positive number, negative number or zero
    // write code here
    public static void checkNumber(int number){
        if(number>0){
            System.out.println("positive");
        }
        else if(number<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
