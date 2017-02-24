
public class GameBoard 
{
	private char[][] theBoard;
	
	public GameBoard()
	{
		this.theBoard = new char[6][7];
		this.clearBoard();
	}
	
	public boolean makeMove(char moveChar, int col)
	{
	    int index=0;
		for(int i=0;i<this.theBoard.length;i++)
		{
			if(this.theBoard[i][col] == '_')
			{
				index++;
			}	
		}
		if(index==0)
		{
			return false;	
		}
		else if((this.theBoard[index-1][col] == '_') )
		{
			this.theBoard[index-1][col] = moveChar;
			return true;
		}
		
		return false;
	}
	
	private void clearBoard()
	{
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				this.theBoard[i][j] = '_';
			}
		}
	}
	
	public boolean hasWinner()
	{

		boolean col11WinnerA = this.theBoard[0][0] == 'X' && 
				this.theBoard[1][0] == 'X' && 
				this.theBoard[2][0] == 'X' &&
				this.theBoard[3][0] == 'X' ;
			
				
		boolean col12WinnerA = this.theBoard[1][0] == 'X' && 
				this.theBoard[2][0] == 'X' &&
				this.theBoard[3][0] == 'X' &&
				this.theBoard[4][0] == 'X';
				
		boolean col13WinnerA =  this.theBoard[2][0] == 'X' &&
				this.theBoard[3][0] == 'X' &&
				this.theBoard[4][0] == 'X' &&
				this.theBoard[5][0] == 'X' ;
				
		boolean col21WinnerA = this.theBoard[0][1] == 'X' && 
				this.theBoard[1][1] == 'X' && 
				this.theBoard[2][1] == 'X' &&
				this.theBoard[3][1] == 'X' ;
			
				
		boolean col22WinnerA = this.theBoard[1][1] == 'X' && 
				this.theBoard[2][1] == 'X' &&
				this.theBoard[3][1] == 'X' &&
				this.theBoard[4][1] == 'X';
				
		boolean col23WinnerA =  this.theBoard[2][1] == 'X' &&
				this.theBoard[3][1] == 'X' &&
				this.theBoard[4][1] == 'X' &&
				this.theBoard[5][1] == 'X' ;
				
		boolean col31WinnerA = this.theBoard[0][2] == 'X' && 
				this.theBoard[1][2] == 'X' && 
				this.theBoard[2][2] == 'X' &&
				this.theBoard[3][2] == 'X' ;
			
				
		boolean col32WinnerA = this.theBoard[1][2] == 'X' && 
				this.theBoard[2][2] == 'X' &&
				this.theBoard[3][2] == 'X' &&
				this.theBoard[4][2] == 'X';
				
		boolean col33WinnerA =  this.theBoard[2][2] == 'X' &&
				this.theBoard[3][2] == 'X' &&
				this.theBoard[4][2] == 'X' &&
				this.theBoard[5][2] == 'X' ;
				
		boolean col41WinnerA = this.theBoard[0][3] == 'X' && 
				this.theBoard[1][3] == 'X' && 
				this.theBoard[2][3] == 'X' &&
				this.theBoard[3][3] == 'X' ;
			
				
		boolean col42WinnerA = this.theBoard[1][3] == 'X' && 
				this.theBoard[2][3] == 'X' &&
				this.theBoard[3][3] == 'X' &&
				this.theBoard[4][3] == 'X';
				
		boolean col43WinnerA =  this.theBoard[2][3] == 'X' &&
				this.theBoard[3][3] == 'X' &&
				this.theBoard[4][3] == 'X' &&
				this.theBoard[5][3] == 'X' ;
				
		boolean col51WinnerA = this.theBoard[0][4] == 'X' && 
				this.theBoard[1][4] == 'X' && 
				this.theBoard[2][4] == 'X' &&
				this.theBoard[3][4] == 'X' ;
			
				
		boolean col52WinnerA = this.theBoard[1][4] == 'X' && 
				this.theBoard[2][4] == 'X' &&
				this.theBoard[3][4] == 'X' &&
				this.theBoard[4][4] == 'X';
				
		boolean col53WinnerA =  this.theBoard[2][4] == 'X' &&
				this.theBoard[3][4] == 'X' &&
				this.theBoard[4][4] == 'X' &&
				this.theBoard[5][4] == 'X' ;
				
		boolean col61WinnerA = this.theBoard[0][5] == 'X' && 
				this.theBoard[1][5] == 'X' && 
				this.theBoard[2][5] == 'X' &&
				this.theBoard[3][5] == 'X' ;
			
				
		boolean col62WinnerA = this.theBoard[1][5] == 'X' && 
				this.theBoard[2][5] == 'X' &&
				this.theBoard[3][5] == 'X' &&
				this.theBoard[4][5] == 'X';
				
		boolean col63WinnerA =  this.theBoard[2][5] == 'X' &&
				this.theBoard[3][5] == 'X' &&
				this.theBoard[4][5] == 'X' &&
				this.theBoard[5][5] == 'X' ;
				
		boolean col71WinnerA = this.theBoard[0][6] == 'X' && 
				this.theBoard[1][6] == 'X' && 
				this.theBoard[2][6] == 'X' &&
				this.theBoard[3][6] == 'X' ;
			
				
		boolean col72WinnerA = this.theBoard[1][6] == 'X' && 
				this.theBoard[2][6] == 'X' &&
				this.theBoard[3][6] == 'X' &&
				this.theBoard[4][6] == 'X';
				
		boolean col73WinnerA =  this.theBoard[2][6] == 'X' &&
				this.theBoard[3][6] == 'X' &&
				this.theBoard[4][6] == 'X' &&
				this.theBoard[5][6] == 'X' ;
				
				
				
		boolean col11WinnerB = this.theBoard[0][0] == 'O' && 
				this.theBoard[1][0] == 'O' && 
				this.theBoard[2][0] == 'O' &&
				this.theBoard[3][0] == 'O' ;
			
				
		boolean col12WinnerB = this.theBoard[1][0] == 'O' && 
				this.theBoard[2][0] == 'O' &&
				this.theBoard[3][0] == 'O' &&
				this.theBoard[4][0] == 'O';
				
		boolean col13WinnerB =  this.theBoard[2][0] == 'O' &&
				this.theBoard[3][0] == 'O' &&
				this.theBoard[4][0] == 'O' &&
				this.theBoard[5][0] == 'O' ;
				
		boolean col21WinnerB = this.theBoard[0][1] == 'O' && 
				this.theBoard[1][1] == 'O' && 
				this.theBoard[2][1] == 'O' &&
				this.theBoard[3][1] == 'O' ;
			
				
		boolean col22WinnerB = this.theBoard[1][1] == 'O' && 
				this.theBoard[2][1] == 'O' &&
				this.theBoard[3][1] == 'O' &&
				this.theBoard[4][1] == 'O';
				
		boolean col23WinnerB =  this.theBoard[2][1] == 'O' &&
				this.theBoard[3][1] == 'O' &&
				this.theBoard[4][1] == 'O' &&
				this.theBoard[5][1] == 'O' ;
				
		boolean col31WinnerB = this.theBoard[0][2] == 'O' && 
				this.theBoard[1][2] == 'O' && 
				this.theBoard[2][2] == 'O' &&
				this.theBoard[3][2] == 'O' ;
			
				
		boolean col32WinnerB = this.theBoard[1][2] == 'O' && 
				this.theBoard[2][2] == 'O' &&
				this.theBoard[3][2] == 'O' &&
				this.theBoard[4][2] == 'O';
				
		boolean col33WinnerB =  this.theBoard[2][2] == 'O' &&
				this.theBoard[3][2] == 'O' &&
				this.theBoard[4][2] == 'O' &&
				this.theBoard[5][2] == 'O' ;
				
		boolean col41WinnerB = this.theBoard[0][3] == 'O' && 
				this.theBoard[1][3] == 'O' && 
				this.theBoard[2][3] == 'O' &&
				this.theBoard[3][3] == 'O' ;
			
				
		boolean col42WinnerB = this.theBoard[1][3] == 'O' && 
				this.theBoard[2][3] == 'O' &&
				this.theBoard[3][3] == 'O' &&
				this.theBoard[4][3] == 'O';
				
		boolean col43WinnerB =  this.theBoard[2][3] == 'O' &&
				this.theBoard[3][3] == 'O' &&
				this.theBoard[4][3] == 'O' &&
				this.theBoard[5][3] == 'O' ;
				
		boolean col51WinnerB = this.theBoard[0][4] == 'O' && 
				this.theBoard[1][4] == 'O' && 
				this.theBoard[2][4] == 'O' &&
				this.theBoard[3][4] == 'O' ;
			
				
		boolean col52WinnerB = this.theBoard[1][4] == 'O' && 
				this.theBoard[2][4] == 'O' &&
				this.theBoard[3][4] == 'O' &&
				this.theBoard[4][4] == 'O';
				
		boolean col53WinnerB =  this.theBoard[2][4] == 'O' &&
				this.theBoard[3][4] == 'O' &&
				this.theBoard[4][4] == 'O' &&
				this.theBoard[5][4] == 'O' ;
				
		boolean col61WinnerB = this.theBoard[0][5] == 'O' && 
				this.theBoard[1][5] == 'O' && 
				this.theBoard[2][5] == 'O' &&
				this.theBoard[3][5] == 'O' ;
			
				
		boolean col62WinnerB = this.theBoard[1][5] == 'O' && 
				this.theBoard[2][5] == 'O' &&
				this.theBoard[3][5] == 'O' &&
				this.theBoard[4][5] == 'O';
				
		boolean col63WinnerB =  this.theBoard[2][5] == 'O' &&
				this.theBoard[3][5] == 'O' &&
				this.theBoard[4][5] == 'O' &&
				this.theBoard[5][5] == 'O' ;
				
		boolean col71WinnerB = this.theBoard[0][6] == 'O' && 
				this.theBoard[1][6] == 'O' && 
				this.theBoard[2][6] == 'O' &&
				this.theBoard[3][6] == 'O';
			
				
		boolean col72WinnerB = this.theBoard[1][6] == 'O' && 
				this.theBoard[2][6] == 'O' &&
				this.theBoard[3][6] == 'O' &&
				this.theBoard[4][6] == 'O';
				
		boolean col73WinnerB =  this.theBoard[2][6] == 'O' &&
				this.theBoard[3][6] == 'O' &&
				this.theBoard[4][6] == 'O' &&
				this.theBoard[5][6] == 'O' ;		
		

		
		return  col11WinnerA || col11WinnerB ||
				col12WinnerA || col12WinnerB ||
				col13WinnerA || col13WinnerB ||
				col21WinnerA || col21WinnerB ||
				col22WinnerA || col22WinnerB ||
				col23WinnerA || col23WinnerB ||
				col31WinnerA || col31WinnerB ||
				col32WinnerA || col32WinnerB ||
				col33WinnerA || col33WinnerB ||
				col41WinnerA || col41WinnerB ||
				col42WinnerA || col42WinnerB ||
				col43WinnerA || col43WinnerB ||
				col51WinnerA || col51WinnerB ||
				col52WinnerA || col52WinnerB ||
				col53WinnerA || col53WinnerB ||
				col61WinnerA || col61WinnerB ||
				col62WinnerA || col62WinnerB ||
				col63WinnerA || col63WinnerB ||
				col71WinnerA || col71WinnerB ||
				col72WinnerA || col72WinnerB ||
				col73WinnerA || col73WinnerB ;

				
 	}
	
	public void display()
	{
		System.out.println("*****************");
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				System.out.print(this.theBoard[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
