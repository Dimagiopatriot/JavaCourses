package main.java.task5.second_question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 10.08.2017.
 */
public class Human {

    Situation currentSituation = Situation.AT_HOME;
    List<Situation> situations = new ArrayList<>();

    State currentState;

    void setSituation(Situation situation) {
        if (situation != null) {
            situations.clear();
            currentSituation = situation;
            situations.add(currentSituation);
        } else {
            throw new NullPointerException("Your situation is null");
        }
    }

    void setSituations(List<Situation> situations) {
        this.situations = situations;
    }
    
    void behaviour() {
        BehaviourBuilder builder = new BehaviourBuilder()
                .buildStates(situations)
                .buildBehaviour();
    }
}
