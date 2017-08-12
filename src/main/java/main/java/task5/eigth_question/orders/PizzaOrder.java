package main.java.task5.eigth_question.orders;

import main.java.task5.eigth_question.Dough;
import main.java.task5.eigth_question.Pizza;
import main.java.task5.eigth_question.ingredients.Cheese;
import main.java.task5.eigth_question.ingredients.Tomato;

/**
 * Created by troll on 12.08.2017.
 */
public class PizzaOrder implements Order {
    Pizza pizza;

    public PizzaOrder(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double calculateCost() {

        Dough dough = pizza.getDough();
        Tomato tomato = pizza.getTomato();
        Cheese cheese = pizza.getCheese();

        double sum = dough.getFlour().getPrice() * dough.getFlour().getQuantity();
        sum += dough.getWater().getPrice() * dough.getWater().getQuantity();
        sum += cheese.getPrice() * cheese.getQuantity();
        sum += tomato.getPrice() * tomato.getQuantity();

        return sum;
    }
}
