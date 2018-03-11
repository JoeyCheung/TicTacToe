import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGUI extends JFrame{

	int slots = 9;
	String text = "";
	JFrame jframe = new JFrame("TicTacToe");
	JButton[] button = new JButton[9];
	
	public void initialize() {
		
		jframe.setSize(500,500);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new GridLayout(3,3));
		Container container = jframe.getContentPane();
		theHandler handler = new theHandler();
		
		for (int i = 0; i < slots; i++) {
			button[i] = new JButton(text);
			container.add(button[i]);
			button[i].addActionListener(handler);
		}
		
		jframe.setVisible(true);
	}
	
	private class theHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			((JButton)e.getSource()).setText(text);
			if (text == "X") { 
				text = "O";
			}
			else {
				text = "X";
			}
			((JButton)e.getSource()).setText(text);
		}
	}
}
