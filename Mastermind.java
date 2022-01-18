/* Mastermind PvC
- 2d array list makes up bored
- secret does not get printed every time
- secret is 5 non repeat pins
- How many turns or tries?
- class: board, game, player
* */
import java.util.ArrayList;
import java.util.Scanner;
public class Mastermind{
	//public static void main (String[] args){
		
		
		
		public void printBoard(){
		ArrayList<ArrayList<Character>> board = new ArrayList<ArrayList<Character>>();
		
		
		
		for(int i = 0; i<10; i++)
		{
			board.add(new ArrayList<Character>());
			for(int x = 0; x < 9; x++){
				if(x==4)
				{
					board.get(i).add(' ');
				}
				else if (x<4)
				{
					board.get(i).add('?');
				}
				else
				{
					board.get(i).add('-');
				}
			}
		}
		
		System.out.print("BOARD");
		System.out.println("		SCORE");
		
		for(int i = 0; i<board.size(); i++)
		{
			System.out.println(board.get(i));
		}
	}
			
		
		
		
	
	
	
	
	
	
	
	
	
}
//}
