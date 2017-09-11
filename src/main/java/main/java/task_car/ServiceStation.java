package main.java.task_car;

/**
 * Created by troll on 17.08.2017.
 */
public class ServiceStation implements FixCar {
    @Override
    public void fixEngine(Engine engine) {
        engine.setBroken(false);
    }

    @Override
    public void fixUndercarriage(Undercarriage undercarriage) {
        undercarriage.setBroken(false);
    }
}
