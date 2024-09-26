package AdventureSpil;

public class AdventureSpil
{
    private Room currentRoom;

    //Constructor*** (Det første rum, man spawner i).
    public AdventureSpil()
    {
        Room room1 = new Room("This is the first of many rooms, it is damp and cold in here and apart from the light shedding through the small hatch" +
                "from which you came, there not much else. To your left you see a room going east and to your right you see a room going south. Choose wisely");
        currentRoom = room1;
    }

    //METHODS***** (Vil fortælle brugeren hvilket rum de er i og hvad udseendet er rummet er og hvad de kan se/interagere med)
    public void lookAround()
    {
        System.out.println("You are looking around in " + currentRoom.getName());
        System.out.println(currentRoom.getDescription);
    }
}
