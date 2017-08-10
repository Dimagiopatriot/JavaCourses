package main.java.task5.fourth_question;

/**
 * Created by troll on 10.08.2017.
 */
public class FourthApp {

    public static void main(String[] args) {
        Plane plane = new Plane(Weapon.ROCKETS, 6);
        plane.setSituation(Situation.ON_THE_GROUND);
        plane.shoot();
    }
}
