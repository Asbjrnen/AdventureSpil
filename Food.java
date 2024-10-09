package AdventureSpil;

public class Food extends Item {
    private int healthpoints;

    public Food(String name, String description, int healthpoints) {
        super(name, description);
        this.healthpoints = healthpoints;
    }

    public int getHealthpoints() {
        return healthpoints;
    }
}
