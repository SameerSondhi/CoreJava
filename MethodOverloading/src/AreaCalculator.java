public class AreaCalculator {
    public static double area(double radius){
        double circleArea = Math.PI * radius * radius;
        if(radius<0){
            return -1.0;
        }
        else{
            return circleArea;
        }
    }

    public static double area(double x, double y){
        double rectangleArea = x * y;
        if(x<0 || y<0){
            return -1.0;
        }
        else{
            return rectangleArea;
        }
    }
}
