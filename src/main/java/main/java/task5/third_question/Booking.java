package main.java.task5.third_question;

/**
 * Created by troll on 10.08.2017.
 */
public class Booking {
    String hotelName;
    String date;

    public Booking(String hotelName, String date) {
        this.hotelName = hotelName;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "hotelName='" + hotelName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
