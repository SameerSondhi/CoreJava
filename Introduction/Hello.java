//Declaring a public class called Hello
public class Hello {
    //Printing a string literal
    public static void main(String[] args) {
        System.out.println("Hello, Sameer");

        //Declaring a boolean variable, followed by an if-then code block
        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        }
        else {
            System.out.println("It is an alien");
        }

        //Declaring an int variable(s), followed by more conditionals
        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        //CHALLENGE 1: Exploring the difference between = and ==
        int newValue = 50;
        //If we used  = instead of ==, we would run into an error
        if (newValue == 50){
            System.out.println("This was an error. Before the == was used");
        }

        //CHALLENGE 2
        // Using abbreviated operators for booleans is recommended
        boolean isCar = false;
        if (isCar = true){
            System.out.println("This is not supposed to happen. It does because the statement assigns true to isCar and returns true. If you change the assignment operator to ==, nothing will print");
        }
        if (isCar){
            System.out.println("This will return the value of isCar and return true");
        }

        //Ternary operator
        //Conditional operator: Operand1 ? Operand2 : Operand3;
        String makeOfCar = "Volkswagen";
        // Making sure that make of car is Volkswagen
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(!isDomestic){
            System.out.println("This car is domestic to our country");
        }

        // Alternative way to write line 47
        // boolean isDomestic = (makeOfCar != "Volkswagen");
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);


        //OPERATOR CHALLENGE
        double doubleValue = 20.00d;
        double doubleValue2 = 80.00d;

        double result = (doubleValue + doubleValue2) * 100.00d;
            System.out.println("Result is: " + result);

        double remainder = result % 40.00d;
            System.out.println("Remainder is: " + remainder);

        boolean check = (remainder == 0) ? true : false;
            System.out.println("No remainder? " + check);

        if(!check){
            System.out.println("Got some remainder");
        }
    }
}
