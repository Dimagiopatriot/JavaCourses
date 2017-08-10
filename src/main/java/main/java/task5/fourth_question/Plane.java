package main.java.task5.fourth_question;

import main.java.task5.fourth_question.situations.OnTheGround;
import main.java.task5.fourth_question.situations.Situation;
import main.java.task5.fourth_question.weapons.Weapon;

/**
 * Created by troll on 10.08.2017.
 */
public class Plane {
    Situation situation = new OnTheGround();
    Weapon weaponType;
    int ammo;

    public Plane(Weapon weaponType, int ammo) {
        if (weaponType != null)
            this.weaponType = weaponType;

        if (ammo > 0)
            this.ammo = ammo;
    }

    public void setSituation(Situation situation) {
        situation.setWeaponType(weaponType);
        this.situation = situation;
    }

    void shoot(){
        for (int i = 0; i < ammo; i++){
            situation.getShootingStrategy().shooting();
        }
    }
}
