import java.util.Random;

public class Board
{	
	private int size_x = 0;
	private int size_y = 0;

	private int[][] board;
	private int[][] buffor;

	public Board(int size_1, int size_2, int preset)
	{
		size_x = size_1;
		size_y = size_2;
		board = new int[size_x + 2][size_y +2];
		buffor = new int[size_x + 2][size_y +2];

		this.initialize(preset);	
	}
	public Board(int size_1, int size_2)
	{
		this(size_1, size_2, 0);
	}

	public void initialize(int preset)
	{	
		for (int i = 0; i < size_x+2 ; i++ ) {
			for (int j = 0; j < size_y+2  ; j++ ) {
				board[i][j] = 0;
			}
		}
		int[][] figure = new int[3][3];
		switch (preset)
		{	
			
			case 0:
			{
				for (int i = 1; i < size_x+1  ; i++ ) {
					for (int j = 1; j < size_y+1  ; j++ ) 
					{
						if(Math.random() > 0.8)
							board[i][j] =  1;
					}
				}
			return;
			}
			case 1:
			{
				figure[0][0] = 1;
				figure[0][1] = 1;
				figure[1][2] = 1;
				figure[1][0] = 1;
				figure[2][1] = 1;
			}break;
			case 2:
			{
				figure[0][1] = 1;
				figure[1][1] = 1;
				figure[2][1] = 1;
			
			}break;
			case 3:
			{
				figure[0][0] = 1;
				figure[0][1] = 1;
				figure[1][0] = 1;
				figure[0][2] = 1;
				figure[2][1] = 1;

			
			}break;
			default: return;
		}

		for (int i = 1; i < size_x+1 ; i++ ) {
			for (int j = 1; j < size_y+1  ; j++ ) {
				board[i][j] = 0;
			}
		}
		int middle_x = 1 + size_x/2;
		int middle_y = 1 + size_y/2;
		for (int u = -1; u < 2 ; u++) {
			for (int v = -1; v < 2 ; v++) {
				board[middle_x+u][middle_y+v] = figure[u+1][v+1];
			}
		}

	}

	public void update()
	{	

		for (int i = 1; i < size_x+1  ; i++ ) {
			for (int j = 1; j < size_y+1  ; j++ ) 
			{
				if(isOverpopulated(i,j) || isUnderpopulated(i,j))
					buffor[i][j] =  0;
				else if(numberOfNeighbours(i,j) == 3)
					buffor[i][j] =  1;
				else buffor[i][j] = board[i][j];
			}
		}

	for (int i = 1; i < size_x+1 ; i++ ) {
		for (int j = 1; j < size_y+1  ; j++ ) {
				board[i][j] = buffor[i][j];
			}
		}
	}	

	private boolean isOverpopulated(int x, int y)
	{
		return numberOfNeighbours(x,y) > 3;
	}
	private boolean isUnderpopulated(int x, int y)
	{
		return numberOfNeighbours(x,y) < 2;
	}

	private int numberOfNeighbours(int x, int y)
	{
		int n = 0;

		for (int i = -1; i < 2 ; i++ ) {
			for (int j = -1; j < 2 ; j++ ) {
				if ( !(i == 0 && j == 0) && board[x+i][y+j] == 1) n++;
			}
		}
		return n;
	}

	public void print()
	{	

		for (int i = 1; i < size_x+1  ; i++ ) {
			
			for (int j = 1; j < size_y+1  ; j++ ) 
			{   
                if(board[i][j] == 1)
				    System.out.print('X');
                else 
                    System.out.print('.');
			}
			System.out.println();
		}
	}

	
}
