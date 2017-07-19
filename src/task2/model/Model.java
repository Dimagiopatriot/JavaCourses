package task2.model;

import java.util.ArrayList;

/*
 * task2.Model
 *
 * v 1.0
 *
 * 20/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class Model {

    private ArrayList<Integer> statistic = new ArrayList<>();
    private int searchableNumber;

    private static final String YOUR_ANSWERS = "Your statistic: ";
    private static final String SEARCHABLE_NUMBER = "Searchable number: ";


    public void addNumberToStatistic(int number){
        statistic.add(number);
    }

    public ArrayList<Integer> getStatistic() {
        return statistic;
    }

    public void setSearchNumber(int searchNumber) {
        this.searchableNumber = searchNumber;
    }

    @Override
    public String toString() {
        return YOUR_ANSWERS + statistic + "\n" + SEARCHABLE_NUMBER + searchableNumber;
    }
}
