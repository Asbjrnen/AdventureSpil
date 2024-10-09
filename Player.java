package AdventureSpil;

public class Player {
    private String name;
    //    private int health;
//    private Inventory inventory;
//    private int attackPower;
//    private int defense;
    private Room currentRoom;

    public Player(String heroName) {
        this.name = heroName;
//        this.health = 100;
//        this.inventory = new Inventory();
//        this.attackPower = 10;
//        this.defense = 3;
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
}
