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
		
		ArrayList<ArrayList<Character>> board = new ArrayList<ArrayList<Character>>();
		
		public void printBoard(){ //prints out the board 
		
		
		
		
		for(int i = 0; i<20; i++)
		{
			board.add(new ArrayList<Character>());
			
			for(int x = 0; x < 7; x++){
				if(i%2 == 0)
				{
					if(x==4)
					{
						board.get(i).add(' ');
					}
					else if (x<4)
					{
						board.get(i).add('?');
					}
					else if (x>4)
					{
						board.get(i).add('-');
					}
					
				}
				
				else
				{
					if(x==4)
					{
						board.get(i).add(' ');
					}
					else if (x<4)
					{
						board.get(i).add(' ');
					}
					else if (x>4)
					{
						board.get(i).add('-');
					}
				}
									
					
				
				
			}
		}
		//System.out.println("NOTE: The position of the score pins does not correlate in any way to the position of the board pins");
		System.out.print("BOARD");
		System.out.println("		SCORE");
		int counter = 0;
		System.out.println("---------------------");
		for(int i = 0; i<board.size(); i++)
		{
			if(counter ==2){
				System.out.println("---------------------");
				counter = -1;
				i--;
			}
			else
			{
				System.out.println(board.get(i));
				
			}
				counter++;
			
		}
	}
	
	/*
	public void guess(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("");
		System.out.println("Guess:  ");
		
		
		
		
	}
	*/
	
	public void board(){ //populating random computer generated secret code
		ArrayList<Character> pins = new ArrayList<Character>();
		ArrayList<Character> selected = new ArrayList<Character>();
		pins.add('R');
		pins.add('Y');
		pins.add('O');
		pins.add('G');
		pins.add('B');
		pins.add('P');  //x
		pins.add('W');
		
		
		int randomm = (int)(Math.random()*pins.size()-1); 	//creates random 
		int temp = (int)(Math.random()*1000); 				
		
		for(int j = 0; j<4; j++)
		{
			
			selected.add(pins.get(randomm)); //add the random from pins to new selecrted array list
			pins.remove(randomm); //removes the random from the pins list so no repeats
			//System.out.println(j);
		}
		System.out.print(selected);
		
			
		
		
	}
	
	public void playerGuess(){
		//ArrayList<Character> guess = new ArrayList<Character>();
		System.out.println("Type your guess of four letters: R,O,W,Y,G,P,B in all caps");
		Scanner scan = new Scanner (System.in);
		String guess = scan.nextLine();
		
		//for(int i = 0; i < 20; i++)
		//{
			board.get(0).set(0, guess.charAt(0));
			board.get(0).set(1, guess.charAt(1));
			board.get(0).set(2, guess.charAt(2));
			board.get(0).set(3, guess.charAt(3));
			
			//i = i + 2;
		//}
			
		
		
		
		
		
		
	}
		
		
	
	
	
	
	
	
	
	
	
}



