/**
 *  Write nested enhanced for-loop to iterate through following 2-Dimensional array:
    char [][] arr = {
    {'*'},
    {'*', '*'},
    {'*', '*', '*'},
    {'*', '*', '*', '*'},
    {'*', '*', '*', '*', '*'},
    {'*', '*', '*', '*', '*', '*'},
    {'*', '*', '*', '*', '*', '*', '*'},
    };
    Following output is expected: 
    *
    **
    ***
    ****
    *****
    ******
    *******
    @author Amelia
 */

 public class enhancedStar{
     public static void main(String[] args) {
        char [][] arr = {           //Declare the 2-D array
            {'*'},
            {'*', '*'},
            {'*', '*', '*'},
            {'*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*'},
            };

            for(char[] a :arr){     //initialize the outer enhanced for loop to store thr char array value
                for(char x: a){     //initialize the inner enhanced for loop to store the char value
                    System.out.print(x);    //display the char value
                }
                System.out.println( );
            }
     }
 }