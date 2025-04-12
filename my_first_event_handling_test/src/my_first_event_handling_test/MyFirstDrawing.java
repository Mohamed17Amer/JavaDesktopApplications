package my_first_event_handling_test;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFirstDrawing {

	JFrame frame = new JFrame();
	MyPanel myPanel = new MyPanel();

	MyFirstDrawing() {

		frame.setTitle("Painting");
		frame.setSize(1000, 500);
		frame.isResizable();
		frame.setResizable(true);
		frame.setLocation(50, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // operation when close
		frame.setBackground(Color.BLACK); // background when transparency
		frame.setLayout(new FlowLayout()); // main layout
		// frame.setVisible(true);

		/***********************
		 * END Building Frame
		 *************************************/
		
		frame.add(myPanel);
		
		

	}

}
