public class GridSpace
{
    int x, y;
    boolean friendlyShipfull = false;
    boolean enemyShipfull = false;
    
    public GridSpace(int insertX, int insertY)
    {
        x = insertX;
        y = insertY;
    }
    public void MakeFriendlyShip()
    {
        friendlyShipfull = true;
    }
    public void MakeEnemyShip()
    {
        enemyShipfull = true;
    }
    public void CheckIfFriendlyShip()
    {
        if (friendlyShipfull = true)
        {
            System.out.println("Your opponent hit!");
        }
        else
        {
            System.out.println("Your opponent missed."); 
        }
    }
    public void CheckIfEnemyShip()
    {
        if (enemyShipfull = true)
        {
            System.out.println("You hit!");
        }
        else
        {
            System.out.println("Miss."); 
        }
    }
    
}



//8 by 8 boards are made up of these.