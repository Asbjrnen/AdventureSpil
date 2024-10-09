package AdventureSpil;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int maxHP;
    private List<Item> inventory;
    private Room currentRoom;

    public Player(String heroName) {
        this.name = heroName;
        this.maxHP = 100;
        this.health = maxHP;
        inventory = new ArrayList<>();

    }

    public int getHealth() {
        return health;
    }

    public void diffHealth(int amount) {
        this.health += amount;
        if (this.health > maxHP) {
            this.health = maxHP;
        }
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public double getHealthPercentage() {
        return ((double) health / maxHP) * 100;
    }

    public String getName() {
        return name;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String moveToRoom(String room) {
        Room nextRoom = null;
        switch (room.toLowerCase()) {
            case "north":
                nextRoom = currentRoom.getNorth();
                break;
            case "south":
                nextRoom = currentRoom.getSouth();
                break;
            case "east":
                nextRoom = currentRoom.getEast();
                break;
            case "west":
                nextRoom = currentRoom.getWest();
                break;

            default:
                break;
        }
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return "You move " + room + " to " + currentRoom.getName() + ".";
        } else {
            return "You are as blind as a mole and accidentally walk into a wall.";
        }
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public Item removeItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public String showInventory() {
        if (inventory.isEmpty()) {
            return "Your inventory is empty.";
        } else if (inventory.size() == 1) {
            return "You are currently in posession of: " + inventory.get(0).getName();
        } else if (inventory.size() == 2) {
            return "You are currently in posession of: " + inventory.get(0).getName() + ", " + inventory.get(1).getName();
        } else {
            StringBuilder InventoryDisplay = new StringBuilder("You are currently in posession of: ");
            for (int i = 0; i < inventory.size(); i++) {
                InventoryDisplay.append(inventory.get(i).getName());
                if (i < inventory.size() - 2) {
                    InventoryDisplay.append(", ");
                }
            }
            return InventoryDisplay.toString();

        }
    }


}

