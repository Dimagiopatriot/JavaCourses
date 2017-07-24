package main.java.task2;

import main.java.task2.controller.Controller;
import main.java.task2.model.Model;
import main.java.task2.view.View;

/*
 * task2.Main
 *
 * v 1.0.1
 *
 * 20/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class Main {

    public static void main(String[] args) {
        //Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        //run
        controller.process();
    }
}
