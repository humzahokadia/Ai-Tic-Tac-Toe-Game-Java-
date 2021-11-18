import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.util.*;
import java.lang.*;
import javax.swing.AbstractButton;

public class aivaiv2 extends JFrame {
	JPanel p=new JPanel();
	int count;
	String status;
	JButton buttons[]=new JButton[9];
	String x = "X";
	String o = "O";
	guiplayer playerx = new humangui(x);
	guiplayer player0 = new humangui(o);

//	public static void main(String args[]){
//		new aivaiv2();

//	}

	public aivaiv2(){
		super("TicTacToeAI");
		this.status = "EMPTY";
		this.count = 0;
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
								while(getstatus().equals("EMPTY")){
										try {
							            Thread.sleep(100);
													play();
													updatestatus();

							        } catch(InterruptedException w) {
							            // nothing
												}
									}
								}

        });

		}
		buttons[0].doClick();
		add(p);
		setVisible(true);
	}
	public void play(){
		updatestatus();
		if(getstatus().equals("EMPTY")){
			if(attack()){
			}
			else{
				updatestatus();
				Random num = new Random();
				int attack = num.nextInt(9);
				move(attack);
			}
			updatestatus();
	}

	}

	public void move(int x){
		if(getstatus().equals("EMPTY")){
	    switch(x){
	      case 0:
	        if (this.buttons[0].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[0].setText("X");
							this.count++;
							break;

						}
						else{
	          this.buttons[0].setText("O");
						this.count++;
						break;
					}
				}
				else{
					play();
					break;
				}

	      case 1:
					if (this.buttons[1].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[1].setText("X");
							this.count++;
							break;
						}
						else{
						this.buttons[1].setText("O");
						this.count++;
						break;
					}
				}
				else{
					play();
					break;
				}
	      case 2:
					if (this.buttons[2].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[2].setText("X");
							this.count++;
							break;
						}
						else{
						this.buttons[2].setText("O");
						this.count++;
						break;
					}
				}
				else{
					play();
					break;
				}
	      case 3:
						if (this.buttons[3].getText().equals("-")){
							if (this.count %2 == 0){
								this.buttons[3].setText("X");
								this.count++;
								break;
							}
							else{
		          this.buttons[3].setText("O");
							this.count++;
							break;
						}
					}
					else{
						play();
						break;
					}
	      case 4:
					if (this.buttons[4].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[4].setText("X");
							this.count++;
							break;
						}
						else{
						this.buttons[4].setText("O");
						this.count++;
						break;
					}
				}
				else{
					play();
					break;
				}
	      case 5:
					if (this.buttons[5].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[5].setText("X");
							this.count++;
							break;
						}
						else{
						this.buttons[5].setText("O");
						this.count++;
						break;
					}
				}
				else{
					play();
					break;
				}
	      case 6:
					if (this.buttons[6].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[6].setText("X");
							this.count++;
							break;
						}
						else{
						this.buttons[6].setText("O");
						this.count++;
						break;
					}
				}
				else{
					play();
					break;
				}
	      case 7:
					if (this.buttons[7].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[7].setText("X");
							this.count++;
							break;
						}
						else{
						this.buttons[7].setText("O");
						this.count++;
						break;
					}
				}
				else{
					play();
					break;
				}
	      case 8:
					if (this.buttons[8].getText().equals("-")){
						if (this.count %2 == 0){
							this.buttons[8].setText("X");
							this.count++;
							break;
						}
						else{
						this.buttons[8].setText("O");
						this.count++;
						break;
					}
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
						//reset();
						//this.status = "EMPTY";

        } catch(InterruptedException e) {
            // nothing
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
				this.status = "DRAW";
				try {
	            Thread.sleep(10000);
							//reset();
							//this.status = "EMPTY";
							dispose();
							//new aivaiv2();
							new maingui();

	        } catch(InterruptedException e) {
	            // nothing
	        }
			}


		if (!(getstatus().equals("EMPTY"))){
			try {
            Thread.sleep(10000);
						//reset();
						//this.status = "EMPTY";
						dispose();
						//new aivaiv2();
						new maingui();

        } catch(InterruptedException e) {
            // nothing
        }
		}
	}
}

	public boolean iswin(){
		if (this.buttons[0].getText().equals(this.buttons[1].getText()) && this.buttons[0].getText().equals(this.buttons[2].getText()) && !(this.buttons[0].getText().equals("-"))){
			return true;
		}
		else if (this.buttons[3].getText().equals(this.buttons[4].getText()) && this.buttons[3].getText().equals(this.buttons[5].getText()) && !(this.buttons[5].getText().equals("-"))){
			return true;
		}
		else if (this.buttons[6].getText().equals(this.buttons[7].getText()) && this.buttons[6].getText().equals(this.buttons[8].getText()) && !(this.buttons[8].getText().equals("-"))){
			return true;
		}
		//horizontal
		else if (this.buttons[0].getText().equals(this.buttons[3].getText()) && this.buttons[0].getText().equals(this.buttons[6].getText()) && !(this.buttons[6].getText().equals("-"))){
			return true;
		}
		else if (this.buttons[1].getText().equals(this.buttons[4].getText()) && this.buttons[1].getText().equals(this.buttons[7].getText()) && !(this.buttons[7].getText().equals("-"))){
			return true;
		}
		else if (this.buttons[2].getText().equals(this.buttons[5].getText()) && this.buttons[2].getText().equals(this.buttons[8].getText()) && !(this.buttons[8].getText().equals("-"))){
			return true;
		}
		//vertical
		else if (this.buttons[0].getText().equals(this.buttons[4].getText()) && this.buttons[0].getText().equals(this.buttons[8].getText()) && !(this.buttons[8].getText().equals("-"))){
			return true;
		}
		else if (this.buttons[2].getText().equals(this.buttons[4].getText()) && this.buttons[2].getText().equals(this.buttons[6].getText()) && !(this.buttons[6].getText().equals("-"))){
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
