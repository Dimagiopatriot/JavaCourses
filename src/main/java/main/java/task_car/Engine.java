package main.java.task_car;

/**
 * Created by troll on 17.08.2017.
 */
public enum Engine {

    GAS_ENGINE, DIESEL_ENGINE;

    boolean isBroken;

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
