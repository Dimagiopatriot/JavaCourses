package task1;

import task1.controller.Controller;
import task1.model.Model;
import task1.view.View;

/*
 * task1.Main
 *
 * v 1.0
 *
 * 18/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class Main {
    public static void main(String[] args) {
        //Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        //Start executing
        controller.process();
    }
}
