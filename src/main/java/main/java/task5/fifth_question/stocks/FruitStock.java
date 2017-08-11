package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Fruit;

import java.util.Arrays;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class FruitStock extends Stock<Fruit> {
    Fruit[] fruitsInStock = {new Fruit("Apple"), new Fruit("Strawberry"), new Fruit("Cherry"),
            new Fruit("Peach")};

    @Override
    public void checkIngredients(List<Fruit> ingredients) throws NoAtStockException {
        ingredientsInStock = Arrays.asList(fruitsInStock);
        super.checkIngredients(ingredients);
    }
}
