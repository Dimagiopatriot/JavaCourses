package main.java.task5.third_question;

/**
 * Created by troll on 10.08.2017.
 */
public class TourBuilder {
    Transfer transfer = new Transfer("Nan","Nan");
    Flight flight = new Flight("Nan", "Nan", false);
    Booking booking = new Booking("Nan", "dd-mm-yyyy");
    boolean insurance = false;

    TourBuilder addTransfer(Transfer transfer){
        this.transfer = transfer;
        return this;
    }

    TourBuilder addFlight(Flight flight){
        this.flight = flight;
        return this;
    }

    TourBuilder addBooking(Booking booking){
        this.booking = booking;
        return this;
    }

    TourBuilder addInsurance(boolean insurance){
        this.insurance = insurance;
        return this;
    }

    Tour createTour(){
        Tour tour = new Tour();
        tour.setTransfert(transfer);
        tour.setFlight(flight);
        tour.setBooking(booking);
        tour.setInsurance(insurance);

        return tour;
    }

}
