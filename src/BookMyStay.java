abstract class Room {
    protected String type;
    protected int beds;
    protected int size;
    protected double price;

    public Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price per night: " + price);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 200, 1500);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 350, 2500);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 500, 5000);
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 10;
        int doubleAvailability = 6;
        int suiteAvailability = 3;

        System.out.println("---- Available Rooms ----\n");

        single.displayDetails();
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        suite.displayDetails();
        System.out.println("Available: " + suiteAvailability);
    }
}