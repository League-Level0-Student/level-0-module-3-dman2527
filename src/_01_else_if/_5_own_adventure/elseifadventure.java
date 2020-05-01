package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class elseifadventure {
public static void main(String[] args) {
	String run = JOptionPane.showInputDialog("You find youself trapped in a cave with a monster! Do you want to run or fight?");
	if (run .contentEquals("run")) {
	String wait =	JOptionPane.showInputDialog(null, "You are running from the monster and trip into a deeper hole of the cave! Do you wait or do you explore?");
	if (wait .contentEquals("wait")) {
		JOptionPane.showMessageDialog(null,"You starve and die!");
	}
		if (wait.contentEquals("explore")) {
			JOptionPane.showMessageDialog(null, "The monster finds you and eats you!");
		
			}
	
		
		
	}
	if (run.contentEquals("fight")) {
		JOptionPane.showMessageDialog(null, "You beat him and are able to escape the cave!");
	}
	
	
	
	}	
}

