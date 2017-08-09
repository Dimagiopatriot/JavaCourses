package main.java.task5.second_question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 10.08.2017.
 */
public class BehaviourBuilder {

    List<State> states = new ArrayList<>();

    BehaviourBuilder buildStates(List<Situation> situations){
        for (Situation situation : situations)
            addState(situation);
        return this;
    }

    BehaviourBuilder buildBehaviour(){
        for (State state: states){
            state.behaviour();
            System.out.print(" and ");
        }
        System.out.print("end.");
        return this;
    }

    void addState(Situation situation) {
        switch (situation) {
            case ON_RIVER:
                states.add(new Fisher());
                break;
            case ON_MUSHROOM_FIELD:
                states.add(new Gatherer());
                break;
            case SEE_BEAST:
                states.add(new Hunter());
                break;
            default:
                throw new IllegalStateException("Sorry your human at home");
        }
    }
}
