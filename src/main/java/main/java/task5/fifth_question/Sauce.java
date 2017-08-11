package main.java.task5.fifth_question;

/**
 * Created by troll on 11.08.2017.
 */
public class Sauce extends Ingredient {
    public Sauce(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Sauce){
            Sauce anotherSauce = (Sauce) obj;
            return this.name.equals(anotherSauce.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "name='" + name + '\'' +
                '}';
    }
}
