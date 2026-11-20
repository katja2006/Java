package module10.activity;

//Create class Car
public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("\nCar starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
