package main.java.task5.third_question;

/**
 * Created by troll on 10.08.2017.
 */
public class Tour {

    Transfer transfer;
    Flight flight;
    Booking booking;
    boolean insurance;

    public void setTransfert(Transfer transfer) {
        this.transfer = transfer;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "transfert=" + transfer +
                ", flight=" + flight +
                ", booking=" + booking +
                ", insurance=" + insurance +
                '}';
    }
}
