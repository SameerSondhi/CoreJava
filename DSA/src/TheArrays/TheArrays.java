package TheArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {
       String[] colors = new String[5];
       colors[0] = "Purple";
       colors[1] = "Blue";
       colors[2] = "Red";
       colors[3] = "Green";
       colors[4] = "Yellow";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[3]);


        int[] numbers = {0,1,2,3,4,5};

        // FOR LOOP (ENHANCED AND NORMAL)
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int number : numbers){
            System.out.println(number);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
