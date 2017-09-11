package main.java.task_car;

import java.util.Arrays;

/**
 * Created by troll on 17.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setMark("Mercedes")
                .addWheels(Arrays.asList(Wheel.BACK_LEFT, Wheel.BACK_RIGHT, Wheel.FRONT_LEFT, Wheel.FRONT_RIGHT))
                .addUndercarriage(new Undercarriage())
                .addEngine(Engine.GAS_ENGINE)
                .createCar();

    }
}
