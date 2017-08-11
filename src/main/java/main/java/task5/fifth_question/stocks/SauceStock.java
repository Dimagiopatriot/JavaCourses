package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Ingredient;
import main.java.task5.fifth_question.Sauce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class SauceStock implements Stock {
    Sauce[] saucesInStock = {new Sauce("Mayonez"), new Sauce("Ketchup"),
            new Sauce("Ketchunez"),
            new Sauce("Tobasco")};

    @Override
    public void checkIngredients(List<Ingredient> ingredients) throws NoAtStockException {
        List<Sauce> saucesInStockList = new ArrayList<>(Arrays.asList(saucesInStock));
        if (!ingredients.containsAll(saucesInStockList))
            throw new NoAtStockException();
    }
}
