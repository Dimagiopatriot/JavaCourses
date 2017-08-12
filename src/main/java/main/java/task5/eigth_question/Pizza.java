package main.java.task5.eigth_question;

import main.java.task5.eigth_question.ingredients.Cheese;
import main.java.task5.eigth_question.ingredients.Tomato;

/**
 * Created by troll on 12.08.2017.
 */
public class Pizza {

    Dough dough;
    Tomato tomato;
    Cheese cheese;

    Pizza(Dough dough) {
        this.dough = dough;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Dough getDough() {
        return dough;
    }
}
