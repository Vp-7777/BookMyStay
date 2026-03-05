import java.util.HashMap;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 10);
        inventory.put("Double Room", 6);
        inventory.put("Suite Room", 3);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    public void displayInventory() {
        System.out.println("---- Current Room Inventory ----");

        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " : " + inventory.get(roomType) + " available");
        }
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Book My Stay - Hotel Booking System v3.1\n");

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        System.out.println("\nUpdating availability of Single Room...\n");

        inventory.updateAvailability("Single Room", 8);

        inventory.displayInventory();
    }
}