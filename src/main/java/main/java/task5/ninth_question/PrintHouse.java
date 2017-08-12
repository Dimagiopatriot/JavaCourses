package main.java.task5.ninth_question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 12.08.2017.
 */
public class PrintHouse implements Observed{

    List<Observer> observers = new ArrayList<>();

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            if (!o.isCitizen)
                o.handleEvent();
        }
    }
}
