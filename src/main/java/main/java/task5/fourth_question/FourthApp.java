package main.java.task5.fourth_question;

import main.java.task5.fourth_question.situations.InTheAir;
import main.java.task5.fourth_question.situations.OnTheGround;
import main.java.task5.fourth_question.weapons.Rockets;

/**
 * Created by troll on 10.08.2017.
 */
public class FourthApp {

    public static void main(String[] args) {
        Plane plane = new Plane(new Rockets(), 6);
        plane.setSituation(new InTheAir());
        plane.shoot();
    }
}
