package main.java.task5.first_question;

import main.java.task5.first_question.situation.Situation;

/**
 * Created by troll on 10.08.2017.
 */
public class Human {

    Situation currentSituation;
    State currentState;

    public Human(Situation currentSituation) {
        this.currentSituation = currentSituation;
    }

    void setSituation(Situation situation) {
        if (situation != null) {
            currentSituation = situation;
        } else {
            throw new NullPointerException("Your situation is null");
        }
    }

    void behaviour() {
        currentState = currentSituation.getHumanState();
        currentState.behaviour();
    }
}
