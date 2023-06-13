public class Car {
//    Private is an access modifier, like public or protected
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake(){
        return make;
    }

    public void setMake(String make) {
        if(make == null)
            make = "Unknown make";
            String lowercaseMake = make.toLowerCase();
            switch(lowercaseMake){
                case "holden", "porsche", "tesla" -> this.make = make;
                default -> {
                    this.make= "Unsupported ";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
