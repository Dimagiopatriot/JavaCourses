package main.java.task5.second_question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 10.08.2017.
 */
public class SecondApp {

    public static void main(String[] args) {
        Human human = new Human();
        List<Situation> situations = new ArrayList<>();
        situations.add(Situation.ON_MUSHROOM_FIELD);
        situations.add(Situation.ON_RIVER);
        situations.add(Situation.SEE_BEAST);

        human.setSituations(situations);
        human.behaviour();
    }
}
