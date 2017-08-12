package main.java.task5.eigth_question;

import main.java.task5.eigth_question.ingredients.Cheese;
import main.java.task5.eigth_question.ingredients.Flour;
import main.java.task5.eigth_question.ingredients.Tomato;
import main.java.task5.eigth_question.ingredients.Water;

/**
 * Created by troll on 12.08.2017.
 */
public class PizzaBuilder {

    Dough dough;
    Tomato tomato;
    Cheese cheese;

    public PizzaBuilder createDough(Flour flour, Water water) throws Exception {
        dough = new Dough(flour, water);
        return this;
    }

    public PizzaBuilder addTomato(Tomato tomato) {
        this.tomato = tomato;
        return this;
    }

    public PizzaBuilder addCheese(Cheese cheese) {
        this.cheese = cheese;
        return this;
    }

    public Pizza createPizza() {
        Pizza pizza = new Pizza(dough);
        pizza.setTomato(tomato);
        pizza.setCheese(cheese);

        return pizza;
    }
}
