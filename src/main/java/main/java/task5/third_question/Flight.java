package main.java.task5.third_question;

/**
 * Created by troll on 10.08.2017.
 */
public class Flight {
    String startAirport;
    String endAirport;
    boolean thereAndBack;

    public Flight(String startAirport, String endAirport, boolean thereAndBack) {
        this.startAirport = startAirport;
        this.endAirport = endAirport;
        this.thereAndBack = thereAndBack;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startAirport='" + startAirport + '\'' +
                ", endAirport='" + endAirport + '\'' +
                ", thereAndBack=" + thereAndBack +
                '}';
    }
}
