package main.java.task5.fourth_question;

/**
 * Created by troll on 10.08.2017.
 */
public class Plane {
    Situation situation = Situation.ON_THE_GROUND;
    Weapon weaponType;
    int ammo;

    public Plane(Weapon weaponType, int ammo) {
        if (weaponType != null)
            this.weaponType = weaponType;

        if (ammo > 0)
            this.ammo = ammo;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    ShootingStrategy getShootingStrategy() {
        ShootingStrategy shootingStrategy;
        switch (situation) {
            case ON_THE_GROUND:
                shootingStrategy = new UnavailableShooting();
                break;
            case IN_THE_AIR:
                shootingStrategy = checkWeaponType();
                break;
            default:
                shootingStrategy = new UnavailableShooting();
        }
        return shootingStrategy;
    }

    ShootingStrategy checkWeaponType() {
        ShootingStrategy shootingStrategy;
        switch (weaponType) {
            case GUN:
                shootingStrategy = new GunShooting();
                break;
            case MACHINE_GUN:
                shootingStrategy = new MachineGunShooting();
                break;
            case ROCKETS:
                shootingStrategy = new RocketShooting();
                break;
            default:
                shootingStrategy = new UnavailableShooting();
        }
        return shootingStrategy;
    }

    void shoot(){
        for (int i = 0; i < ammo; i++){
            getShootingStrategy().shooting();
        }
    }
}
