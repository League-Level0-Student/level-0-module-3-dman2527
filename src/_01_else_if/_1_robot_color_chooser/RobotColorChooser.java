
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		Robot Luca = new Robot();
		Luca.setPenWidth(10);
		for (int i = 0; i < 3; i++) {
			String color = JOptionPane.showInputDialog("What color pen would you like me to draw with");		
			
	if (color .equals( "red")) {
				Luca.setPenColor(Color.red);
			}
			if (color .equals("blue")) {
				Luca.setPenColor(Color.blue);
			}
			if (color .equals( "green")) {
				Luca.setPenColor(Color.green);
			}
			if (color .equals( "orange")) {
				Luca.setPenColor(Color.orange);
			}
			if (color .equals( "purple")) {
				Luca.setPenColor(Color.pink);
			}
			if (color .equals( "white")) {
				Luca.setPenColor(Color.white);
			}
			if (color .equals( "black")) {
				Luca.setPenColor(Color.black);
			}
			
	        //6. If the user doesn’t enter anything, choose a random color
			if (color .equals( "")) {
				Luca.setRandomPenColor();
			}
			
			Luca.setSpeed(1000);
			Luca.penDown();
			Luca.moveTo(300,300);
			Luca.setAngle(0);
			Luca.move(100);
			Luca.turn(270);
			Luca.move(100);
			Luca.turn(270);
			Luca.move(100);
			Luca.turn(270);
			Luca.move(100);
			Luca.turn(270);
			Luca.move(100); 
			}
	}
		//1. Create a new Robot
		
		
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		
		//3. Set the pen width to 10
		
		//4. Ask the user what color pen they would like the robot to draw with

		//5. Use an if/else statement to set the pen color that the user requested
	
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	
	}