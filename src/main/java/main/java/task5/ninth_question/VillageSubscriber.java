package main.java.task5.ninth_question;

/**
 * Created by troll on 12.08.2017.
 */
public class VillageSubscriber extends Observer {

    VillageSubscriber(){
        isCitizen = false;
    }

    @Override
    void handleEvent() {
        System.out.println("I`m from village. I got a newspaper!");
    }
}
