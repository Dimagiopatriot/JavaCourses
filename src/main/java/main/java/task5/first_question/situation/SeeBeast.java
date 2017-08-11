package main.java.task5.first_question.situation;

import main.java.task5.first_question.Hunter;
import main.java.task5.first_question.State;

/**
 * Created by troll on 11.08.2017.
 */
public class SeeBeast extends Situation {
    @Override
    public State getHumanState() {
        return new Hunter();
    }
}
