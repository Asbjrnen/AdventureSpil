package AdventureSpil;

public class Room
{
    private String name;
    private String description;
    private Room north;
    private Room west;
    private Room east;
    private Room south;

    //Constructor
    public Room(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    //Setters*****
    public void setNorth(Room north)
    {
        this.north = north;
    }

    public void setWest(Room west)
    {
        this.west = west;
    }

    public void setEast(Room east)
    {
        this.east = east;
    }

    public void setSouth (Room south)
    {
        this.south = south;
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
