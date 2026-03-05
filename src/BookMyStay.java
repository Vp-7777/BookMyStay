import java.util.HashMap;

abstract class Room {
    String type;
    int beds;
    double price;

    Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    void display() {
        System.out.println(type + " | Beds: " + beds + " | Price: $" + price);
    }
}

class SingleRoom extends Room {
    SingleRoom() {
        super("Single Room", 1, 120);
    }
}

class DoubleRoom extends Room {
    DoubleRoom() {
        super("Double Room", 2, 200);
    }
}

class SuiteRoom extends Room {
    SuiteRoom() {
        super("Suite Room", 3, 350);
    }
}

class RoomInventory {

    private HashMap<String, Integer> inventory;

    RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 0);
    }

    int getAvailability(String type) {
        return inventory.getOrDefault(type, 0);
    }
}

class SearchService {

    private RoomInventory inventory;

    SearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    void search(Room[] rooms) {

        System.out.println("Available Rooms\n");

        for (Room room : rooms) {

            int available = inventory.getAvailability(room.type);

            if (available > 0) {
                room.display();
                System.out.println("Available: " + available);
                System.out.println();
            }
        }
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Book My Stay - Hotel Booking System v4.0\n");

        Room[] rooms = {
                new SingleRoom(),
                new DoubleRoom(),
                new SuiteRoom()
        };

        RoomInventory inventory = new RoomInventory();

        SearchService searchService = new SearchService(inventory);

        searchService.search(rooms);
    }
}