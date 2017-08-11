package main.java.task5.tenth_question;

/**
 * Created by troll on 11.08.2017.
 */
public class TenthApp {

    public static void main(String[] args) {
        DVIToSVGAAdapter adapter = new DVIToSVGAAdapter(new SVGAOutput());
        adapter.connect();
    }
}
