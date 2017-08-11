package main.java.task5.fifth_question;

import main.java.task5.fifth_question.stocks.NoAtStockException;

/**
 * Created by troll on 11.08.2017.
 */
public class FifthApp {

    public static void main(String[] args) throws NoAtStockException {
        Salad salad = new SaladBuilder()
                .addFruit(new Fruit("Cherry"))
                .addVegetables(new Vegetable("Cabbage"))
                .addMeat(new Meat("Chicken"))
                .addSauce(new Sauce("Mayonez"))
                .createSalad();

        System.out.println(salad);
    }
}
