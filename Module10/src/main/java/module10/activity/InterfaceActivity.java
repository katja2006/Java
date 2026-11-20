package module10.activity;

//Create class InterfaceActivity
public class InterfaceActivity {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Bike();

        Vehicle vehicle2 = new Car();

        //Call bike methods
        vehicle1.start();
        vehicle1.stop();

        //Call car methods
        vehicle2.start();
        vehicle2.stop();
    }
}
