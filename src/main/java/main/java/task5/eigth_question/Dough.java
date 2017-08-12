package main.java.task5.eigth_question;

import main.java.task5.eigth_question.ingredients.Flour;
import main.java.task5.eigth_question.ingredients.Water;

/**
 * Created by troll on 12.08.2017.
 */
public class Dough {
    Flour flour;
    Water water;

    public Dough(Flour flour, Water water) throws Exception {
        if (flour != null && water != null) {
            this.flour = flour;
            this.water = water;
        } else {
            throw new Exception("No dough, no pizza");
        }
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
