import java.util.Scanner;

public class GameAisle
{
    private int points = 0;
    private String choice;
    private boolean power = true;
    
    public GameAisle()
    {
        System.out.println ("You see:");
        System.out.println ("a Game Cabinet," );
        System.out.println ("a target game,");
        System.out.println ("Battleship,");
        System.out.println ("a suspicious-looking pig,");
        System.out.println ("a strength game,");
        System.out.println ("and a strange shop.");
        
        Scanner where = new Scanner("Choose where to go!");
        choice = where.nextLine();
        choice = choice.toLowerCase();
        while (power == true)
        {
            if (choice == ("shop"))
            {
                
            }
            else if (choice == ("battleship"))
            {
                
            }
            else if (choice == ("target") || choice == ("target game"))
            {
                
            }
            else if (choice == "game cabinet" || choice == "cabinet")
            {
            
            }
            else if (choice == "suspicious-looking pig" || choice == "pig")
            {
                Pig pig = new Pig();
            }
            else if (choice == "game cabinet" || choice == "cabinet" || choice == "arcade")
            {
                
            }
            else if (choice == "shop" || choice == "strange shop")
            {
                
            }
            else if (choice == "strength game" || choice == "strength" || choice == "high striker")
            {
                
            }
            else
            {
                System.out.println("That doesn't seem to be an option. Try again.");
            }
        }
    }
}
    
    //Games: ([], [ArcadeCabinet], [Hit the target], [Battleship], [Pig]