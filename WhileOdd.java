/**
 *  Write a program for following logic:
    Print all the odd numbers in comma separated form from 1 till end (you may change it):
    if end = 10, OUTPUT = 1, 3, 5, 7, 9
    if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

    You should use while loop and if - else statements. Note that, there should not be any comma after last digit.
    @author Amelia
 */

public class WhileOdd {
    public static void main(String[] args){
        int num = 1;        //Initialize the number value
        while(num<=11){     //Bound up the number upto 100
            if(num%2!=0){   //Check the odd ones
                System.out.print(num+", "); ////Print the odd ones seperate with ","
            }
            num++;                          //Increment the num variable
        }
    }
}
