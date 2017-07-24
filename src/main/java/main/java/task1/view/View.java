package main.java.task1.view;

/*
 * View
 *
 * v 1.0
 *
 * 18/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class View {

    //Constants for outputting messages
    public static final String INPUT_MESSAGE = "Input word";
    public static final String ERROR_MESSAGE = "It is wrong word, it should be: ";

    public void showResult(String resultString){
        System.out.print(resultString);
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
