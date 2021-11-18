import java.util.*;

public class game implements global{//game class
  player playerx;//initalize both players as a regular player
  player playero;
  String[] names = new String[2];//array containing names
  board gameboard;
  public game(){
    this.gameboard = new board();//create a board
  }
  public int menu(){
    System.out.println("-----------------------------");//menu
    System.out.println("|1    Human VS Human        |");
    System.out.println("|2     Human VS AI          |");
    System.out.println("|3      AI VS AI            |");
    System.out.println("|4        Quit              |");
    System.out.println("-----------------------------");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    return x;
  }
  public int cointoss(){//coin toss chooses which player goes first
    Random num = new Random();
    int x = num.nextInt(2);
    return x;
  }
  public void humanvhuman(int y){//human vs human
    for (int x = 0; x < 2; x++){
      if (x == y){
        playerx = new humanplayer(X,this.names[x]);//make 2 human player
      }
      else{
        playero = new humanplayer(O,this.names[x]);
      }
    }
    System.out.println("player "+y+ this.names[y]+" starts");//while game is empty let them play
    while(this.gameboard.getstatus().equals("EMPTY")){
      this.playerx.play(this.gameboard);//make a move
      this.gameboard.display();//show the board
      this.gameboard.updatestatus();
      System.out.println(this.gameboard.getstatus());//show the state
      this.playero.play(this.gameboard);
      this.gameboard.display();
      this.gameboard.updatestatus();
      System.out.println(this.gameboard.getstatus());
    }
  }
  public void humanvai(int y){//human vs AI
    for (int x = 0; x < 2; x++){
      if (x == y){
        playerx = new humanplayer(X,this.names[x]);//initalize first player as human
      }
      else{
        playero = new aiplayer(O,this.names[x]);//second as computer
      }
    }
    System.out.println("player "+y+" "+this.names[y]+" starts");//whenever human makes a move computer makes a move
    while(this.gameboard.getstatus().equals("EMPTY")){
      this.playerx.play(this.gameboard);
      this.gameboard.display();
      this.gameboard.updatestatus();
      System.out.println(this.gameboard.getstatus());
      this.playero.play(this.gameboard);
      this.gameboard.display();
      this.gameboard.updatestatus();
      System.out.println(this.gameboard.getstatus());
    }
  }
  public void aivai(int y){//AI v AI
    for (int x = 0; x < 2; x++){
      if (x == y){
        playerx = new aiplayer(X,this.names[x]);//both players are ai players
      }
      else{
        playero = new aiplayer(O,this.names[x]);
      }
    }
    System.out.println("player "+y+ this.names[y]+" starts");//while status is empty make both players play
    while(this.gameboard.getstatus().equals("EMPTY")){
      this.playerx.play(this.gameboard);
      this.gameboard.display();
      this.gameboard.updatestatus();
      System.out.println(this.gameboard.getstatus());
      this.playero.play(this.gameboard);
      this.gameboard.display();
      this.gameboard.updatestatus();
      System.out.println(this.gameboard.getstatus());
    }
  }
  public void start(){//starts the game
    int y = cointoss();//tosees coin
    for (int x = 0; x < 2; x++){
      System.out.println("player "+x+" please enter your name");//asks for name
      Scanner sc1 = new Scanner(System.in);
      this.names[x] = sc1.next();
    }
    int z = menu();//shows menu and asks for game option
    while (z != 4){
      switch (z){
        case 1:
          humanvhuman(y);
          break;
        case 2:
          humanvai(y);
          break;
        case 3:
          aivai(y);
          break;
        case 4:
          break;
      }
      this.gameboard= new board();//when game is done reinitialize the board
      y = cointoss();//do onother coin toss
      z = menu();//call menu and get the game option again
    }
  }
}
