package main.java.task2.controller;


import main.java.task2.model.Constants;
import main.java.task2.model.Model;
import main.java.task2.view.View;

import java.util.Scanner;

/*
 * task2.Controller
 *
 * v 1.0.1
 *
 * 20/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class Controller {

    //Model and view
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Set value for number
     * */
    public int random(int minRange, int maxRange) {
         return (int) Math.round(Math.random() * (maxRange - 1)) + minRange + 1;
    }

    /**
     * Start the game
     * */
    public void process() {
        Scanner scanner = new Scanner(System.in);
        model.setSearchableNumber(random(Constants.RANGE_MIN, Constants.RANGE_MAX));
        getValueFromScanner(scanner);
    }

    /**
     * Get searchable value from scanner
     * */
    public void getValueFromScanner(Scanner scanner) {
        view.showInputMessage(model.getMinOfRange(), model.getMaxOfRange());
        while (!scanner.hasNext(String.valueOf(model.getSearchableNumber()))) {
            checkInputType(scanner);
        }

        int result = scanner.nextInt();
        model.addNumberToStatistic(result);
        view.showMessage(model.toString());
    }

    /**
     * Check if input type is integer
     * */
    public void checkInputType(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            view.showErrorMessage(View.OUTPUT_FORMAT_ERROR);
            view.showInputMessage(model.getMinOfRange(), model.getMaxOfRange());
            scanner.next();
        } else {
            int inputNumber = scanner.nextInt();
            model.checkRangeError(inputNumber, view);
            view.showInputMessage(model.getMinOfRange(), model.getMaxOfRange());
        }
    }
    
}
