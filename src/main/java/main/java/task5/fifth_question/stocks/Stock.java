package main.java.task5.fifth_question.stocks;

import main.java.task5.fifth_question.Ingredient;

import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public interface Stock {
    void checkIngredients(List<Ingredient> ingredients) throws NoAtStockException;
}
