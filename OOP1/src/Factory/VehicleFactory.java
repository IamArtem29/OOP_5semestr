package Factory;

import Factory.Vehicles.Cars;
import Factory.Vehicles.Motorcycles;
import Factory.Vehicles.Bikes;

public class VehicleFactory {
    public Vehicle setControl (VehicleType vehicleType) {
        Vehicle vehicle = null;

        switch (vehicleType) {
            case CARS -> vehicle = new Cars(true, false, false, false);
            case MOTORCYCLES -> vehicle = new Motorcycles(true, false, false, true);
            case BIKES -> vehicle = new Bikes(false, true, false, false);
        }

        return vehicle;
    }
}