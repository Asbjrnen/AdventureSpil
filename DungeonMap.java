package AdventureSpil;

public class DungeonMap {

    public Room initializeRooms() {
        Room room1 = new Room("Dark Cave", "You are in a dark cave, the air is damp.");
        Room room2 = new Room("Sunny Meadow", "You are in a sunny meadow filled with flowers.");
        Room room3 = new Room("Spooky Forest", "You are in a spooky forest, shadows loom around you.");
        Room room4 = new Room("Ancient Temple", "You are in an ancient temple, it's quiet and eerie.");
        Room room5 = new Room("Abandoned Mine", "You are in an abandoned mine, echoes of the past linger.");
        Room room6 = new Room("Frozen Tundra", "You are in a frozen tundra, the cold bites at your skin.");
        Room room7 = new Room("Mystic Lake", "You are at a mystic lake, the water sparkles.");
        Room room8 = new Room("Haunted Mansion", "You are in a haunted mansion, whispers fill the air.");
        Room room9 = new Room("Desert Oasis", "You are at a desert oasis, a refreshing sight.");

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



        //Items der ligger i de forskellige rum
        room1.addItem(new Item("Sword","A blade with a Rusty handle from the blood seeping into it, seems good, but the durability can't be high."));
        room1.addItem(new Item("Big Axe","This clearly belonged to a giant or so it would seem, the handle has broken in half, making it so you can actually swing it"));
        room1.addItem(new Item("Poor bow","A desperate attempt at a long ranged weapon, it will not win you competetions, but it will give you a better chance of survival down here"));
        room2.addItem(new Item("Buckler","A flat piece of iron in poor condition, it will be at least useful for defence against either long range or melee attacks"));
        room2.addItem(new Item("Throwing Knives","In a leather pouch there are small knives tucked away, albeit small, they seem deadly sharp."));

        //Food i de forskellige rum
        room2.addItem(new Food("Citrus", "A yellow green fruit, reminding you of lemonade, might make a good refreshment if you drink it", +10));
        room3.addItem(new Food("Rat", "Looking at it, it is a dead rat, god knows how long it as been here, but it is survival of the fittest", +20));
        room1.addItem(new Food("Pork Chop" , "This seemingly dropped from your torn backpack when you landed down here in the first place, might come in handy later!", +50));





        return room1;
    }

}