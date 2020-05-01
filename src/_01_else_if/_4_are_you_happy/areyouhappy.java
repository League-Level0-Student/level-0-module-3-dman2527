package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {
String happy =	JOptionPane.showInputDialog("Are you happy?");
	if (happy .contentEquals("yes")) {
		JOptionPane.showMessageDialog(null, "Then keep doing what you're doing!");
	}
		if (happy .contentEquals("no")) {
		String want = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		
			if (want .contentEquals("yes")) {
			JOptionPane.showMessageDialog(null, "Then change something!");
			}
			if (want .contentEquals("no")) {
			JOptionPane.showMessageDialog(null, "Then keep doing what you're doing!");
			}
			}
		
		
	
		
	}
}

