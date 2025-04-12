package my_first_event_handling_test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyContainer  extends JFrame {   // Do not forget inheritance from JFrame.
	
	JPanel panel1 = new JPanel();

	
	MyContainer(){
		
		Container container = getContentPane();   // this line is not important
		
		setTitle("حبايبي الحلوين");   // super.setTitle("My Babies");  
		setSize(1000, 500);
		isResizable();
		setResizable(true);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // operation when close
		setBackground(Color.BLACK); // background when transparency
		
		setLayout(new BorderLayout()); // main layout
		
		// you can use  any word of these words   "container"  /  "this"   / "super"  		
		// container.setLayout( new FlowLayout() );
		// this.setLayout( new FlowLayout() );
		// super.setLayout( new FlowLayout() );
		
		
		/*************** END OF FRAME ****************************/
		
		panel1.add(new JLabel("container"));
		add(panel1);
		
		/*************** END OF PANEL ****************************/

		
		setVisible(true);



		
	}

}
