
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.setSpeed(10);
		
rob.moveTo(50, 300);
		// 2. Make the robot draw a star shape. Hint: angle=144.
rob.penDown();
for (int i = 0; i < 5; i++) {
	

for (int b = 0; b < 4; b++) {
	rob.move(30);
	rob.turn(144);
}
rob.penUp();
rob.move(50);
rob.penDown();
}
}
}