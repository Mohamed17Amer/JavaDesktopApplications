package my_first_event_handling_test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class MyFrame extends EventsHandler {

	JFrame frame = new JFrame();

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	JButton button1 = new JButton("Red");
	JButton button2 = new JButton("Blue");
	JButton button3 = new JButton("Green");

	JCheckBox checkBox = new JCheckBox("Enable Feature");
	JLabel labelCh = new JLabel();

	JLabel label1 = new JLabel("Label 1");
	JLabel label2 = new JLabel("Label 2");
	JLabel label3 = new JLabel("Label 3");
	JLabel label4 = new JLabel("Label 4");

	JTextArea txtArea1 = new JTextArea();
	JTextArea txtArea2 = new JTextArea();

	JScrollPane scrollPane = new JScrollPane();

	public MyFrame() {

		frame.setTitle("حبايبي الحلوين");
		frame.setSize(1000, 500);
		frame.isResizable();
		frame.setResizable(true);
		frame.setLocation(50, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // operation when close
		frame.setBackground(Color.BLACK); // background when transparency
		frame.setLayout(new BorderLayout()); // main layout

		/***********************
		 * END Building Frame
		 *************************************/

		// First panel with FlowLayout
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		/***********************************************************************************/

		panel1.add(checkBox);
		panel1.add(labelCh);

		checkBox.addItemListener(this);
		// labelCh.Listner(this); not right - not needed

		/*********************** END PANEL 1 *************************************/

		// Second panel with GridLayout
		panel2.setLayout(new GridLayout(2, 3, 10, 10));
		panel2.add(label1);
		panel2.add(label2);
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(txtArea1);
		panel2.add(new JScrollPane(txtArea2));

		txtArea1.addKeyListener(this);

		/*********************** END PANEL 2 *************************************/

		// frame.addMouseListener(this);

		panel2.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent event) {

				label1.setText("Midterm Exam");

			}
		});

		// Adding panels to the frame
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);

		// frame.pack();
		frame.setVisible(true);

	}

	/************************* STARTING ACTIONS **********************************/

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == button1) {
			panel2.setBackground(Color.RED);
		}
		if (event.getSource() == button2) {
			panel2.setBackground(Color.BLUE);
		}
		if (event.getSource() == button3) {
			panel2.setBackground(Color.GREEN);
		}

	}

	// ItemListener
	@Override
	public void itemStateChanged(ItemEvent event) {

		if (event.getStateChange() == ItemEvent.SELECTED) {
			labelCh.setText("Selected");
			;
		} else {
			labelCh.setText("Not Selected");

		}
	}

	// MouseListener

	@Override
	public void mouseClicked(MouseEvent event) {

		String point = event.getPoint().toString();
		label1.setText(point);

	}

	@Override
	public void mouseEntered(MouseEvent event) {
		// panel2.setBackground(Color.black);

	}

	// KeyListener

	@Override
	public void keyPressed(KeyEvent event) {

		// Display message based on key pressed // VK: virtual key
		if (event.getKeyCode() == KeyEvent.VK_ENTER) {
			label4.setText("You pressed Enter: ");
		}

		else if (event.getKeyCode() == KeyEvent.VK_ESCAPE) {
			label4.setText("Escape key pressed!");
		}
	}

	@Override
	public void keyTyped(KeyEvent event) {

		char keyChar = event.getKeyChar();
		label2.setText(keyChar + "");

	}

	void handlingMouseClicks(MouseEvent event) {

		String buttonPressed;

		// Check which mouse button was pressed
		switch (event.getButton()) {
		case MouseEvent.BUTTON1:
			buttonPressed = "Left button";
			break;
		case MouseEvent.BUTTON2:
			buttonPressed = "Middle button";
			break;
		case MouseEvent.BUTTON3:
			buttonPressed = "Right button";
			break;
		default:
			buttonPressed = "Unknown button";
			break;
		}

		// Update label with the button information
		label3.setText("You clicked: " + buttonPressed);

		boolean altDown = event.isAltDown();
		boolean metaDown = event.isMetaDown();

	}
}

/*
 * JOptionPane.showMessageDialog( ButtonTest.this, 53 "You pressed: " +
 * event.getActionCommand() );
 */