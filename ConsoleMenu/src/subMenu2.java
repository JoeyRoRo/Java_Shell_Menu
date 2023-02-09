import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class subMenu2 extends JFrame implements ActionListener{
	// Declaration of frame
    static JFrame f;
	
    // Declaration of object of JCheckBox class.
    JCheckBox c1;
    JCheckBox c2;
  
    // Declaration of object of JButton class.
    JButton jButton;
  
	public void run() {
		// create a new frame
        f = new JFrame("Checkbox demo");
  
        // set layout of frame
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        // Initialization of object of "JButton" class.
        jButton = new JButton("Click");
        jButton.addActionListener(this);
  
        // create checkbox
        c1 = new JCheckBox("checkbox 1");
        c2 = new JCheckBox("checkbox 2");
        c1.setFocusable(false);
        c2.setFocusable(false);
        
        // create a new panel
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        
        // Setting Bounds of "jButton".
        jButton.setBounds(125, 90, 80, 30);
        
        // Adding "jButton" on JFrame.
        //this.add(jButton);
  
        // add checkbox to panel
        p1.add(c1);
        p1.add(c2);
        p2.add(jButton);
  
        // add panel to frame
        f.add(p1);
        f.add(p2);
  
        // set the size, pack, and center frame
        f.setSize(300, 150);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Override Method

        // Declaration of String class Objects.
        String qual = " ";

        // Checks condition of checkboxes for output in dialog format.
        if (c1.isSelected() && !c2.isSelected()) {

            qual += "Checkbox 1 was checked";
        }
        else if (c2.isSelected() && !c1.isSelected()) {
        	  
            qual = "Checkbox 2 was checked";
        }
        else if (c1.isSelected() && c2.isSelected()) {
        	qual = "Checkbox 1 and 2 were checked";
        }
        else {

            qual = "NO Button selected";
        }
        // MessageDialog to show information selected radio buttons.
        JOptionPane.showMessageDialog(subMenu2.this, qual);
	}
}