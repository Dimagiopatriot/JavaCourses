package main.java.task_car;

import java.util.List;

/**
 * Created by troll on 17.08.2017.
 */
public class GasStation implements GasStationService{
    @Override
    public void fillUpGas(String gasType) {
        System.out.println("Car is filled by " + gasType);
    }

    @Override
    public void wipeOffMirror() {
        System.out.println("Wipe mirror");
    }

    @Override
    public void pumpWheels(List<Wheel> wheels) {
        for (Wheel wheel: wheels){
            wheel.setPumped(true);
        }
    }
}
