public class NumberToWords {
    public static void numberToWords(int number){
        int reversedNum = reverse(number); //101
        if(number<0){
            System.out.println("Invalid Value");
        }

        for(int i = 1; i<=getDigitCount(number); i++ ){
            switch (reversedNum % 10){
                case 1:
                    System.out.println("One");
                    reversedNum /= 10;
                    break;
                case 2:
                    System.out.println("Two");
                    reversedNum /= 10;
                    break;
                case 3:
                    System.out.println("Three");
                    reversedNum /= 10;
                    break;
                case 4:
                    System.out.println("Four");
                    reversedNum /= 10;
                    break;
                case 5:
                    System.out.println("Five");
                    reversedNum /= 10;
                    break;
                case 6:
                    System.out.println("Six");
                    reversedNum /= 10;
                    break;
                case 7:
                    System.out.println("Seven");
                    reversedNum /= 10;
                    break;
                case 8:
                    System.out.println("Eight");
                    reversedNum /= 10;
                    break;
                case 9:
                    System.out.println("Nine");
                    reversedNum /= 10;
                    break;
                default:
                    System.out.println("Zero");
                    reversedNum /= 10;
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;

        while(number !=0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number/10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int count = 0;

        if(number<0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        while(number!=0){
            number /= 10;
            count++;
        }
        return count;
    }
}
