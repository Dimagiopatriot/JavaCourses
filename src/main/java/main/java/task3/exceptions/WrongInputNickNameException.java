package main.java.task3.exceptions;

/**
 * Created by troll on 31.07.2017.
 */
public class WrongInputNickNameException extends Exception {

    public WrongInputNickNameException(){
        super();
    }

    WrongInputNickNameException(String message){
        super(message);
    }
}
