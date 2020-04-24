
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String Cats = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		int Cats1 = Integer.parseInt(Cats);
		
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (Cats1 >= 3) {
			JOptionPane.showMessageDialog(null,"You are a crazy lady!");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		if (Cats1 < 3 && Cats1 > 0) {
			playVideo("https://www.youtube.com/watch?v=XyNlqQId-nk");
			
		}
		
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if (Cats1 == 0) {
			playVideo("https://www.youtube.com/watch?v=QnkUljiLDTQ");
		}
		
		
		
		
	}

	public static void playVideo(String videoID) {
		// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't work on
		// some Linux implementations
        try{
		if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				if (Runtime.getRuntime().exec(new String[] { "which", "xdg-open" }).getInputStream().read() != -1) {
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
				}
		} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
		}	
            } catch (Exception e) {
				e.printStackTrace();
			}
	}

}

