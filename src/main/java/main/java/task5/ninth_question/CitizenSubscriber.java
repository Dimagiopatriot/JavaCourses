package main.java.task5.ninth_question;

/**
 * Created by troll on 12.08.2017.
 */
public class CitizenSubscriber extends Observer {

    CitizenSubscriber(){
        isCitizen = true;
    }

    @Override
    void handleEvent() {
        System.out.println("I`m from city. I got a newspaper!");
    }
}
