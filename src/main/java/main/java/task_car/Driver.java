package main.java.task_car;

/**
 * Created by troll on 17.08.2017.
 */
public class Driver implements DriveCar {

    Car car;

    public Driver(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("I drive "+car.getMark());
    }

    void fixCarAtServiceStation(FixCar fixCar){
        fixCar.fixEngine(car);
        fixCar.fixUndercarriage(car);
    }

    void goToGasStation(GasStationService gasStationService){
        gasStationService.fillUpGas(car.getEngine().name());
        gasStationService.pumpWheels(car.getWheels());
        gasStationService.wipeOffMirror();
    }
}
