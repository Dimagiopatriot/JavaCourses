package main.java.task5.fifth_question;

import main.java.task5.fifth_question.stocks.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class SaladBuilder {

    List<Fruit> fruits = new ArrayList<>();
    List<Vegetable> vegetables = new ArrayList<>();
    List<Meat> meats = new ArrayList<>();
    List<Sauce> sauces = new ArrayList<>();

    SaladBuilder addFruit(Fruit fruit){
        fruits.add(fruit);
        return this;
    }

    SaladBuilder addVegetables(Vegetable vegetable){
        vegetables.add(vegetable);
        return this;
    }

    SaladBuilder addMeat(Meat meat){
        meats.add(meat);
        return this;
    }

    SaladBuilder addSauce(Sauce sauce){
        sauces.add(sauce);
        return this;
    }

    Salad createSalad() throws NoAtStockException {
        Salad salad = new Salad();
        salad.setFruits(fruits);
        salad.setVegetables(vegetables);
        salad.setMeats(meats);
        salad.setSauces(sauces);
        checkIngredients(salad);
        return salad;
    }

    private void checkIngredients(Salad salad) throws NoAtStockException {

        Stock<Fruit> fruitStock = new FruitStock();
        Stock<Vegetable> vegetablesStock = new VegetableStock();
        Stock<Meat> meatStock = new MeatStock();
        Stock<Sauce> sauceStock = new SauceStock();

        fruitStock.checkIngredients(salad.getFruits());
        vegetablesStock.checkIngredients(salad.getVegetables());
        meatStock.checkIngredients(salad.getMeats());
        sauceStock.checkIngredients(salad.getSauces());
    }
}
