import Factory.Vehicle;
import Factory.VehicleFactory;
import Factory.VehicleType;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle cars = vehicleFactory.setControl(VehicleType.CARS);
        Vehicle motorcycles = vehicleFactory.setControl(VehicleType.MOTORCYCLES);
        Vehicle bikes = vehicleFactory.setControl(VehicleType.BIKES);
    }
}