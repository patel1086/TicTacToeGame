import java.util.*;
public class TicTacToeGame{
	public static void create_game_Board()
	{
		char[] gameBoard=new char[10];
		for(int i=1;i<10;i++)
		{
			gameBoard[i]=' ';
		}
			
	}
	public static void main(String[] args)
	{
		create_game_Board();
		
	}
}