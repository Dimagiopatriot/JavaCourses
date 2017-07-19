package task1.controller;

import task1.model.Model;
import task1.view.View;

import java.util.Scanner;

/*
 * Controller
 *
 * v 1.0
 *
 * 18/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class Controller {

    //Constants
    private static final String FIRST_WORD_STANDARD = "Hello";
    private static final String SECOND_WORD_STANDARD = "world!";

    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void process() {
        model.setResultString(getValueFromScanner());
        view.showResult(model.getResultString());
    }

    /**
     * Construct united result string from parts from scanner
     *
     * @return value for task1.model result string
     * */
    private String getValueFromScanner() {
        view.showMessage(View.INPUT_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        String resultString = resultStringAppending(scanner, FIRST_WORD_STANDARD);
        view.showMessage(View.INPUT_MESSAGE);
        resultString += " " + resultStringAppending(scanner, SECOND_WORD_STANDARD);
        scanner.close();
        return resultString;
    }

    /**
     * Get a part of string from scanner
     *
     * @return a part of result string
     * */
    private String resultStringAppending(Scanner scanner, String wordStandard) {
        String result = "";
        while (!scanner.hasNext(wordStandard)) {
            view.showMessage(View.ERROR_MESSAGE + wordStandard);
            view.showMessage(View.INPUT_MESSAGE);
            scanner.next();
        }
        result += scanner.next();
        return result;
    }
}
