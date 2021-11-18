/*
Board
-----------------
| |*|  |*|  |*| |
-----------------
| |*|  |*|  |*| |
-----------------
| |*|  |*|  |*| |
-----------------

0 1 2
3 4 5
6 7 8
*/

public class board extends block implements global {// board class extends blocks and implements global
  block board1[][] = new block[3][3];//create a 3X3 array of blocks for the board
  String status;//the status of the board

  public board(){//constructor
    for(int x = 0; x < 3; x ++){
      for(int y = 0; y < 3; y++){
      board1[x][y] = new block();//set all the blocks to empty
      this.status = empty;//set the state of the board to empty
    }
  }
  }
  public int getstate(int x,int y){//get the state of the board
    return board1[x][y].getstate();
  }
  public char getvalue(int x, int y){//get the value of a block in the board
    return board1[x][y].getvalue();
  }

  public String getstatus(){//get the state of the church
    return this.status;
  }
  public void updatestatus(){//updates the state
    if (iswin(X)){
      this.status = Xwins;//if x wins change state
    }
    else if (iswin(O)){//if o wins change the state
      this.status = Owins;
    }
    else if(!(iswin(X)) && !(iswin(O))){//if noone wins check if the state is empty or a draw
      int count = 0;
      for (int y = 0; y < 3; y++){
        for(int w = 0; w < 3; w ++){
        if (this.board1[y][w].getstate() == 0){
          count ++;
        }
      }
      }
      if (count == 0){//draw
        this.status = "Draw";
      }
    }
  }

  public void makemove(int x, int w,char y){//make a move on the board
    this.board1[x][w].setstate(y);
  }

  public void display(){//display the board
    System.out.println("-----------------");
    System.out.println("| |"+this.board1[0][0].getvalue()+"|  |"+this.board1[0][1].getvalue()+"|  |"+this.board1[0][2].getvalue()+"| |");
    System.out.println("-----------------");
    System.out.println("| |"+this.board1[1][0].getvalue()+"|  |"+this.board1[1][1].getvalue()+"|  |"+this.board1[1][2].getvalue()+"| |");
    System.out.println("-----------------");
    System.out.println("| |"+this.board1[2][0].getvalue()+"|  |"+this.board1[2][1].getvalue()+"|  |"+this.board1[2][2].getvalue()+"| |");
    System.out.println("-----------------");
  }

  public boolean iswin(char x){//checks if there are any wins on the board
    if(board1[0][0].getvalue() == x && board1[0][1].getvalue() == x && board1[0][2].getvalue() == x){
      this.status = "wins";
      return true;
    }
    //row 1
    else if(board1[1][0].getvalue() == x && board1[1][1].getvalue() == x && board1[1][2].getvalue() == x){
      this.status = "wins";
      return true;
    }
    //row 2
    else if(board1[2][0].getvalue() == x && board1[2][1].getvalue() == x && board1[2][2].getvalue() == x){
      this.status = "wins";
      return true;
    }
    //row 3
    else if(board1[0][0].getvalue() == x && board1[1][1].getvalue() == x && board1[2][2].getvalue() == x){
      this.status = "wins";
      return true;
    }
    //vertical 1
    else if(board1[0][0].getvalue() == x && board1[1][0].getvalue() == x && board1[2][0].getvalue() == x){
      this.status = "wins";
      return true;
    }
    //vertical 2
    else if(board1[0][1].getvalue() == x && board1[1][1].getvalue() == x && board1[2][1].getvalue() == x){
      this.status = "wins";
      return true;
    }
    //vertical 3
    else if(board1[0][2].getvalue() == x && board1[1][1].getvalue() == x && board1[2][0].getvalue() == x){
      this.status = "wins";
      return true;
    }
    //diagonal 1
    else if(board1[0][2].getvalue() == x && board1[1][2].getvalue() == x && board1[2][2].getvalue() == x){
      this.status =  "wins";
      return true;
    }
    //diagonal 2
    else
      return false;//returns that there are no winning moves
  }


}
