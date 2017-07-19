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

    private Model model;
    private View view;

    private int maxOfRange = 100;
    private int minOfRange = 0;

    private int number;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private void random() {
        number = (int) Math.round(Math.random() * 100);
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        random();
        getValueFromScanner(scanner);
    }

    private void getValueFromScanner(Scanner scanner) {
        checkInputType(scanner);

    }

    private void checkInputType(Scanner scanner) {
        view.showInputMessage(minOfRange, maxOfRange);
        while (!scanner.hasNext(String.valueOf(number))) {
            if (!scanner.hasNextInt()) {
                view.showErrorMessage(View.OUTPUT_FORMAT_ERROR);
                view.showInputMessage(minOfRange, maxOfRange);
                scanner.next();
            } else {
                int localNumber = scanner.nextInt();
                if (localNumber < minOfRange || localNumber > maxOfRange) {
                    view.showErrorMessage(View.OUT_OF_RANGE_ERROR);
                } else {
                    ArrayList<Integer> statistic = model.getStatistic();
                    if (statistic.contains(localNumber)) {
                        view.showErrorMessage(View.INPUT_BEFORE_ERROR);
                    } else {
                        model.addNumberToStatistic(localNumber);
                    }
                    if (localNumber > number) {
                        maxOfRange = localNumber;
                    }

                    if (localNumber < number) {
                        minOfRange = localNumber;
                    }
                }
                view.showInputMessage(minOfRange, maxOfRange);
            }
        }
        int result = scanner.nextInt();
        model.addNumberToStatistic(result);
        model.setSearchNumber(result);
        view.showResult(model.toString());
    }
}
