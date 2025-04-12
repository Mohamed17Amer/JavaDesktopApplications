package my_first_event_handling_test;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyLayout {
	
	// the default layout manager for  JFrame is  BorderLayout
	// the default layout manager for  JPanel is  FlowLayout. 

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	LayoutManager generalLayout; 

	MyLayout(){

		/***************** FlowLayout *******************/
		
		FlowLayout fLayout = new FlowLayout();  // it is a class, and we create an object
		
		panel.setLayout(fLayout); 				// pass the created object
		frame.setLayout(fLayout);
		
		fLayout.setAlignment(FlowLayout.LEFT);	// to set or change Alignment of layout components
		fLayout.layoutContainer(panel);			// to realign attached components
		
		// the previous TWO 2 lines are Inseparable (متلازمين دائماً)
		
		
		/***************** BorderLayout *******************/

		generalLayout =  new BorderLayout( 5, 5 );  // H,V Gaps
		
		
		/***************** GridLayout *******************/
		
		generalLayout =	 new GridLayout( 2, 2 );
		generalLayout =  new GridLayout( 2, 3, 5, 5 );
		
		// Components are added starting at top-left cell
		// Proceed left-to-fight until row is full  (left to right,  top to down)

		
		/***************** Box vs BoxLayout *******************/

		// In Swing, Box and BoxLayout are closely related concepts that work together 
		// to help layout components
		// Box extends JPanel
		// specifically designed to work with BoxLayout.
		// this mean Box is a Container like Frame and Panel
		// but it is a container with its layout (2*1) (كوفي ميكس يعني )
		// but also we add it to a panel, not directly to frame
		
		
		
		
		
		
	}
	
	
	
	
	

}
