package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Vegetable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class VegetableStock extends Stock<Vegetable> {
    Vegetable[] vegetablesInStock = {new Vegetable("Cabbage"), new Vegetable("Onion"), new Vegetable("Carrot")};

    @Override
    public void checkIngredients(List<Vegetable> ingredients) throws NoAtStockException {
        ingredientsInStock = Arrays.asList(vegetablesInStock);
        super.checkIngredients(ingredients);
    }
}
