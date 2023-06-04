public class Main {
    public static void main(String[] args) {

        int myVariable = 50; // The entire line is a statement, including int and the semicolon

        myVariable++; // This is a statement
        myVariable--; // So is this. Semicolon makes it a statement

        System.out.println("This is a test"); // Entire line is a statement

        // Statements can encompass more than 1 line
        System.out.println("This is " +
                "another " +
                "test.");

        // Following code is not best practice but will still work. Use whitespace to make code more readable but not too much whitespace either
        // If you use IntelliJ's reformatting, the below line of code will change to occupy 3 lines
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        //Following two lines demonstrate proper formatting
        if (myVariable == 0){
            System.out.println("It is now zero");
        }

    }
}
