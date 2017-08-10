package main.java.task5.fourth_question.situations;

import main.java.task5.fourth_question.ShootingStrategy;
import main.java.task5.fourth_question.weapons.Weapon;

/**
 * Created by troll on 10.08.2017.
 */
public abstract class Situation {
    Weapon weaponType;

    public Situation(){}
    public void setWeaponType(Weapon weaponType){
        this.weaponType = weaponType;
    }

    public abstract ShootingStrategy getShootingStrategy();
}
