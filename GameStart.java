package gamepackage;
import java.util.Scanner;

public class GameStart extends Yahtzee {
	
	public GameStart(int numberofPlayers) {
		ScoreboardGenerate(numberofPlayers);
		
	}
	
	
	private static void ScoreboardGenerate(int numberofPlayers) {
		
		int rows = 20;
		int columns = numberofPlayers + 1;

		String[][] array = new String[rows][columns];

		
		//fills in everything with chosen string and instantiate table
		for(int i = 0; i<rows; i++)
		    for(int j = 0; j<columns; j++)
		        array[i][j] = "|*|";
		
		//to-do:
		//replace first row with player names
		
		array[0][0] = "Players\t\t";
		array[1][0] = "Ones\t\t";
		array[2][0] = "Twos\t\t";
		array[3][0] = "Threes\t\t";
		array[4][0] = "Fours\t\t";
		array[5][0] = "Fives\t\t";
		array[6][0] = "Sixes\t\t";
		array[7][0] = "Total Score\t";
		array[8][0] = "Bonus\t\t";
		array[9][0] = "Total Upper\t";
		array[10][0] = "--------------";
		array[11][0] = "3 of a Kind\t";
		array[12][0] = "4 of a Kind\t";
		array[13][0] = "Full House\t";
		array[14][0] = "Small Straight\t";
		array[15][0] = "Large Straight\t";
		array[16][0] = "Yahtzee\t\t";
		array[17][0] = "Chance\t\t";
		array[18][0] = "Total Lower\t";
		array[19][0] = "Final Score\t"; 
		
		
		if (numberofPlayers > 1 && numberofPlayers < 3) {
			array[0][1] = " 1";
			array[0][2] = "  2";
		}
		else if (numberofPlayers > 2 && numberofPlayers < 4) {
			array[0][1] = " 1";
			array[0][2] = "   2";
			array[0][3] = "    3";
		}
		else {
		array[0][1] = " 1";	
		}
		
		for(int i = 0; i<rows; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(array[i][j]);
		    }
		    	System.out.println();
		}
}


}

