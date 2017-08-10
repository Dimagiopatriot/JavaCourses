package main.java.task5.fourth_question.situations;

import main.java.task5.fourth_question.ShootingStrategy;
import main.java.task5.fourth_question.UnavailableShooting;

/**
 * Created by troll on 11.08.2017.
 */
public class OnTheGround extends Situation {
    @Override
    public ShootingStrategy getShootingStrategy() {
        return new UnavailableShooting();
    }
}
