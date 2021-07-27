/**
*Write a program to ask user to enter either Y or N.
    User can enter in lower case or upper case.
    If user enters Y or y, then display Welcome! and terminate the program.
    If user enters N or n, then display Good Bye! and terminate the program.
    If user enters any other character, then display Please provide correct input. and ask user to enter either Y or N.
    If user enters more than one character such as yes/no/abc, then display Please provide only one character. and ask user to enter either Y or N.
    Program should not be terminated until user provides Y/y/N/n.
    NOTE: Provide the solution under "practice" package and accept input as character.
    Result of two separate executions:
    Enter either Y/N: yes
    Please provide only one character.
    Enter either Y/N: a
    Please provide correct input.
    Enter either Y/N: y
    Welcome!
    Enter either Y/N: no
    Please provide only one character.
    Enter either Y/N: n
    Good Bye!

    @author Amelia
*/
package practice;   //package declaration
import java.util.Scanner;   //import scanner class
public class userName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    //take input from keyboard
        while(true){
            System.out.println("Enter either Y/N");
            String name = sc.nextLine();    //take string input
            if(name.length()!=1){   //if length is not 1
                System.out.println("Please provide only one character.");
                continue;
            }
            char ch = name.charAt(0);

            if(ch == 'Y' || ch=='y'){   //if input is y
                System.out.println("Welcome");
                break;
            }
            else if(ch=='N'||ch=='n'){  //if input is n
                System.out.println("Good Bye");
                break;
            }
            else{                           //if input is any other charecter
                System.out.println("Please provide correct input");
                continue;
            }
        }
        sc.close();                     //close the scanner class
    }
}