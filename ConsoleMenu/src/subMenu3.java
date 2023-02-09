import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class subMenu3 {
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
	static void run() {
		// make the frame to display the labels on
	    JFrame frame_33 = new JFrame("Main Menu sucka");
	    
		// Make labels
		JLabel label = new JLabel("SubMenu3", SwingConstants.CENTER);
		JLabel label2 = new JLabel("Multiple button submenu...", SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.TOP);
	    label.setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // give labels fonts and size and color
	    label.setFont(new Font("times new roman",Font.PLAIN,48));
	    label2.setFont(new Font("times new roman",Font.PLAIN,18));
	    label.setForeground(Color.red);
		
	    // setup gridbaglayout
		JPanel p = new JPanel(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
	    if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
}
	    if (shouldWeightX) {
            c.weightx = 0.5;
}
	    // Set the title and caption for title positions
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridwidth = 1;
	    c.gridx = 1;
	    c.gridy = 0;
	    p.add(label, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridwidth = 1;
	    c.gridx = 1;
	    c.gridy = 1;
	    p.add(label2, c);
	    
	    // add buttons and place them in gridbaglayout
	    JButton btn1 = new JButton("Sub Sub Menu 1");
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 0;
	    c.gridy = 2;
	    //p.add(btn1, c);
	    p.add(btn1, c);
	    
	    JLabel labelDescrip1 = new JLabel("Description 1");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 2;
	    c.gridy = 2;
	    p.add(labelDescrip1, c);
	    
	    JButton btn2 = new JButton("Sub Sub Menu 2");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 0;
	    c.gridy = 3;
	    p.add(btn2, c);
	    
	    JLabel labelDescrip2 = new JLabel("Description 2");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 2;
	    c.gridy = 3;
	    p.add(labelDescrip2, c);
		
	    // add panel to frame, set size, visibility, and position as centered
	    frame_33.add(p);	    
		frame_33.setSize(600, 300);
		frame_33.setVisible(true);
		frame_33.setLocationRelativeTo(null);
	
		// creates action listener for the main menu buttons
	    btn1.addActionListener(new ActionListener(){
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Sub-Sub-menu 1 clicked.");
	    	}});
	    
	    btn2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Sub-sub-menu 2 clicked.");
	    		}});
	}
	
}
