import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.util.*;
import java.lang.*;

public class aigui extends JFrame {
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
		new aigui();

	}

	public aigui(){
		super("TicTacToeAI");
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
									if (buttonClicked.getText().equals("-")){
										buttonClicked.setText("X");
										play();
								}

						}

        });

		}
		add(p);
		setVisible(true);
	}
	public void play(){
		updatestatus();
		if(getstatus().equals("EMPTY")){
			if(attack()){
			}
			else{
				Random num = new Random();
				int attack = num.nextInt(9);
				move(attack);
			}

	}
		updatestatus();
	}

	public void move(int x){
		if(!(iswin())){
	    switch(x){
	      case 0:
	        if (this.buttons[0].getText().equals("-")){
	          this.buttons[0].setText("O");
						break;
					}
	        else{
	          play();
	        	break;
					}
	      case 1:
					if (this.buttons[1].getText().equals("-")){
						this.buttons[1].setText("O");
						break;
					}
					else{
						play();
						break;
					}
	      case 2:
					if (this.buttons[2].getText().equals("-")){
						this.buttons[2].setText("O");
						break;
					}
					else{
						play();
						break;
				}
	      case 3:
					if (this.buttons[3].getText().equals("-")){
						this.buttons[3].setText("O");
						break;
					}
					else{
						play();
						break;
					}
	      case 4:
					if (this.buttons[4].getText().equals("-")){
						this.buttons[4].setText("O");
						break;
					}
					else{
						play();
						break;
					}
	      case 5:
					if (this.buttons[5].getText().equals("-")){
						this.buttons[5].setText("O");
						break;
					}
					else{
						play();
						break;
					}
	      case 6:
					if (this.buttons[6].getText().equals("-")){
						this.buttons[6].setText("O");
						break;
					}
					else{
						play();
						break;
					}
	      case 7:
					if (this.buttons[7].getText().equals("-")){
						this.buttons[7].setText("O");
						break;
					}
					else{
						play();
						break;
					}
	      case 8:
					if (this.buttons[8].getText().equals("-")){
						this.buttons[8].setText("O");
						break;
					}
					else{
						play();
						break;
					}
	    }
		}
	 }

	void reset(){
		for(int i=0;i<9;i++){
			this.buttons[i].setText("-");
		}
	}

	public String getstatus(){
		return this.status;
	}
	public void updatestatus(){
		if (iswin()){
			this.status = "WIN";
			try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            // nothing
        }
				reset();
				if(this.w.equals("X")){
					dispose();
					xwin x = new xwin();
					x.display();
				}
				else if(this.w.equals("O")){
					dispose();
					owin o = new owin();
					o.display();
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
					reset();
					dispose();
					draw d = new draw();
					d.display();
			}
		}
	}
	public boolean iswin(){
		if (buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText()) && !(buttons[0].getText().equals("-"))){
			this.w = buttons[0].getText();
			return true;
		}
		else if (buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText()) && !(buttons[5].getText().equals("-"))){
			this.w =buttons[3].getText();
			return true;
		}
		else if (buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText()) && !(buttons[8].getText().equals("-"))){
			this.w =buttons[6].getText();
			return true;
		}
		//horizontal
		else if (buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText()) && !(buttons[6].getText().equals("-"))){
			this.w =buttons[0].getText();
			return true;
		}
		else if (buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText()) && !(buttons[7].getText().equals("-"))){
		  this.w =buttons[1].getText();
			return true;
		}
		else if (buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText()) && !(buttons[8].getText().equals("-"))){
			this.w =buttons[2].getText();
			return true;
		}
		//vertical
		else if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText()) && !(buttons[8].getText().equals("-"))){
			this.w =buttons[0].getText();
			return true;
		}
		else if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText()) && !(buttons[6].getText().equals("-"))){
			this.w =buttons[2].getText();
			return true;
		}
		//diagonal
		else{
			return false;
		}
	}

	public boolean attack(){
		if (this.buttons[0].getText().equals(this.buttons[1].getText()) && !(this.buttons[0].getText().equals("-")) && (this.buttons[2].getText().equals("-"))){
			move(2);
			return true;
		}
		else if (this.buttons[2].getText().equals(this.buttons[1].getText()) && !(this.buttons[1].getText().equals("-")) && (this.buttons[0].getText().equals("-"))){
			move(0);
			return true;
		}
		else if (this.buttons[0].getText().equals(this.buttons[2].getText()) && !(this.buttons[0].getText().equals("-")) && (this.buttons[1].getText().equals("-"))){
			move(1);
			return true;
		}
		//h1
		else if (this.buttons[3].getText().equals(this.buttons[4].getText())  && !(this.buttons[3].getText().equals("-")) && (this.buttons[5].getText().equals("-"))){
			move(5);
			return true;
		}
		else if (this.buttons[5].getText().equals(this.buttons[4].getText())  && !(this.buttons[5].getText().equals("-")) && (this.buttons[3].getText().equals("-"))){
			move(3);
			return true;
		}
		else if (this.buttons[3].getText().equals(this.buttons[5].getText())  && !(this.buttons[5].getText().equals("-")) && (this.buttons[4].getText().equals("-"))){
			move(4);
			return true;
		}
		//h2
		else if (this.buttons[6].getText().equals(this.buttons[7].getText()) && !(this.buttons[7].getText().equals("-")) && (this.buttons[8].getText().equals("-"))){
			move(8);
			return true;
		}
		else if (this.buttons[6].getText().equals(this.buttons[8].getText()) && !(this.buttons[8].getText().equals("-")) && (this.buttons[6].getText().equals("-"))){
			move(6);
			return true;
		}
		else if (this.buttons[8].getText().equals(this.buttons[7].getText()) && !(this.buttons[8].getText().equals("-")) && (this.buttons[6].getText().equals("-"))){
			move(6);
			return true;
		}
		//h3
		//horizontal
		else if (this.buttons[0].getText().equals(this.buttons[3].getText())  && !(this.buttons[0].getText().equals("-")) && (this.buttons[6].getText().equals("-"))){
			move(6);
			return true;
		}
		else if (this.buttons[6].getText().equals(this.buttons[3].getText())  && !(this.buttons[6].getText().equals("-")) && (this.buttons[0].getText().equals("-"))){
			move(0);
			return true;
		}
		else if (this.buttons[0].getText().equals(this.buttons[6].getText())  && !(this.buttons[0].getText().equals("-")) && (this.buttons[3].getText().equals("-"))){
			move(3);
			return true;
		}
		//v1
		else if (this.buttons[1].getText().equals(this.buttons[4].getText()) && !(this.buttons[1].getText().equals("-")) && (this.buttons[7].getText().equals("-"))){
			move(7);
			return true;
		}
		else if (this.buttons[7].getText().equals(this.buttons[4].getText()) && !(this.buttons[7].getText().equals("-")) && (this.buttons[1].getText().equals("-"))){
			move(1);
			return true;
		}
		else if (this.buttons[1].getText().equals(this.buttons[7].getText()) && !(this.buttons[7].getText().equals("-")) && (this.buttons[4].getText().equals("-"))){
			move(4);
			return true;
		}
		//v2
		else if (this.buttons[2].getText().equals(this.buttons[5].getText())  && !(this.buttons[2].getText().equals("-")) && (this.buttons[8].getText().equals("-"))){
			move(8);
			return true;
		}
		else if (this.buttons[8].getText().equals(this.buttons[5].getText())  && !(this.buttons[5].getText().equals("-")) && (this.buttons[2].getText().equals("-"))){
			move(2);
			return true;
		}
		else if (this.buttons[2].getText().equals(this.buttons[8].getText())  && !(this.buttons[2].getText().equals("-")) && (this.buttons[5].getText().equals("-"))){
			move(5);
			return true;
		}
		//v3
		//vertical
		else if (this.buttons[0].getText().equals(this.buttons[4].getText())  && !(this.buttons[4].getText().equals("-")) && (this.buttons[8].getText().equals("-"))){
			move(8);
			return true;
		}
		else if (this.buttons[8].getText().equals(this.buttons[4].getText())  && !(this.buttons[8].getText().equals("-")) && (this.buttons[0].getText().equals("-"))){
			move(0);
			return true;
		}
		else if (this.buttons[0].getText().equals(this.buttons[8].getText())  && !(this.buttons[0].getText().equals("-")) && (this.buttons[4].getText().equals("-"))){
			move(4);
			return true;
		}
		//d1
		else if (this.buttons[2].getText().equals(this.buttons[4].getText()) && !(this.buttons[2].getText().equals("-")) && (this.buttons[6].getText().equals("-"))){
			move(6);
			return true;
		}
		else if (this.buttons[6].getText().equals(this.buttons[4].getText()) && !(this.buttons[4].getText().equals("-")) && (this.buttons[2].getText().equals("-"))){
			move(2);
			return true;
		}
		else if (this.buttons[2].getText().equals(this.buttons[6].getText()) && !(this.buttons[2].getText().equals("-")) && (this.buttons[4].getText().equals("-"))){
			move(4);
			return true;
		}
		//d2
		//diagonal
		else{
			return false;
		}
	}
}
