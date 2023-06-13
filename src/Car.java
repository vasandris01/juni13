public class Car extends Vehicle{
    public Car(String color, int maxSpeed) {
        super(color,maxSpeed);
    }
    public Car(){
        super("piros",10);
    };

    public void move(){
        System.out.println("Gurulok");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}


