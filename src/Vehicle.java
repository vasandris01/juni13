public abstract class Vehicle {
    protected String color;
    protected int maxSpeed;

    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void move();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
