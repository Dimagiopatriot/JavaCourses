package main.java.task5.fifth_question;

/**
 * Created by troll on 11.08.2017.
 */
public abstract class Ingredient {

    String name;

    public Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ingredient){
            Ingredient anotherIngredient = (Ingredient) obj;
            return this.name.equals(anotherIngredient.getName());
        }
        return false;
    }
}
