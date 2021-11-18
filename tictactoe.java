public class tictactoe{
  public static void main(String[] args){
    System.out.println(" ----------------------------------------------------------------------------");//title
    System.out.println("|------- ------  -------  --------  -----  ------ -------- --------  |------ |");
    System.out.println("|   |      |    |            |     |     ||          |    |        | |       |");
    System.out.println("|   |      |    |            |     |-----||          |    |        | |------ |");
    System.out.println("|   |      |    |            |     |     ||          |    |        | |       |");
    System.out.println("|   |    ------  -------     |     |     | ------    |     --------  |------ |");
    System.out.println("|                                -----------------                           |");
    System.out.println("|                                | |X|  |O|  |X| |                           |");
    System.out.println("|                                -----------------                           |");
    System.out.println("|                                | |O|  |X|  |O| |                           |");
    System.out.println("|                                -----------------                           |");
    System.out.println("| Author: Humzah Okadia          | |X|  |O|  |X| |                           |");
    System.out.println("| Student Number: 105142182      -----------------                           |");
    System.out.println(" ----------------------------------------------------------------------------");
    game game = new game();//create a new game
    game.start();//call the start function to start the game
  }
}
