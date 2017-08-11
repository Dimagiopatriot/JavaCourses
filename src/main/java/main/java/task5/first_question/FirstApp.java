package main.java.task5.first_question;

import main.java.task5.first_question.situation.OnMushroomField;
import main.java.task5.first_question.situation.OnRiver;

/**
 * Created by troll on 10.08.2017.
 */
public class FirstApp {
    public static void main(String[] args) {

        Human human = new Human(new OnMushroomField());
        human.setSituation(new OnRiver());
        human.behaviour();
    }
}
