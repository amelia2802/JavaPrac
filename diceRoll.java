/** Write a program that simulates rolling a pair of dice. Roll of 1st die will give a number between 1 and 6. Roll of 2nd die will also give a number between 1 and 6. You can use java.security.SecureRandom class to get the numbers for both the dice. Their sum can be number between 2 and 12.
    At the start ask the user to guess a number between 2 and 12. Then roll both the dice and if their sum matches with the guessed number then we have a winner. Display greetings and exit the program.
    But if their sum doesn’t match, then ask user, if he would like to play again. If his answer is n, then exit the program but if his answer is y then re-run the same logic.
    Your output should match with below output.
    Result of three separate executions:
    Guess a number between 2 and 12: 7
    To win you have to score 7
    Press Enter to roll the dice...
    Your score: 9. Sorry you lost, would you like to play again? (y/n): y
    Guess a number between 2 and 12: 7
    To win you have to score 7
    Press Enter to roll the dice...
    Congratulations!!!! Collect prize money at the counter.
    Guess a number between 2 and 12: 10
    To win you have to score 10
    Press Enter to roll the dice...
    Your score: 5. Sorry you lost, would you like to play again? (y/n): n
    Guess a number between 2 and 12: 100
    Guess a number between 2 and 12: 45
    Guess a number between 2 and 12: 10
    To win you have to score 10
    Press Enter to roll the dice...
    Your score: 6. Sorry you lost, would you like to play again? (y/n): y
    Guess a number between 2 and 12: 10
    To win you have to score 10
    Press Enter to roll the dice...
    Your score: 5. Sorry you lost, would you like to play again? (y/n): n

    @author Amelia
*/

package practice;   //declare the package
import java.util.Scanner;   //import scanner class
import java.security.SecureRandom;  //import random class

public class diceRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();
        while(true){    //declare the loop to begin the game
            System.out.println("Guess the no between 2 to 12:");
            int unum = sc.nextInt();    //take no from user
            if(unum<2 || unum>12){      //the no should lays between 2 and 12
                continue;
            }
            sc.nextLine();              //to consume the nextlne provide by nextInt as we have to take next line later
            System.out.println("To win you have to score "+unum);
            System.out.println("Press enter to roll the dice....");
            sc.nextLine();              //No need to process the captured String

            int dice1 = sr.nextInt(6)+1; //This simulates rolling 1st dice and will result in any number between 1 and 6. we add 1 as the random start with 0.
            int dice2 = sr.nextInt(6)+1; //This simulates rolling 1st dice and will result in any number between 1 and 6. we add 1 as the random start with 0.
            int sum = dice1 + dice2;    //summation
            if(sum==unum){              //if user no and randon number matched
                System.out.println("Congratulations!!!! Collect prize money at the counter.");
                break;
            }
            else{
                System.out.println("Your score: " +unum +" .Real score: "+sum+"  Sorry you lost, would you like to play again? (y/n):");
                String ans = sc.nextLine();
                if(ans.equalsIgnoreCase("y")){
                    continue;
                }
                else{
                    break;
                }
            }
        }
        sc.close();
    }
}
