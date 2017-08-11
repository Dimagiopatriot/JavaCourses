package main.java.task5.fifth_question;

/**
 * Created by troll on 11.08.2017.
 */
public class Vegetable extends Ingredient{

    public Vegetable(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                '}';
    }
}
