package main.java.task3.controller;

import main.java.task3.exceptions.WrongInputNickNameException;
import main.java.task3.model.Model;
import main.java.task3.view.View;

import java.util.Scanner;

/**
 * Created by troll on 27.07.2017.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startProgram() {
        Scanner scanner = new Scanner(System.in);

        inputNote(scanner);
        inputNote(scanner);

        view.printResultMessages();
        view.printMessage(model.getNotations().toString());
    }

    private void inputNote(Scanner scanner) {
        ScannerController scannerController = new ScannerController(scanner, view);
        boolean finished = false;
        while (!finished) {
            try {
                model.addNotation(scannerController.createNotation());
            } catch (WrongInputNickNameException e) {
                scannerController.inputNewNickName();
            }
            finished = true;

        }
    }
}
