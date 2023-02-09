import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class displayUpdate {
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
	
	public static void monitorUpdate() {    
		// make the labels, align them and set a border
	    JLabel label = new JLabel("My Program Title", SwingConstants.CENTER);
	    JLabel label2 = new JLabel("Select an option...", SwingConstants.CENTER);
	    label.setVerticalAlignment(SwingConstants.TOP);
	    label.setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // make labels and give them fonts and size
	    label.setFont(new Font("times new roman",Font.PLAIN,48));
	    label2.setFont(new Font("times new roman",Font.PLAIN,18));
	    label.setForeground(Color.red);
	    
	    // make the frame to display the labels on
	    JFrame frame = new JFrame("Main Menu sucka");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // testing gridbaglayout
	    JPanel p = new JPanel(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
	    
	    // grabs main page image
	    var picObj = frame.add(new JLabel(new ImageIcon("titlePic.jpg")));
	    
	    // places item in grib-bag
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
	    c.gridx = 0;
	    c.gridy = 0;
	    p.add(picObj, c);
	    
	    // Set the title and caption for title positions
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridwidth = 1;
	    c.gridx = 1;
	    c.gridy = 0;
	    p.add(label, c);
	    
	    // sets image icon in grid-bag
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridwidth = 1;
	    c.gridx = 1;
	    c.gridy = 1;
	    p.add(label2, c);
	    
	    
	    // make the buttons and add them to the grid
		JButton btn1 = new JButton("Sub Menu 1");
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 0;
	    c.gridy = 2;
	    //p.add(btn1, c);
	    p.add(btn1, c);
	    
	    
	    // Figure out how to call actionlistener class
	    //btn1.addActionListener(this);
	    
	    JLabel labelDescrip1 = new JLabel("Description 1");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 2;
	    c.gridy = 2;
	    p.add(labelDescrip1, c);
	    
	    JButton btn2 = new JButton("Sub Menu 2");
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
	    
	    JButton btn3 = new JButton("Sub Menu 3");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 0;
	    c.gridy = 4;
	    p.add(btn3, c);
	    
	    JLabel labelDescrip3 = new JLabel("Description 3");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 2;
	    c.gridy = 4;
	    p.add(labelDescrip3, c);
	    
	    JButton btn4 = new JButton("Sub Menu 4");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 0;
	    c.gridy = 5;
	    p.add(btn4, c);
	    
	    JLabel labelDescrip4 = new JLabel("Description 4");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 2;
	    c.gridy = 5;
	    p.add(labelDescrip4, c);
	    
	    JButton btn5 = new JButton("Sub Menu 5");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 0;
	    c.gridy = 6;
	    p.add(btn5, c);
	    
	    JLabel labelDescrip5 = new JLabel("Description 5");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridx = 2;
	    c.gridy = 6;
	    p.add(labelDescrip5, c);
	    
	    JButton btnExt = new JButton("Exit");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 3;
	    c.gridx = 0;
	    c.gridy = 7;
	    p.add(btnExt, c);
		
	    // create an empty border for the frame and setup other frame settings
	    p.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
	    frame.setContentPane(p);
	    frame.setSize(700, 400);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
			
	    // creates action listener for the main menu buttons
	    btn1.addActionListener(new ActionListener(){
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Submenu 1 clicked.");
	    		subMenu1.run();
	    	}});
	    btn2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Submenu 2 clicked.");
	    		subMenu2 m = new subMenu2();
	    		m.run();
	    		//subMenu2.run();
	    		}});
	    btn3.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Submenu 3 clicked.");
	    		subMenu3.run();
	    		}});
	    btn4.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e) {
	   			System.out.println("Submenu 4 clicked.");
	   			subMenu4.run();
	    		}});
	    btn5.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e) {
	   			System.out.println("Submenu 5 clicked.");
	   			RadioButton.run();
	    		}});
	    btnExt.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e) {
	   			System.exit(0);
	    		}});
    
	
	}
/*
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btn1) {
			subMenu1.run();
		}
		
	}	
	*/
}
	
