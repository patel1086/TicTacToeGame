import java.util.*;
public class TicTacToeGame{
	static String turn;
	public static char[] createBoard()
	{
		char[] gameBoard=new char[10];
		for(int i=1;i<10;i++)
		{
			gameBoard[i]=' ';
		}
		return gameBoard;	
	}
	public static String chooseplayer()
	{
		System.out.println("Write the play key");
		Scanner sc1=new Scanner(System.in);
		turn=sc1.nextLine(); // X is for computer player and O for User player
		if(turn.equals("X"))
		{
			System.out.println("Computer is playing");
			turn="O";
			return turn;
		}
		else 
		{
			System.out.println("User is playing");
			turn="X";
			return turn;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char[] board=createBoard();
		System.out.println("Welocme to User And Computer Player");
		String turn=chooseplayer();
		
		
		
		
		
	}
}