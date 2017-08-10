package main.java.task5.fourth_question.weapons;

import main.java.task5.fourth_question.GunShooting;
import main.java.task5.fourth_question.ShootingStrategy;

/**
 * Created by troll on 11.08.2017.
 */
public class Gun implements Weapon {
    @Override
    public ShootingStrategy chooseShootingStrategy() {
        return new GunShooting();
    }
}
