package main.java.task5.fifth_question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 11.08.2017.
 */
public class Salad {
    List<Fruit> fruits = new ArrayList<>();
    List<Vegetable> vegetables = new ArrayList<>();
    List<Meat> meats = new ArrayList<>();
    List<Sauce> sauces = new ArrayList<>();

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }

    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }

    public void addMeat(Meat meat){
        meats.add(meat);
    }

    public void addSauce(Sauce sauce){
        sauces.add(sauce);
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public void setMeats(List<Meat> meats) {
        this.meats = meats;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public List<Meat> getMeats() {
        return meats;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "fruits=" + fruits +
                ", vegetables=" + vegetables +
                ", meats=" + meats +
                ", sauces=" + sauces +
                '}';
    }
}
