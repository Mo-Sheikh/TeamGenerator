import  javax.swing.*;
import java.awt.*;
public class TeamGeneratorGui {
	
	public static void main (String [] args) {
		// the window
		JFrame frame = new JFrame();
		// setting the size frame
		frame.setSize(new Dimension(500, 400));
		// set the start position of the frame
		
		//centre position to the middle of the screen
		frame.setLocationRelativeTo(null);
		//set a default close action
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//set a title for out frame
		frame.setTitle("Team Generator");
		
		//disable resizing.
		
		frame.setResizable(false);
	}

}
