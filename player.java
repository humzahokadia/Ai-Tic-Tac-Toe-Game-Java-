public abstract class player{//abstract player class
  char symbol;
  String name;
  public player(char symbol, String name){//constructor
    this.symbol = symbol;//each player has a symbol x or o
    this.name = name;//each player has a name
  }
  public abstract void play(board gameboard);//play method
}
