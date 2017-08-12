package main.java.task5.eigth_question;

import main.java.task5.eigth_question.cook.Pizaiolo;
import main.java.task5.eigth_question.ingredients.*;
import main.java.task5.eigth_question.orders.Order;
import main.java.task5.eigth_question.orders.PizzaOrder;

/**
 * Created by troll on 12.08.2017.
 */
public class EigthApp {

    public static void main(String[] args) {

        Flour flour = new Flour("Ukrainian", 2, 6.50);
        Water water = new Water("Zbruchanska", 1, 1.50);
        Tomato tomato = new Tomato("Cherson", 3, 4.);
        Cheese cheese = new Cheese("Schotlad",1, 19.);

        Pizaiolo pizaiolo = new Pizaiolo();

        pizaiolo.takeFlour(flour);
        pizaiolo.takeWater(water);
        pizaiolo.takeTomato(tomato);
        pizaiolo.takeCheese(cheese);

        pizaiolo.cook();
        Pizza pizza = pizaiolo.returnPizza();

        Order pizzaOrder = new PizzaOrder(pizza);
        double cost = pizzaOrder.calculateCost();

        System.out.println("Your pizza cost: "+ cost);
    }
}
