package main.java.task5.eigth_question.cook;

import main.java.task5.eigth_question.Pizza;
import main.java.task5.eigth_question.PizzaBuilder;
import main.java.task5.eigth_question.cook.Cook;
import main.java.task5.eigth_question.ingredients.Cheese;
import main.java.task5.eigth_question.ingredients.Flour;
import main.java.task5.eigth_question.ingredients.Tomato;
import main.java.task5.eigth_question.ingredients.Water;
import main.java.task5.eigth_question.stoves.ElecticStove;
import main.java.task5.eigth_question.stoves.Stove;

/**
 * Created by troll on 12.08.2017.
 */
public class Pizaiolo implements Cook {

    Flour flour;
    Water water;
    Tomato tomato;
    Cheese cheese;

    Pizza pizza;

    @Override
    public void cook() {
        Stove electricStove = new ElecticStove();
        try {
            pizza = new PizzaBuilder()
                    .createDough(flour, water)
                    .addCheese(cheese)
                    .addTomato(tomato)
                    .createPizza();
            electricStove.bake(pizza);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void takeFlour(Flour flour) {
        this.flour = flour;
    }

    public void takeWater(Water water) {
        this.water = water;
    }

    public void takeTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public void takeCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pizza returnPizza() {
        return pizza;
    }
}
