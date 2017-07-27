package main.java.task3;

import main.java.task3.controller.Controller;
import main.java.task3.model.Model;
import main.java.task3.view.View;

/**
 * Created by troll on 27.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.startProgram();
    }
}
