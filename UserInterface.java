package AdventureSpil;

import java.util.Scanner;

public class UserInterface
{

    boolean gamerunning = true;

    //Loop der kører i baggrunden hele tiden, så spilleren kan interagere med 'help' commanden og exitte når de vil) //LAV PILE
    while (gamerunning)
    {
        Scanner brugerinput = new Scanner(System.in);
        switch (brugerinput.nextLine().toLowerCase())
        {
            case "go north";
                System.out.println("Your character is going north");
                break;

            case "go south";
                System.out.println("Your character is south");
                break;

            case "go west";
                System.out.println("Your character is going west");
                break;

            case "go east";
                System.out.println("Your character is going east");
                break;

            case "help";
                System.out.println("These are the commands you can use: Go North, Go South, Go West, Go East, Help and Exit");
                break;

            case "exit":
                break;

            default:
                System.out.println("Something went wrong, please try writing help for the list of commands available for use");
                break;
        }


    }
}
