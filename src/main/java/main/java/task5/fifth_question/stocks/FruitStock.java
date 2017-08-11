package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Fruit;
import main.java.task5.fifth_question.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class FruitStock implements Stock {
    Fruit[] fruitsInStock = {new Fruit("Apple"), new Fruit("Strawberry"), new Fruit("Cherry"),
            new Fruit("Peach")};

    @Override
    public void checkIngredients(List<Ingredient> ingredients) throws NoAtStockException {
        List<Fruit> fruitsInStockList = new ArrayList<>(Arrays.asList(fruitsInStock));
        if (!ingredients.containsAll(fruitsInStockList))
            throw new NoAtStockException();
    }
}
