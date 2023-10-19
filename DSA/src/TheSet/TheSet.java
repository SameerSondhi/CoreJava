package TheSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TheSet {
    public static void main(String[] args) {

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);

    }

    record Ball(String color){

    }
}
