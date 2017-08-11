package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Sauce;

import java.util.Arrays;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class SauceStock extends Stock<Sauce> {
    Sauce[] saucesInStock = {new Sauce("Mayonez"), new Sauce("Ketchup"),
            new Sauce("Ketchunez"),
            new Sauce("Tobasco")};

    @Override
    public void checkIngredients(List<Sauce> ingredients) throws NoAtStockException {
        ingredientsInStock = Arrays.asList(saucesInStock);
        super.checkIngredients(ingredients);
    }
}
