package main.java.task5.third_question;

/**
 * Created by troll on 10.08.2017.
 */
public class Transfer {
    String from;
    String to;

    public Transfer(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
