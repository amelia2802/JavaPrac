/**
 *  Same as Question 1 but accept user input as String. You may have to user some methods of String class.
    Result of two separate executions:
    Enter either Y/N: YES
    Please provide only one character.
    Enter either Y/N: P
    Please provide correct input.
    Enter either Y/N: Y
    Welcome!
    Enter either Y/N: NO
    Please provide only one character.
    Enter either Y/N: N
    Good Bye!
*/

package practice;   //package declaration
import java.util.Scanner;   //import scanner class

public class stringUser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    //take input from keyboard
        while(true){
            System.out.println("Enter either Y/N");
            String name = sc.nextLine();    //take string input
            if(name.length()!=1){   //if length is not 1
                System.out.println("Please provide only one character.");
                continue;
            }
            if(name.equalsIgnoreCase("y")){   //if input is y   & .equalsIgnoreCase compares two string irrespective of the case
                System.out.println("Welcome");
                break;
            }
            else if(name.equalsIgnoreCase("n")){  //if input is n
                System.out.println("Good Bye");
                break;
            }
            else{                           //if input is any other charecter
                System.out.println("Please provide correct input");
                continue;
            }
        }
        sc.close();   
    }
}
