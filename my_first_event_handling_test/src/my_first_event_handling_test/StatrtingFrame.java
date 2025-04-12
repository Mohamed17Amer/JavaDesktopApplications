package my_first_event_handling_test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StatrtingFrame {
	JFrame frame;
	JPanel panel1;
	JButton simpleFrameButton;
	JButton simpleDrawingButton;
	FlowLayout panel1Layout;

	StatrtingFrame() {

		init();
		drawFrame();
		drawPanel1();
		addPanelsToFrame();

		frame.setVisible(true);

	}

	void init() {
		frame = new JFrame();
		panel1 = new JPanel();
		simpleFrameButton = new JButton("Simple Frame");
		simpleDrawingButton = new JButton("Simple Drawing");
		panel1Layout = new FlowLayout(FlowLayout.CENTER, 5, 5);

	}

	JFrame drawFrame() {
		frame.setTitle("Painting");
		frame.setSize(1000, 500);
		frame.isResizable();
		frame.setResizable(true);
		frame.setLocation(50, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // operation when close
		frame.setBackground(Color.BLACK); // background when transparency
		frame.setLayout(new BorderLayout(2, 2)); // main layout

		// frame.setVisible(true);

		return frame;
	}

	JPanel drawPanel1() {

		panel1.setLayout(panel1Layout);
		panel1.add(simpleFrameButton);
		panel1.add(simpleDrawingButton);

		return panel1;

	}

	
	void addPanelsToFrame() {
		frame.add(panel1);
	}
}
