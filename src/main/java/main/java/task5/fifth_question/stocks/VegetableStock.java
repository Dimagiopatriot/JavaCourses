package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Ingredient;
import main.java.task5.fifth_question.Vegetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class VegetableStock implements Stock {
    Vegetable[] vegetablesInStock = {new Vegetable("Cabbage"), new Vegetable("Onion"), new Vegetable("Carrot")};

    @Override
    public void checkIngredients(List<Ingredient> ingredients) throws NoAtStockException {
        List<Vegetable> vegetablesInStockList = new ArrayList<>(Arrays.asList(vegetablesInStock));
        if (!ingredients.containsAll(vegetablesInStockList))
            throw new NoAtStockException();
    }
}
