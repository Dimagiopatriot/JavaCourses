package main.java.task5.sixth_question;

import java.util.Objects;

/**
 * Created by troll on 12.08.2017.
 */
public class Secretary {
    Worker worker;

    public void acceptWorker(Worker worker) {
        this.worker = worker;
    }

    void sendWorker() {
        Objects.requireNonNull(worker.getQuestion(), "Question is null");
        switch (worker.getQuestion()) {
            case GET_SALARY:
                System.out.println("Go to the accountant");
                break;
            case NEED_PROMOTION:
                System.out.println("Go to the director");
                break;
            case NEED_WORK_ADVICE:
                System.out.println("Go to the manager-curator");
                break;
            case NEED_NEW_KEYBOARD:
                System.out.println("Go to the stock");
                break;
            default:
                System.out.println("Can`t help you");
        }
    }
}
