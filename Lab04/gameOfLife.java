public class gameOfLife
{	
	private Board board;
    private int game_window_width;

	public gameOfLife(int size_1, int size_2, int preset)
	{
		board = new Board(size_1,size_2,preset);
        game_window_width = size_2;
	}

	public gameOfLife(int size_1, int size_2)
	{
		this(size_1,size_2,0);
	}


	public void start(int numberOfSteps)
	{	


        for(int u = 0; u<game_window_width/2; u++)
            {
               System.out.print("-");
            }
			System.out.print("0");
            for(int u = 0; u<game_window_width/2; u++)
            {
               System.out.print("-");
            }
        System.out.println();
		printResult();
		System.out.println();
		System.out.println();
		for (int i = 1; i <= numberOfSteps ; i++ ) 
		{	
			board.update();

            
            for(int u = 0; u<game_window_width/2; u++)
            {
               System.out.print("-");
            }
			System.out.print(i);
            for(int u = 0; u<game_window_width/2; u++)
            {
               System.out.print("-");
            }
            System.out.println();
			printResult();
			System.out.println();
			System.out.println();
		}
	}

	public void printResult()
	{
		board.print();
	}
}
