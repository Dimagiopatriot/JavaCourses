package main.java.task5.sixth_question;

/**
 * Created by troll on 12.08.2017.
 */
public class SixthApp {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setQuestion(Question.NEED_NEW_KEYBOARD);

        Secretary secretary = new Secretary();
        secretary.acceptWorker(worker);
        secretary.sendWorker();

    }
}
