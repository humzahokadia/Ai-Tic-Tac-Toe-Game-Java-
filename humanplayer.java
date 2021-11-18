import java.util.*;
public class humanplayer extends player implements global{//human player class extends player and implements global
  int move;
  public humanplayer(char symbol, String name){
    super(symbol, name);//sets the name of and symbol of the player
  }
  public void play(board gameboard){//override play method
    if (gameboard.getstatus().equals(empty)){//if game is not over player can make a move
      System.out.println("0   1   2");
      System.out.println("3   4   5");
      System.out.println("6   7   8");
      System.out.println("please enter the the spot you would like");//asks the user to make moves
      Scanner sc = new Scanner(System.in);
      this.move = sc.nextInt();
      move(this.move,gameboard);
  }
  }
  public void move(int x,board gameboard){//makes the move for the players option 
    switch(x){
      case 0:
        if (gameboard.getstate(0,0) == 0)
          gameboard.makemove(0,0,this.symbol);
        else
          play(gameboard);
        break;
      case 1:
        if (gameboard.getstate(0,1) == 0)
          gameboard.makemove(0,1,this.symbol);
        else
          play(gameboard);
        break;
      case 2:
        if (gameboard.getstate(0,2) == 0)
          gameboard.makemove(0,2,this.symbol);
        else
          play(gameboard);
        break;
      case 3:
        if (gameboard.getstate(1,0) == 0)
          gameboard.makemove(1,0,this.symbol);
        else
          play(gameboard);
        break;
      case 4:
        if (gameboard.getstate(1,1) == 0)
          gameboard.makemove(1,1,this.symbol);
        else
          play(gameboard);
        break;
      case 5:
        if (gameboard.getstate(1,2) == 0)
          gameboard.makemove(1,2,this.symbol);
        else
          play(gameboard);
        break;
      case 6:
        if (gameboard.getstate(2,0) == 0)
          gameboard.makemove(2,0,this.symbol);
        else
          play(gameboard);
        break;
      case 7:
        if (gameboard.getstate(2,1) == 0)
          gameboard.makemove(2,1,this.symbol);
        else
          play(gameboard);
        break;
      case 8:
        if (gameboard.getstate(2,2) == 0)
          gameboard.makemove(2,2,this.symbol);
        else
          play(gameboard);
        break;
    }
  }

}
