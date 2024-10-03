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
   while(true){
    input = ui.getInput("Hello World");
    takeInput(input);

}
 }


 private void takeInput(String input) {
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

   default:
    System.out.println("Something went wrong, please try writing help for the list of commands available for use");
    break;

  }
 }
}