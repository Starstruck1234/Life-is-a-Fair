public class ErrorMessages
{
    boolean error = true;
    
    public void offboard()
    {
        System.out.println("The ship would go off the board. Try again.");
    }
    public void wrongnumb()
    {
        System.out.println("Try again.");
    }
    public boolean wrong()
    {
        System.out.println("Try again.");
        return error;
    }
}

//May put all user error response messages here for easy access.