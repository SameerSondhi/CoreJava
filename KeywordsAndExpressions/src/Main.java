public class Main {
    public static void main(String[] args){
        // cannot declare something using keywords
        // int int = 5; is a mistake whereas int int1 = 5; is correct
        // This is because int is a keyword (reserved) in Java

        // Miles to kilometers
        double kilometers = (100 * 1.609344); //This is an expression

        int highScore = 50;
        if (highScore > 25){ //highScore > 25 is an expression
            highScore = 1000 + highScore; //enter line is an expression as well as the second part
        }
        int health = 100; //excluding "int", this is an expression
        if((health < 25) && (highScore>1000)){ //Three expressions in this line
            highScore = highScore - 1000; //Two expressions in this line
        }


    }
}
