package main.java.task5.ninth_question;

/**
 * Created by troll on 12.08.2017.
 */
public interface Observed {

    void removeObserver(Observer o);
    void addObserver(Observer o);
    void notifyObservers();
}
