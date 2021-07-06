package car;

public class Car {

    private boolean engine = false;
    private int cylinders;
    private String name;
    private int wheels = 0;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return("Car -> startEngine()");
    }

    public String accelerate() {
        return("Car -> accelerate()");
    }

    public String brake() {
        return("Car -> brake()");
    }
}
