package task2.view;

/*
 * task2.View
 *
 * v 1.0
 *
 * 20/07/2017
 *
 * Created by Dmitriy Smishnyi
 * */
public class View {

    private static final String INPUT_MESSAGE = "Input your number in range: ";

    private static final String ERROR_MESSAGE = "Your error: ";

    public static final String OUTPUT_FORMAT_ERROR = "your output is not integer";
    public static final String INPUT_BEFORE_ERROR = "you input this number before";
    public static final String OUT_OF_RANGE_ERROR = "your number out of range";

    public void showErrorMessage(String errorType){
        System.out.println(ERROR_MESSAGE + errorType);
    }

    public void showInputMessage(int min, int max){
        System.out.println(INPUT_MESSAGE + min + " - " + max);
    }

    public void showResult(String result){
        System.out.println(result);
    }
}
