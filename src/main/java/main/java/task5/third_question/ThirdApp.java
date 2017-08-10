package main.java.task5.third_question;

/**
 * Created by troll on 10.08.2017.
 */
public class ThirdApp {
    public static void main(String[] args) {
        Tour tour = new TourBuilder()
                .addBooking(new Booking("Ukraina","20-10-2017"))
                .addFlight(new Flight("Lviv","Boryspil", false))
                .addTransfer(new Transfer("Boryspil", "Kyiv, Khreshchyatyk"))
                .addInsurance(true)
                .createTour();
        System.out.print(tour);
    }
}
