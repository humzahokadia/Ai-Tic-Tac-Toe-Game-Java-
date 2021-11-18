import java.util.*;
public class aiplayer extends player implements global{//ai player class extends player and implements global
  int attack;

  public aiplayer(char symbol, String name){
    super(symbol,name);//gets symbol and name of player
  }

  public void play(board gameboard){//override play method
    if ((gameboard.getstatus().equals(empty))){//only play if game not over
      if (attack(gameboard)){//if there is an attack or defend move take it
      }
      else{//else make a random move
        Random num = new Random();
        this.attack = num.nextInt(9);
        move(this.attack,gameboard);
        }
      }
  }

  public void move(int x,board gameboard){//makes the move for the ai
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

  public boolean attack(board gameboard){//checks if there is an attack or defend move
    //for all if x and y are
    if (gameboard.getvalue(0,0) == gameboard.getvalue(0,2) && gameboard.getvalue(0,0) != E && gameboard.getvalue(0,2)!= E){
      if(gameboard.getstate(0,1) == 0){
        gameboard.makemove(0,1,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(0,1) == gameboard.getvalue(0,2) && gameboard.getvalue(0,1) != E && gameboard.getvalue(0,2) != E){
      if(gameboard.getstate(0,0) == 0){
        gameboard.makemove(0,0,this.symbol);
        return true;
      }
    }
    if (gameboard.getvalue(0,0) == gameboard.getvalue(0,1) && gameboard.getvalue(0,0) != E && gameboard.getvalue(0,1) != E){
      if(gameboard.getstate(0,2) == 0){
        gameboard.makemove(0,2,this.symbol);
        return true;
      }
    }
    //row one is done
    if (gameboard.getvalue(1,0) == gameboard.getvalue(1,2) && gameboard.getvalue(1,0) != E && gameboard.getvalue(1,2) != E){
      if(gameboard.getstate(1,1) == 0){
        gameboard.makemove(1,1,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(1,1) == gameboard.getvalue(0,2) && gameboard.getvalue(1,1) != E && gameboard.getvalue(0,2) != E){
      if(gameboard.getstate(1,0) == 0){
        gameboard.makemove(1,0,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(1,0) == gameboard.getvalue(1,1) && gameboard.getvalue(1,0) != E && gameboard.getvalue(1,1) != E){
      if(gameboard.getstate(1,2) == 0){
        gameboard.makemove(1,2,this.symbol);
        return true;
      }
    }
    //row 2 is done
    if (gameboard.getvalue(2,0) == gameboard.getvalue(2,2) && gameboard.getvalue(2,0) != E && gameboard.getvalue(2,2) != E){
      if(gameboard.getstate(2,1) == 0){
        gameboard.makemove(2,1,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(2,1) == gameboard.getvalue(2,2) && gameboard.getvalue(2,2) != E && gameboard.getvalue(2,2) != E){
      if(gameboard.getstate(2,0) == 0){
        gameboard.makemove(2,0,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(2,0) == gameboard.getvalue(2,1) && gameboard.getvalue(2,0) != E && gameboard.getvalue(2,1) != E){
      if(gameboard.getstate(2,2) == 0){
        gameboard.makemove(2,2,this.symbol);
        return true;
      }
    }
    //row 3 is done
    if (gameboard.getvalue(0,0) == gameboard.getvalue(1,0) && gameboard.getvalue(0,0) != E && gameboard.getvalue(1,0) != E){
      if(gameboard.getstate(2,0) == 0){
        gameboard.makemove(2,0,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(0,0) == gameboard.getvalue(2,0) && gameboard.getvalue(0,0) != E && gameboard.getvalue(2,0) != E){
      if(gameboard.getstate(1,0) == 0){
        gameboard.makemove(1,0,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(1,0) == gameboard.getvalue(2,0) && gameboard.getvalue(1,0) != E && gameboard.getvalue(2,0) != E){
      if(gameboard.getstate(0,0) == 0){
        gameboard.makemove(0,0,this.symbol);
        return true;
      }
    }
    //column 1 is done
    if (gameboard.getvalue(0,1) == gameboard.getvalue(1,1) && gameboard.getvalue(0,1) != E && gameboard.getvalue(1,1) != E){
      if(gameboard.getstate(2,1) == 0){
        gameboard.makemove(2,1,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(0,1) == gameboard.getvalue(2,1) && gameboard.getvalue(0,1) != E && gameboard.getvalue(2,1) != E){
      if(gameboard.getstate(1,1) == 0){
        gameboard.makemove(1,1,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(1,1) == gameboard.getvalue(2,1) && gameboard.getvalue(1,1) != E && gameboard.getvalue(2,1) != E){
      if(gameboard.getstate(0,1) == 0){
        gameboard.makemove(0,1,this.symbol);
        return true;
      }
    }
    //column 2 is done
    if (gameboard.getvalue(0,2) == gameboard.getvalue(1,2) && gameboard.getvalue(0,2) != E && gameboard.getvalue(1,2) != E){
      if(gameboard.getstate(2,2) == 0){
        gameboard.makemove(2,2,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(0,2) == gameboard.getvalue(2,2) && gameboard.getvalue(0,2) != E && gameboard.getvalue(2,2) != E){
      if(gameboard.getstate(1,2) == 0){
        gameboard.makemove(1,2,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(1,2) == gameboard.getvalue(2,2) && gameboard.getvalue(1,2) != E && gameboard.getvalue(2,2) != E){
      if(gameboard.getstate(0,2) == 0){
        gameboard.makemove(0,2,this.symbol);
        return true;
      }
    }
    //column 3 is done
    if (gameboard.getvalue(0,0) == gameboard.getvalue(1,1) && gameboard.getvalue(0,0) != E && gameboard.getvalue(1,1) != E){
      if(gameboard.getstate(2,2) == 0){
        gameboard.makemove(2,2,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(0,0) == gameboard.getvalue(2,2) && gameboard.getvalue(0,0) != E && gameboard.getvalue(2,2) != E){
      if(gameboard.getstate(1,1) == 0){
        gameboard.makemove(1,1,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(1,1) == gameboard.getvalue(2,2) && gameboard.getvalue(1,1) != E && gameboard.getvalue(2,2) != E){
      if(gameboard.getstate(0,0) == 0){
        gameboard.makemove(0,0,this.symbol);
        return true;
      }
    }
    //diagonal 1 done
    if (gameboard.getvalue(0,2) == gameboard.getvalue(1,1) && gameboard.getvalue(0,2) != E && gameboard.getvalue(1,1) != E){
      if(gameboard.getstate(2,0) == 0){
        gameboard.makemove(2,0,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(0,2) == gameboard.getvalue(2,0) && gameboard.getvalue(0,2) != E && gameboard.getvalue(2,0) != E){
      if(gameboard.getstate(1,1) == 0){
        gameboard.makemove(1,1,this.symbol);
        return true;
      }
    }

    if (gameboard.getvalue(1,1) == gameboard.getvalue(2,0) && gameboard.getvalue(1,1) != E && gameboard.getvalue(2,0) != E){
      if(gameboard.getstate(0,2) == 0){
        gameboard.makemove(0,2,this.symbol);
        return true;
      }
    }
    //diagonal 2 is done
    else
      return false;
    return false;
  }
}
