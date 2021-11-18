import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class maingui extends JFrame {
	int count = 0;
	String status = "EMPTY";
	JPanel p=new JPanel();
	JButton buttons[]=new JButton[9];

	public static void main(String args[]){
		new maingui();

	}

	public maingui(){
		super("TicTacToe");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(1,3));
		buttons[0] = new JButton("HVH");
		buttons[0].setText("Human VS Human");
		p.add(buttons[0]);
		buttons[0].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
									dispose();
									new gui();


						}

        });
		buttons[1] = new JButton("HVA");
		buttons[1].setText("Human VS AI");
		p.add(buttons[1]);
		buttons[1].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
										dispose();
										new aigui();


				}

		   });

			 buttons[2] = new JButton("AVA");
	 		buttons[2].setText("AI VS AI (SLOW)");
	 		p.add(buttons[2]);
	 		buttons[2].addActionListener(new ActionListener() {
	 						public void actionPerformed(ActionEvent e){
	 										dispose();
	 										new aivaiv2();


	 				}

	 		   });
		add(p);
		setVisible(true);
	}


}
