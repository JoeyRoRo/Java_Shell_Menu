import javax.swing.JButton;
import javax.swing.JFrame;

public class subMenu4 {
	static void run() {
		// create the frame
		JFrame frame_44 = new JFrame("SubMenu 4");
		
		// create teh button and set it's size and postion
		JButton btn44 = new JButton("click again...");
		btn44.setBounds(100, 105, 95, 30);
		
		// add button to frame, set size, layout, visibility and center the window
		frame_44.add(btn44);
		frame_44.setSize(300, 300);
		frame_44.setLayout(null);
		frame_44.setVisible(true);
		frame_44.setLocationRelativeTo(null);
	}

}
