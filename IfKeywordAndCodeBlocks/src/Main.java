public class Main {
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        // No limit to the number of conditions that can be tested
        else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        }
        // Else block must be last but it is optional
        else {
            System.out.println("Got here");
        }
    }
}
