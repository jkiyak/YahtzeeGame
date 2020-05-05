package gamepackage;
import java.util.Random;


public class DiceRolls extends Yahtzee {
	int dice1;
	int dice2;
	int dice3;
	int dice4;
	int dice5;

public DiceRolls() {
	roll();
	
}


public void roll() {
	dice1= (int)(Math.random()*6) + 1;
	dice2= (int)(Math.random()*6) + 1;
	System.out.println(dice1 + dice2);
}

}



