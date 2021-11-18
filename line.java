/*
 * this program was created by humzah okadia on october 31
 * this program takes strings and tells the user if it is a palindrome or mirrored 
 * this program takes either user input or pre defined input 
 */
import java.util.*;//import statements
import java.lang.*;
import java.io.*;
/**
 *
 * @author humzahokadia
 */
public class line {
    String word1;//gets teh string version of the line 
    char[] word2 = new char[20];//makes a char array of the string 
    int length = 0;//length of string 
    public line(String x){//constructor
        word1 = x;
        word2 = x.toCharArray();
        this.length = x.length() -1;
    }
    boolean ispalindrone(){//checks if word is a palindrome 
        String reverse = new StringBuffer(word1).reverse().toString();//reverses the string 
        if (word1.equals(reverse))//checks if revers is the same as forward 
            return true;
        else 
            return false;
        
    }
    boolean ismirror()//chekcs if the variable is mirrord 
    {
     int y = (length);
     for(int i=0; i!=y ; i++)//goes both forward an reverse
     {
        if(getmirror(word2[i]) != word2[y])//checks if the valie i away from start is mirror of i away from end
        {
            return false;

        }

        y--;
     }
     return true;

    }
    char getmirror(char x){//returns mirrored values 
        switch(x){
            case 'A':
                return x;
            case 'B':
                return '1';
            case 'C':
                return '1';
            case 'D':
                return '1';
            case 'E':
                return '3';
            case 'F':
                return '1';
            case 'G':
                return '1';
            case 'H':
                return x;
            case 'I':
                return x;
            case 'J':
                return 'L';
            case 'K':
                return '1';
            case 'L':
                return 'J';
            case 'M':
                return x;
            case 'N':
                return '1';
            case 'O':
                return x;
            case 'P':
                return '1';
            case 'Q':
                return '1';
            case 'R':
                return '1';
            case 'S':
                return '2';
            case 'T':
                return x;
            case 'U':
                return x;
            case 'V':
                return x;
            case 'W':
                return x;
            case 'X':
                return x;
            case 'Y':
                return x;
            case 'Z':
                return '5';
            case '1':
                return x;
            case '2':
                return 'S';
            case '3':
                return 'E';
            case '4':
                return '1';
            case '5':
                return 'Z';
            case '6':
                return '1';
            case '7':
                return '1';
            case '8':
                return x;
            case '9':
                return '1';
            default:
                return '1';
        }
    }
    public static void main(String[] args){//main function
        String sentence = "NOTAPALINDROME\nISAPALINILAPASI\n2A3MEAS\nATOYOTA\n";//the input
        Scanner sc = new Scanner(sentence);//scans the inpput for each line 
        //Scanner sc = new Scanner(System.in);// the user types in there own input
        while(sc.hasNextLine()){//checks if there is a next line if there is go to it 
            String word = sc.nextLine();//word is the input in the next line 
            line w = new line(word);//makes a new line 
            if(w.ispalindrone() && w.ismirror()){//checks if both mirror and palindrome 
                System.out.println(word.toString() + " -- is a mirrored palindrome\n");
            }
            else if (w.ispalindrone() && !w.ismirror()){//checks if only palindrome
                System.out.println(word.toString() + " -- is a regular palindrome\n");
            }
            else if (!w.ispalindrone() && w.ismirror()){//checks if only mirrored
                    System.out.println(word.toString() + " -- is a mirrored string\n");
                }
            else if (!w.ispalindrone() && !w.ismirror()){//checks if both are false
                System.out.println(word.toString() + " -- is not a palindrome\n");
            }
            
        }
    }
}


    
