package task2.model;

import task2.view.View;

import java.util.ArrayList;

/*
 * task2.Model
 *
 * v 1.0.1
 *
 * 20/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class Model {

    //Statistic
    private ArrayList<Integer> statistic = new ArrayList<>();
    //Searchable number
    private int searchableNumber;

    //Range of search
    private int maxOfRange = Constants.RANGE_MAX;
    private int minOfRange = Constants.RANGE_MIN;

    //Constants
    private static final String YOUR_ANSWERS = "Your statistic: ";
    private static final String SEARCHABLE_NUMBER = "Searchable number: ";


    public void addNumberToStatistic(int number){
        statistic.add(number);
    }

    public ArrayList<Integer> getStatistic() {
        return statistic;
    }

    public void setSearchableNumber(int searchNumber) {
        this.searchableNumber = searchNumber;
    }

    public int getSearchableNumber() {
        return searchableNumber;
    }

    /**
     * Check if input number is not out of search range
     * */
    public void checkRangeError(int inputNumber, View view) {
        if (inputNumber <= minOfRange || inputNumber >= maxOfRange) {
            view.showErrorMessage(View.OUT_OF_RANGE_ERROR);
        } else {
            addNumberToStatistic(inputNumber);
            changeMaxRange(inputNumber, view);
            changeMinRange(inputNumber, view);
        }
    }

    public int getMaxOfRange() {
        return maxOfRange;
    }

    public int getMinOfRange() {
        return minOfRange;
    }

    /**
     * Change maximum threshold of range if input number bigger than searchable number
     * */
    private void changeMaxRange(int inputNumber, View view){
        if (inputNumber > searchableNumber) {
            maxOfRange = inputNumber;
            view.showMessage(View.INPUT_LESS_NUMBER);
        }
    }

    /**
     * Change minimum threshold of range if input number less than searchable number
     * */
    private void changeMinRange(int inputNumber, View view){
        if (inputNumber < searchableNumber) {
            minOfRange = inputNumber;
            view.showMessage(View.INPUT_MORE_NUMBER);
        }
    }

    @Override
    public String toString() {
        return YOUR_ANSWERS + statistic + "\n" + SEARCHABLE_NUMBER + searchableNumber;
    }
}
