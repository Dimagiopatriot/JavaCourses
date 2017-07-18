package HelloWorld;

import HelloWorld.controller.Controller;
import HelloWorld.model.Model;
import HelloWorld.view.View;

/*
 * HelloWorld.Main
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
