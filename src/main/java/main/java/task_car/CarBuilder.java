package main.java.task_car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 17.08.2017.
 */
public class CarBuilder {

    List<Wheel> wheels = new ArrayList<>();
    String mark = "";
    Undercarriage undercarriage = new Undercarriage();
    Engine engine = Engine.GAS_ENGINE;

    CarBuilder addWheels(List<Wheel> wheels){
        this.wheels = wheels;
        return this;
    }

    CarBuilder setMark(String mark){
        this.mark = mark;
        return this;
    }

    CarBuilder addUndercarriage(Undercarriage undercarriage){
        this.undercarriage = undercarriage;
        return this;
    }

    CarBuilder addEngine(Engine engine){
        this.engine = engine;
        return this;
    }

    Car createCar(){
        Car car = new Car(mark);
        car.setWheels(wheels);
        car.setUndercarriage(undercarriage);
        car.setEngine(engine);
        return car;
    }
}
