package main.java.task5.first_question;

/**
 * Created by troll on 10.08.2017.
 */
public class Human {

    Situation currentSituation = Situation.AT_HOME;
    State currentState;

    void setSituation(Situation situation) {
        currentSituation = situation;
    }

    void changeState(Situation situation) {
        switch (situation) {
            case ON_RIVER:
                currentState = new Fisher();
                break;
            case ON_MUSHROOM_FIELD:
                currentState = new Gatherer();
                break;
            case SEE_BEAST:
                currentState = new Hunter();
                break;
            default:
                throw new IllegalStateException("Sorry your human at home");
        }
    }

    void behaviour(){
        changeState(currentSituation);
        currentState.behaviour();
    }
}
