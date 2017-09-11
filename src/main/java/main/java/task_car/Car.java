package main.java.task_car;

import java.util.List;

/**
 * Created by troll on 17.08.2017.
 */
public class Car {

    List<Wheel> wheels;
    String mark;
    Undercarriage undercarriage;
    Engine engine;

    Car(String mark){
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Undercarriage getUndercarriage() {
        return undercarriage;
    }

    public void setUndercarriage(Undercarriage undercarriage) {
        this.undercarriage = undercarriage;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
