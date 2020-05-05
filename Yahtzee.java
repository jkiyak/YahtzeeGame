package gamepackage;
import java.util.Scanner;

import gamepackage.DiceRolls;
import gamepackage.GameStart;


public class Yahtzee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Yahtzee!");
		System.out.println("How many players are you having? Enter a number 1 - 4");
		
		int numberofPlayers = sc.nextInt();
		
		System.out.print("This game will have " + numberofPlayers + " players.\n");
		
		sc.close();
		
		//optional:
		//add method for naming players??
		
		GameStart g = new GameStart(numberofPlayers);
		
	}
}
