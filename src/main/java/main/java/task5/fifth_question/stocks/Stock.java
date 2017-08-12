package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Ingredient;

import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public abstract class Stock<T extends Ingredient> {

    List<T> ingredientsInStock;

    public void checkIngredients(List<T> ingredients) throws NoAtStockException{
        for (T ingredient : ingredients) {
            if (!ingredientsInStock.contains(ingredient))
                throw new NoAtStockException();
        }
    }
}
