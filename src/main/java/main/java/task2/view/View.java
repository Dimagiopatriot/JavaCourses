package main.java.task2.view;

/*
 * task2.View
 *
 * v 1.0.1
 *
 * 20/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class View {

    //Input message
    private static final String INPUT_MESSAGE = "Input your number in range: ";
    public static final String INPUT_LESS_NUMBER = "Input less number.";
    public static final String INPUT_MORE_NUMBER = "Input more number.";

    //General error message
    private static final String ERROR_MESSAGE = "Your error: ";

    //Error types
    public static final String OUTPUT_FORMAT_ERROR = "your output is not integer";
    public static final String OUT_OF_RANGE_ERROR = "your number out of range";

    public void showErrorMessage(String errorType){
        System.out.println(ERROR_MESSAGE + errorType);
    }

    public void showInputMessage(int min, int max){
        System.out.println(INPUT_MESSAGE + min + " - " + max);
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
