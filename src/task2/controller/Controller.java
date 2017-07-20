package task2.controller;

import task2.model.Model;
import task2.view.View;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * task2.Controller
 *
 * v 1.0
 *
 * 20/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class Controller {

    //Model and view
    private Model model;
    private View view;

    //Range of search
    private int maxOfRange = 100;
    private int minOfRange = 0;

    //random number
    private int number;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Set value for number
     * */
    private void random() {
        number = (int) Math.round(Math.random() * 100);
    }

    /**
     * Start the game
     * */
    public void process() {
        Scanner scanner = new Scanner(System.in);
        random();
        getValueFromScanner(scanner);
    }

    /**
     * Get searchable value from scanner
     * */
    private void getValueFromScanner(Scanner scanner) {
        view.showInputMessage(minOfRange, maxOfRange);
        while (!scanner.hasNext(String.valueOf(number))) {
            checkInputType(scanner);
        }

        int result = scanner.nextInt();
        model.addNumberToStatistic(result);
        model.setSearchNumber(result);
        view.showResult(model.toString());
    }

    /**
     * Check if input type is integer
     * */
    private void checkInputType(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            view.showErrorMessage(View.OUTPUT_FORMAT_ERROR);
            view.showInputMessage(minOfRange, maxOfRange);
            scanner.next();
        } else {
            int inputNumber = scanner.nextInt();
            checkRangeError(inputNumber);
            view.showInputMessage(minOfRange, maxOfRange);
        }
    }

    /**
     * Check if input number is not out of search range
     * */
    private void checkRangeError(int inputNumber) {
        if (inputNumber < minOfRange || inputNumber > maxOfRange) {
            view.showErrorMessage(View.OUT_OF_RANGE_ERROR);
        } else {
            checkInputBeforeError(inputNumber);
            changeMaxRange(inputNumber);
            changeMinRange(inputNumber);
        }
    }

    /**
     * Check if number is not being wrote before to statistic
     * */
    private void checkInputBeforeError(int inputNumber) {
        ArrayList<Integer> statistic = model.getStatistic();
        if (statistic.contains(inputNumber)) {
            view.showErrorMessage(View.INPUT_BEFORE_ERROR);
        } else {
            model.addNumberToStatistic(inputNumber);
        }
    }

    /**
     * Change maximum threshold of range if input number bigger than searchable number
     * */
    private void changeMaxRange(int inputNumber){
        if (inputNumber > number) {
            maxOfRange = inputNumber;
        }
    }

    /**
     * Change minimum threshold of range if input number less than searchable number
     * */
    private void changeMinRange(int inputNumber){
        if (inputNumber < number) {
            minOfRange = inputNumber;
        }
    }
}
