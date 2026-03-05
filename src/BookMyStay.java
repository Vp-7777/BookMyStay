import java.util.LinkedList;
import java.util.Queue;

class Reservation {

    String guestName;
    String roomType;

    Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    void display() {
        System.out.println("Guest: " + guestName + " | Requested Room: " + roomType);
    }
}

class BookingQueue {

    private Queue<Reservation> queue;

    BookingQueue() {
        queue = new LinkedList<>();
    }

    void addRequest(Reservation r) {
        queue.add(r);
    }

    void showRequests() {
        System.out.println("\nBooking Requests in Queue (FIFO Order)\n");

        for (Reservation r : queue) {
            r.display();
        }
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Book My Stay - Hotel Booking System v5.0\n");

        BookingQueue bookingQueue = new BookingQueue();

        bookingQueue.addRequest(new Reservation("Vishal", "Single Room"));
        bookingQueue.addRequest(new Reservation("Rahul", "Double Room"));
        bookingQueue.addRequest(new Reservation("Anita", "Suite Room"));

        bookingQueue.showRequests();
    }
}