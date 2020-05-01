package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class yearsalive {
public static void main(String[] args) {
int number = 0;
	String age =  JOptionPane.showInputDialog("How old are you?");
int age1 = Integer.parseInt(age);
System.out.println("You are 0 years old");
for (int i = 0; i < age1; i++) {
	number = number + 1;
	System.out.println("You are "+ number + " years old");
}
}
}
