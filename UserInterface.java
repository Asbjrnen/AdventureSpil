package AdventureSpil;

import java.util.Scanner;


public class UserInterface
{
    private Scanner scanner;

    public UserInterface(){
        scanner = new Scanner(System.in);
    }

    public void displayMessage(String message){
        System.out.println(message);
    }

    public String getInput(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

    public void close(){
        scanner.close();
    }
}













//    //METHODS***** (Vil fortælle brugeren hvilket rum de er i og hvad udseendet er rummet er og hvad de kan se/interagere med)
//    public void lookAround(Room currentRoom)
//    {
//        System.out.println("You are looking around in " + currentRoom.getName());
//        System.out.println(currentRoom.getDescription());
//    }
//
//    public void goNorth ()
//    {
//        if (currentRoom.getNorth() != null) {
//            currentRoom = currentRoom.getNorth();
//        } else {
//            System.out.println("You cannot go that way.");
//
//    Scanner scan = new Scanner(System.in);
//
//    String input = scan.nextLine().toLowerCase();
//        switch (input) {
//            case "go north":
//            System.out.println("Your character is going north");
//            break;
//
//            case "go south":
//            System.out.println("Your character is south");
//            break;
//
//            case "go west":
//            System.out.println("Your character is going west");
//            break;
//
//            case "go east":
//            System.out.println("Your character is going east");
//            break;
//
//            case "help":
//            System.out.println("These are the commands you can use: Go North, Go South, Go West, Go East, Help, Look and Exit");
//            break;
//
//            case "exit":
//            System.out.println("You are exiting the game");
//            break;
//
//            case "look":
//            System.out.println("You are now looking around");
//                System.out.println(currentRoom.getDescription());
//            break;
//
//            default:
//                System.out.println("Something went wrong, please try writing help for the list of commands available for use");
//                break;
//
//        }
//        if (nextRoom == null) {
//            System.out.println("There is no door only a brick wall");
//            return currentRoom;
//        }
//        return nextRoom;
//    }
//    }

