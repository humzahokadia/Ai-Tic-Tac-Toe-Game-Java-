/*this program was created by humzah okadia on november 20 2019
*this program is teh block class
*a block represents a playable cell
*/

public class block implements global{//black class gets fields from global interface
  char value;//value of block
  public block(){//contructor
    this.value = E;//set value to empty when you create a block
  }
  public char getvalue(){//gets the value of the block
    return this.value;
  }
  public int getstate(){//returns if 0 if empty and 1 if game over
    if(this.value == E){
      return 0;
    }
    else{
      return 1;
    }
  }
  public void setstate(char value){//set the value of the block
    this.value = value;
  }
}
