package my_first_event_handling_test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	MyPanel() {
	setBackground(Color.BLUE);

	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(Color.RED);
		graphics.drawLine(50, 50, 200, 200);

		graphics.setColor(Color.BLUE);
		graphics.fillRect(50, 50, 100, 100);

		graphics.setColor(Color.GREEN);
		graphics.drawRect(50, 50, 100, 100);

		graphics.setColor(Color.BLUE);
		graphics.draw3DRect(50, 50, 100, 100, true);
		
		graphics.setColor(Color.GREEN);
		graphics.fill3DRect(50, 50, 100, 100, true);

		graphics.setColor(Color.BLUE);
		graphics.fillOval(50, 50, 100, 100);
		
		graphics.drawArc(100, 100, 100, 100,45,90);
		
		graphics.drawString("Custom JPanel", 30, 50);
		
		 
		repaint();
		//Method repaint calls method paintComponent from outside

		
		
		

	}

}
