package AdventureSpil;


public class AdventureSpil {
    private Player player;
    private Room initialRoom;
    private UserInterface ui;


    public AdventureSpil() {
        DungeonMap dungeonMapGen = new DungeonMap();

        player = new Player("Jack");
        ui = new UserInterface();
        initialRoom = dungeonMapGen.initializeRooms();
        player.setCurrentRoom(initialRoom);
    }

    public void startGame() {
        ui.displayMessage(String.format("Welcome to the game full of adventure - DUNGEON RUN %s", player.getName()));
        String input;
        while (true) {
            input = ui.getInput("Your character is ready to take commands");
            takeInput(input);

        }
    }


    public void takeInput(String input) {
        switch (input) {
            case "north":
            case "south":
            case "west":
            case "east":
                ui.displayMessage(player.moveToRoom(input));
                break;

            case "help":
                System.out.println("These are the commands you can use: Go North, Go South, Go West, Go East, Help, Look and Exit");
                break;

            case "exit":
                System.out.println("You are exiting the game");
                break;

            case "look":
                ui.displayMessage(player.getCurrentRoom().getDescription());
                break;

            case "inventory":
                ui.displayMessage(player.showInventory());
                break;

            case "take":
                if (input.startsWith("take ")) {
                    String itemName = input.substring(5);

                    Item item = initialRoom.findItemPartialName(itemName);
                    if (item == null) {
                        ui.displayMessage(String.format("Item %s not found", itemName));
                    } else player.addItem(item);
                    initialRoom.removeItem(item.getName());
                    ui.displayMessage(String.format("Item %s has been taken", itemName));
                }
                break;


            case "Drop":
                if (input.startsWith("Drop ")) {
                    String itemName = input.substring(5);
                    Item item = player.removeItem(itemName);

                    if (item == null) {
                        ui.displayMessage(String.format("Item %s not found:", itemName));
                    } else {
                        initialRoom.addItem(item);
                        ui.displayMessage(String.format("Item %s has been dropped", itemName));
                    }
                }
                break;

            case "Health":
                double healthPercentage = player.getHealthPercentage();
                String healthDesc;

                if(healthPercentage > 75) {
                    healthDesc = "Your body is aching a little but you're still fit for a fight";
                }
                else if(healthPercentage > 50) {
                    healthDesc = "Your vitals are still good, but you might want to be a little more careful when you fight";
                }
                else if (healthPercentage > 25) {
                    healthDesc = "You feel tired and you're hurting all over and you suspect you might have broken something, you're eager for a boost to your vitals";
                }
                else {
                    healthDesc = "Your body is in serious danger, if you do not find immediate shelter or help you might bleed out to death!";
                }
                ui.displayMessage("Health: " + player.getHealthPercentage() + " (" + healthDesc + "%) " + "\n" + healthDesc);
                break;

            case "eat":
                if (input.startsWith("eat ")) {
                    String foodName = input.substring(5);
                    Item item = player.removeItem(foodName);
                    if (item == null) {
                        item = initialRoom.findItemPartialName(foodName);
                    }
                    if (item == null) {
                        ui.displayMessage(String.format("Item %s not found", foodName));
                    }
                    if (!(item instanceof Food)) {
                        ui.displayMessage(String.format("Item %s is not a food", foodName));
                    }
                    else{
                        Food food = (Food) item;
                        int healthIncrease = food.getHealthpoints();
                        player.diffHealth(healthIncrease);
                        if (healthIncrease > 0) {
                            ui.displayMessage(String.format("You have been eaten %d", healthIncrease));
                        }
                        else {
                            ui.displayMessage(String.format("You have been eaten %d", Math.abs(healthIncrease)));
                        }
                    }

                }
                break;


            default:
                System.out.println("Something went wrong, please try writing help for the list of commands available for use");
                break;

        }

    }
}