package my_first_event_handling_test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ComponentTest { // to test each component attributes and methods
	public ComponentTest() {

		/***************** JLabel *******************/

		JLabel label = new JLabel("Section I & K");
		label.setText("midterm_exam");
		label.setToolTipText("this is a label"); // when hover

		label.setFont(new Font("Arial", Font.BOLD, 24));

		label.setBackground(Color.BLUE);
		label.setForeground(Color.GREEN);

		// create font objects
		Font plainFont = new Font("Serif", Font.PLAIN, 14);
		Font boldFont = new Font("Serif", Font.BOLD, 14);
		Font italicFont = new Font("Serif", Font.ITALIC, 14);
		Font boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		label.setFont(plainFont); // set initial font

		/***************** JTextField *******************/

		JTextField txtField = new JTextField(10); // empty field with 10 columns
		txtField.setText("your name");
		String text = txtField.getText();
		txtField.setForeground(Color.BLUE);

		/***************** JPasswordField *******************/

		JPasswordField passwordField = new JPasswordField();
		String password = passwordField.getPassword().toString();

		/***************** JTextArea *******************/

		JTextArea textArea = new JTextArea(5, 20); // 5 rows, 20 columns
		textArea.append("new word");
		String selectedText = textArea.getSelectedText();

		textArea.setLineWrap(true); // Enable line wrapping
		textArea.setWrapStyleWord(true); // Wrap at word boundaries

		/***************** JButton *******************/

		JButton button = new JButton("Click Me");
		button.setText("login");
		button.setBackground(Color.CYAN);
		button.setPreferredSize(new Dimension(100, 40));
		button.setFocusable(true); // could be clicked

		/***************** JRadioButton *******************/

		JRadioButton r1 = new JRadioButton();
		r1.setText("male");
		JRadioButton r2 = new JRadioButton();
		r2.setText("female");

		ButtonGroup group1 = new ButtonGroup();
		group1.add(r1);
		group1.add(r2);

		// then, we add r1, r2 themselves (not group1) to the panel

		/***************** JCheckbox *******************/

		JCheckBox checkBox1 = new JCheckBox("Check Me");
		checkBox1.setSelected(true);

		boolean isSelected = checkBox1.isSelected();
		checkBox1.setText(isSelected ? "Selected" : "Not Selected");

		/***************** JScrollPane *******************/

		// is designed to hold only one component at a time 1- Wrap the component with
		// scrollPane (wrap not add)
		// 2- add scrollPane to panel or directly to frame
		// if you want to add multiple components, follow steps:-
		// 1- you can add the components to a panel with BoxLayout, 2- add panel to
		// scrollPane,
		// 3- add scrollPane it self directly to frame

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setViewportView(textArea); // alternative way
		// scrollPane.add(textArea); // is wrong and illegal in swing JScrollPane
		
		// vertical (default),  supports Horizontal
		
		/***************** Box vs BoxLayout *******************/

		// In Swing, Box and BoxLayout are closely related concepts that work together 
		// to help layout components
		// Box extends JPanel
		// specifically designed to work with BoxLayout.
		// this mean Box is a Container like Frame and Panel
		// but it is a container with its layout (2*1) (كوفي ميكس يعني )
		// but also we add it to a panel, not directly to frame

		Box box = Box.createVerticalBox();
		box.add(button);
		box.add(checkBox1);
		box.add(scrollPane);

		/***************** Icon *******************/

		ImageIcon icon1 = new ImageIcon("path/to/your/icon.png");
		ImageIcon icon2 = new ImageIcon("path/to/your/icon.png");

		JLabel label2 = new JLabel("Label with text and icon", icon1, SwingConstants.LEFT);
		label2.setIcon(icon1);

		label2.setHorizontalTextPosition(SwingConstants.CENTER);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);

		JButton button2 = new JButton();
		button2.setIcon(icon1);
		button2.setRolloverIcon(icon2); // to specify a different icon that appears when the mouse hovers over the
										// button,

	}

}

// In Swing, the default layout manager for both JFrame and JPanel is BorderLayout and FlowLayout, respectively. 

// toggle - list- combo -dialog
