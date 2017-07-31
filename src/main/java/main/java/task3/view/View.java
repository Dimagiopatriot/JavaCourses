package main.java.task3.view;

import static main.java.task3.view.ViewConstants.*;
import static main.java.task3.util.GrammarValues.*;
/**
 * Created by troll on 27.07.2017.
 */
public class View {

    public void printMessage(String message){
        System.out.println(message);
    }

    public String concat(String ... messages){
        StringBuilder str = new StringBuilder();
        for (String string: messages) {
            str.append(string);
        }
        return str.toString();
    }

    public void printInputNameMessages(){
        printMessage(concat(ENTER, SPACE, NAME, COLON));
    }
    public void printInputSurnameMessages(){
        printMessage(concat(ENTER, SPACE, SURNAME, COLON));
    }
    public void printInputMiddleNameMessages(){
        printMessage(concat(ENTER, SPACE, MIDDLE_NAME, COLON));
    }
    public void printInputNickNameMessages(){
        printMessage(concat(ENTER, SPACE, NICK_NAME, COLON));
    }
    public void printInputEmailMessages(){
        printMessage(concat(ENTER, SPACE, EMAIL, COLON));
    }
    public void printInputPhoneMessages(){
        printMessage(concat(ENTER, SPACE, PHONE, COLON));
    }

    public void printInputCityMessages(){
        printMessage(concat(ENTER, SPACE, CITY, COLON));
    }

    public void printInputStreetMessages(){
        printMessage(concat(ENTER, SPACE, STREET, COLON));
    }

    public void printInputApartmentNumberMessages(){
        printMessage(concat(ENTER, SPACE, APARTMENT_NUMBER, COLON));
    }

    public void printInputHouseNumberMessages(){
        printMessage(concat(ENTER, SPACE, HOUSE_NUMBER, COLON));
    }

    public void printWrongInputMessages(){
        printMessage(concat(ENTER, SPACE, WRONG_INPUT, DOT));
    }

    public void printWrogInputNickName(){
        printMessage(concat(WRONG_INPUT, SPACE, NICK_NAME_ALREADY_EXIST, SPACE, ENTER, SPACE, ANOTHER, NICK_NAME, DOT));
    }

    public void printResultMessages(){
        printMessage(concat(RESULT, COLON));
    }
}
