package my_first_event_handling_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventsHandler implements ActionListener, ItemListener, MouseListener, KeyListener, MouseMotionListener {

//ActionListner

	@Override
	public void actionPerformed(ActionEvent e) {
		// When you click on a button, menu item, or a check box.
		// https://www.geeksforgeeks.org/java-actionlistener-in-awt/

	}

// ItemListner
	@Override
	public void itemStateChanged(ItemEvent e) {
		// handling user actions such as selecting or deselecting items in components
		// like checkboxes, choice lists, and checkbox groups
		// When the user interacts with the part, the itemStateChanged method of the
		// documented physical object is invoked to respond to the user's actions.
		// https://www.geeksforgeeks.org/java-itemlistener-in-awt/
	}

// MouseListner
	@Override
	public void mouseClicked(MouseEvent e) {
		// complete click - complete selection.

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// drag - highlight - selection.
		// Start actions or feedback on press

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// This is often used to finalize an action that was started with mousePressed,
		// like dropping an item in a new position after dragging or confirming a
		// selection.

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

// KeyListner
	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
