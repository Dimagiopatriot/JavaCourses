package main.java.task5.eigth_question.stoves;

import main.java.task5.eigth_question.Pizza;
import main.java.task5.eigth_question.stoves.Stove;

/**
 * Created by troll on 12.08.2017.
 */
public class ElecticStove implements Stove {

    @Override
    public void bake(Pizza pizza) {
        System.out.println("Your " + pizza.getClass() + " is baked!");
    }
}
