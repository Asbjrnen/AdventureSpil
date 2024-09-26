package AdventureSpil;

public class Rooms
{
    private String name;
    private String description;
    private Room north;
    private Room west;
    private Room east;
    private Room south;

    //Constructor
    public Rooms(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    //Setters*****
    public void setNorth(Room north)
    {
        this.North = north;
    }

    public void setWest(Room west)
    {
        this.West = west;
    }

    public void setEast(Room east)
    {
        this.East = east;
    }

    public void setSouth (Room south)
    {
        this.South = south;
    }

    //Getters**********

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public Room getNorth()
    {
        return north;
    }
    public Room getWest()
    {
        return west;
    }
    public Room getEast()
    {
        return east;
    }
    public Room getSouth()
    {
        return south;
    }


}
