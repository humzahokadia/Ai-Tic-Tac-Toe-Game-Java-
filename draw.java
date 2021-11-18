import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.util.*;
import java.lang.*;

public class draw extends JFrame {
	JPanel p=new JPanel();
	JLabel label = new JLabel("DRAW");
	public static void main(String args[]){
		new xwin();

	}
	public draw(){
		super("TicTacToeAI");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.add(label);
		add(p);
		setVisible(true);

	}
	public void display(){
		try {
					Thread.sleep(10000);

			} catch(InterruptedException e) {
					// nothing
			}
			dispose();
			new maingui();
	}

}
