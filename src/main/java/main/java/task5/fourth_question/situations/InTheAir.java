package main.java.task5.fourth_question.situations;

import main.java.task5.fourth_question.ShootingStrategy;
import main.java.task5.fourth_question.weapons.Weapon;

/**
 * Created by troll on 11.08.2017.
 */
public class InTheAir extends Situation {

    public InTheAir(){
        super();
    }

    @Override
    public ShootingStrategy getShootingStrategy() {
        return weaponType.chooseShootingStrategy();
    }
}
