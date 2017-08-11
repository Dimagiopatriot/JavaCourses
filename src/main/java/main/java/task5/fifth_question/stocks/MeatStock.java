package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Ingredient;
import main.java.task5.fifth_question.Meat;

import java.util.Arrays;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class MeatStock extends Stock<Meat> {
    Meat[] meatsInStock = {new Meat("Chicken"), new Meat("Pig"), new Meat("Cow")};

    @Override
    public void checkIngredients(List<Meat> ingredients) throws NoAtStockException {
        ingredientsInStock = Arrays.asList(meatsInStock);
        super.checkIngredients(ingredients);
    }
}
