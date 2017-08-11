package main.java.task5.fifth_question.stocks;

/**
 * Created by troll on 11.08.2017.
 */
public class NoAtStockException extends Exception{

    NoAtStockException(){
        System.out.println("Oops! We have not such ingredient at our stock");
    }
}
