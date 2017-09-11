package main.java.task_car;

/**
 * Created by troll on 17.08.2017.
 */
public enum Wheel {

    BACK_LEFT, BACK_RIGHT, FRONT_LEFT, FRONT_RIGHT;

    boolean isPumped;


    public boolean isPumped() {
        return isPumped;
    }

    public void setPumped(boolean pumped) {
        isPumped = pumped;
    }
}
