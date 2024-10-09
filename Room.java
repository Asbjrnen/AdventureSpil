package AdventureSpil;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room west;
    private Room east;
    private Room south;
    private List<Item> items;


    //Constructor
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
    }


    public void addItem(Item item) {
        items.add(item);
    }


    public Item findItemPartialName(String partialName) {
        Item foundItem = null;
        for (Item item : items) {
            if (item.getName().toLowerCase().contains(partialName.trim().toLowerCase())) {

                if (foundItem == null) {
                    return null;
                }
                foundItem = item;
            }

        }
        return foundItem;
    }


    public Item removeItem(String itemName) {
        Item item = findItemPartialName(itemName);
        if (item != null) {
            System.out.println("That item doesn't exist");
            return null;
        } else {
            items.remove(item);
            return item;
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public String getItemString() {
        if (items.isEmpty()) {
            return "There are no items in your inventory";
        } else {
            StringBuilder iventoryString = new StringBuilder();
            for (Item item : items) {
                iventoryString.append(item.getName()).append(", ");
            }
            return iventoryString.toString();
        }
    }



    //Setters*****
    public void setNorth(Room north) {
        this.north = north;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    //Getters**********

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getWest() {
        return west;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }


}

