package main.java.task_car;

import java.util.List;

/**
 * Created by troll on 17.08.2017.
 */
public interface GasStationService {

    void fillUpGas(String gasType);
    void wipeOffMirror();
    void pumpWheels(List<Wheel> wheels);
}
