package main.java.task5.first_question.situation;

import main.java.task5.first_question.Gatherer;
import main.java.task5.first_question.State;

/**
 * Created by troll on 11.08.2017.
 */
public class OnMushroomField extends Situation {
    @Override
    public State getHumanState() {
        return new Gatherer();
    }
}
