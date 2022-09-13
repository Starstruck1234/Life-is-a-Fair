import java.util.Scanner;

public class BattleshipGame
{
    //declare boards.
    Board friendlyBoard;
    Board enemyBoard;
    
    
    
    public BattleshipGame()
    {
        friendlyBoard = new Board();
        enemyBoard = new Board();
        //creates two board objects that each have a gridarray inside of them.
        
    }
    public void FriendlySpaceCheck(int inputX, int inputY)
    {
        //translate to i
        int i = (inputX - 1)*8 + (inputY - 1);
        //Ex: input 1, 8. I get i = 16.
        //Ex: input 1, 1. I get i = 0.
        
        //User error control needed.
        
        
        //call the "i" GridSpace and then call the CheckIfShip method.
        friendlyBoard.getGrid()[i].CheckIfFriendlyShip();
        //this takes friendlyBoard object, gets the Grid inside, takes the "i'th" GridSpace, and does method. 
        
        // ^ This checks if there's a ship, and prints hit or miss.
        
        
    }
    public void PlaceShipObject(int inputX, int inputY)
    {
        //instance variables.    Also some up here ^
        String direct;
        boolean t = true;
        int InX = inputX;
        int InY = inputY;
        
        
        //Declaration used to call "error codes".
        ErrorMessages error = new ErrorMessages();
        
        if (inputX > 8 || inputX < 1 || inputY > 8 || inputY < 1)
        {
            //translate input to i.
            int inputI = inputX*8 + inputY - 1;
            //double check
            
            //ask direction.
            System.out.println("Type 'leave' at any time to go back a step.");
            Scanner direction = new Scanner("Should it face up, down, left, or right?");
            direct = direction.nextLine();
            direct = direct.toLowerCase();
            while (t = true)
            {
                t = false;
                //instance variables. Important to make the '3' here a variable.
                
                
                int shipsize = 3;
                int upcheck = inputI - (8 * shipsize);
                int UseInputI = inputI;
                // ^ probably bad way to do this, but c'est la vie.
                
                //STILL NEED TO BLOCK ERRORS FOR:
                //Placing a ship onto an existing one.
                //left, right and down versions of upcheck.
                
                
                
                //declarations made to use code/variables from other areas.
                Ship ship1 = new Ship(shipsize);
                
                
                if (direct == "up")
                {
                    if ((shipsize*8+UseInputI) > 5)
                    {
                        //Returns to start.
                        error.offboard();
                        t = true;
                    }
                    else
                    for (int i = 0; i < shipsize; i++)
                    {
                        friendlyBoard.getGrid()[UseInputI].MakeFriendlyShip();
                        UseInputI = UseInputI + 8;
                        //MakeShip makes the chosen GridSpace a ship part.
                        //Triggers a # of times depending on shipsize.
    
    
                    }
                }
                else if (direct == "down")
                {
                    //MAKE downcheck and half-copy up.
                }
                else if (direct == "left")
                {
                    //MAKE leftcheck and half-copy up.
                }
                else if (direct == "right")
                {
                    //MAKE rightcheck and half-copy up.
                }
                else if (direct == "leave")
                {
                    //MAKE THIS go back to choosing a grid spot to MakeShip.
                }
                else
                {
                    //MAKE THIS only repeat the direction choice.
                    System.out.println("The vendor doesn't understand you. Try again.");
                    t = true;
                }
            }         
        }
        else
        {
            error.wrongnumb();
        }
    }
}


//choose on a 8*8 grid where to put your ships (and in which direction)
//opponent and you take turns guessing where your opponent's ships are


//might be too difficult

//object oriented
//create 64 objects that each have an identity of x and y value, and names


//Progress:
//I have made a grid of grid spaces, each with an identity of i, from 0 to 63.
//I am able to make each of these grids "shipfull" or not.
//I am able to check if a grid space is shipfull or not, and print hit or miss. 

//What I need to do:
//Be able to make multiple ships without them on top of each other.
//Be able to make enemy ships without them interfering with your ships.
//MAKE opponent AI able to randomly guess your squares.
//MAKE an option to check the rules of the game before playing it.
//MAKE a menu from which either the game or rules can be started.
//^ (Needs a class that can run the entirety of above code)