package main.java.task5.fifth_question;

/**
 * Created by troll on 11.08.2017.
 */
public class Fruit extends Ingredient{

    public Fruit(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
