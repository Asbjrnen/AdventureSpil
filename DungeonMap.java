package AdventureSpil;

public class DungeonMap {

    public Room initializeRooms() {
        Room room1 = new Room("", "This is the first of many rooms, it is damp and cold in here and apart from the light shedding through the small hatch" +
                "from which you came, there not much else. To your left you see a room going east and to your right you see a room going south. Choose wisely");
        Room room2 = new Room("", "r2");
        Room room3 = new Room("", "r3");
        Room room4 = new Room("", "r4");
        Room room5 = new Room("", "r5");
        Room room6 = new Room("", "r6");
        Room room7 = new Room("", "r7");
        Room room8 = new Room("", "r8");
        Room room9 = new Room("", "r9");

        //Rummene Skal forbindes

        room2.setWest(room1);
        room2.setEast(room3);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);

        room9.setNorth(room6);
        room9.setWest(room8);

        room1.setEast(room2);
        room1.setSouth(room4);

        return room1;

    }
}