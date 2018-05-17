package SecondAttempt;

public class Seat {
    String seatNumber;
    boolean available;
    Seat[] seatChart;


    public Seat (String seatNumber) {
        this.seatNumber = seatNumber;
        this.available = true;
    }

    public Seat (String seatNumber, boolean available) {
        this.seatNumber = seatNumber;
        this.available = available;
    }
}
