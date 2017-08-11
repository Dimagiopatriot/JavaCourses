package main.java.task5.fifth_question;

/**
 * Created by troll on 11.08.2017.
 */
public class Vegetable extends Ingredient{

    public Vegetable(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Vegetable){
            Vegetable anotherVegetable = (Vegetable) obj;
            return this.name.equals(anotherVegetable.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                '}';
    }
}
