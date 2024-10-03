//package AdventureSpil;
//
//import java.util.Scanner;
//
//public class MainAdventure {
//
//    public static void main(String[] args) {
//
//        Scanner brugerinput = new Scanner(System.in);
//
//        AdventureSpil adventureSpil = new AdventureSpil();
//
//        DungeonMap dungeonMap = new DungeonMap();
//
//        Room currentRoom = dungeonMap.initializeRooms();
//
//        UserInterface userInterface = new UserInterface();
//
//
//        System.out.println("Welcome to the dungeon game, press a key to begin!" +
//                "Write help to get commands for the game");
//
//        boolean gamerunning = true;
//
//        while (gamerunning) {
//            String brugerInput = brugerinput.nextLine().toLowerCase();
//            currentRoom = userInterface.brugerInterface(input, currentRoom);
//
//        }
//
//
////        public Room brugerInterface(String brugerinput, Room currentRoom){
////            Room nextRoom = currentRoom;
////            nextRoom = currentRoom.getNorth();
////            nextRoom = currentRoom.getSouth();
////            nextRoom = currentRoom.getWest();
////            nextRoom = currentRoom.getEast();
//
//    }
//}
//
