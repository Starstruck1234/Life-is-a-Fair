class Board
{
    GridSpace[] gridarray; 
    
    public Board()
    {
        //variables (x and y indicate position on board, and i indicates id).
        int x = 0;
        int y = 0;
        int i = 0;
        
        
        //creates 64 GridSpaces, each can be called with id (i).
        //each grid space has x and y values ranging from 1 to 8.
        gridarray = new GridSpace[64];
        
        for (x=1;x<=8;x++)
        {
            for (y=1;y<=8;y++)
            {
                gridarray[i] = new GridSpace(x,y);
                i++;
                //i is the identity of each grid space.
                //format for 'for' statement is strange, but the x++ or y++ happens after a run.
            }
        }
        //first GridSpace created is 1, 1 (i = 0)
        //second is 1, 2 (i = 1)
        //eighth is 1, 8 (i = 7)
        // ninth is 2, 1 (i = 8)
        //sixteenth is 2, 8 (i = 15)
        //seventeenth is 3, 1 (i = 16)
        //...  and so on.
        
        
        //Imagine each grid looks like this!
        //     1  2  3  4  5  6  7  8
        //     _  _  _  _  _  _  _  _
        // 8 | 
        // 7 |
        // 6 |
        // 5 |
        // 4 |
        // 3 |
        // 2 |
        // 1 |
        
        //    ^
        //    |
        //    1,1 is in this corner!
        
        
    }
    public GridSpace[] getGrid()
    { return gridarray; }
}