public class Airplane extends Vehicle{

    public Airplane(String color, int maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("repül");
    }
}
