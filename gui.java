import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class gui extends JFrame {
	String w;
	int count = 0;
	String status = "EMPTY";
	JPanel p=new JPanel();
	JButton buttons[]=new JButton[9];
	String x = "X";
	String o = "O";
	guiplayer playerx = new humangui(x);
	guiplayer player0 = new humangui(o);

	public static void main(String args[]){
		new gui();

	}

	public gui(){
		super("TicTacToe");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++){
			buttons[i] = new JButton();
			buttons[i].setText("-");
			p.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {


						public void actionPerformed(ActionEvent e){
								updatestatus();
							  JButton buttonClicked = (JButton)e.getSource();
								if ((count % 2) == 0){
									if (buttonClicked.getText().equals("-")){
										buttonClicked.setText("X");
										count++;
									}
								}
								else{
									if (buttonClicked.getText().equals("-")){
										buttonClicked.setText("O");
										count++;
								}
								}

						}

        });

		}
		add(p);
		setVisible(true);
	}


	void reset(){
		for(int i=0;i<9;i++){
			buttons[i].setText("-");
		}
	}

	public String getstatus(){
		updatestatus();
		return this.status;
	}
	public void updatestatus(){
		if (iswin()){
			try {
						Thread.sleep(1000);
				} catch(InterruptedException e) {
						// nothing
				}
			dispose();
			if(this.w.equals("X")){
				dispose();
				xwin win = new xwin();
			win.display();
			}
			else if(this.w.equals("O")){
				dispose();
				owin win =new owin();
				win.display();
			}
		}
		else{
			int count = 0;
			for(int x = 0; x < 9;x++){
				if (!(buttons[x].getText().equals("-"))){
					count++;
				}
			}
			if (count == 9){
				try {
	            Thread.sleep(1000);

	        } catch(InterruptedException e) {
	            // nothing
	        }
					dispose();
					draw draw = new draw();
					draw.display();
			}
	}
}
	public boolean iswin(){
		if (buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText()) && !(buttons[0].getText().equals("-"))){
			this.w = buttons[0].getText();
			return true;
		}
		else if (buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText()) && !(buttons[5].getText().equals("-"))){
			this.w = buttons[3].getText();
			return true;
		}
		else if (buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText()) && !(buttons[8].getText().equals("-"))){
			buttons[6].getText();
			return true;
		}
		//horizontal
		else if (buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText()) && !(buttons[6].getText().equals("-"))){
			this.w = buttons[0].getText();
			return true;
		}
		else if (buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText()) && !(buttons[7].getText().equals("-"))){
			this.w = buttons[1].getText();
			return true;
		}
		else if (buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText()) && !(buttons[8].getText().equals("-"))){
			this.w = buttons[2].getText();
			return true;
		}
		//vertical
		else if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText()) && !(buttons[8].getText().equals("-"))){
			this.w = buttons[0].getText();
			return true;
		}
		else if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText()) && !(buttons[6].getText().equals("-"))){
			this.w = buttons[2].getText();
			return true;
		}
		//diagonal
		else{
			return false;
		}
	}
}
