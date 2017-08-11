package main.java.task5.fifth_question;

/**
 * Created by troll on 11.08.2017.
 */
public class Meat extends Ingredient {
    public Meat(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Meat){
            Meat anotherMeat = (Meat) obj;
            return this.name.equals(anotherMeat.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "name='" + name + '\'' +
                '}';
    }
}
