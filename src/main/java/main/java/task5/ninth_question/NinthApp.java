package main.java.task5.ninth_question;

/**
 * Created by troll on 12.08.2017.
 */
public class NinthApp {

    public static void main(String[] args) {
        PrintHouse printHouse = new PrintHouse();

        printHouse.addObserver(new CitizenSubscriber());
        printHouse.addObserver(new VillageSubscriber());
        printHouse.addObserver(new CitizenSubscriber());

        printHouse.notifyObservers();
    }
}
