/** Write a program to accept an int value from the user until user provides 0.
    Display the same value in the output.
    For non-zero values, re-run the logic.
    NOTE: Use of while loop is must in the logic.
    One of the results of the execution:
    Enter 0 to exit: 100
    You entered: 100
    Enter 0 to exit: -1
    You entered: -1
    Enter 0 to exit: 5
    You entered: 5
    Enter 0 to exit: 0
    You entered: 0
 * 
 */

package practice;
import java.util.Scanner;

public class zeroInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){    //Initialize the loop 
            System.out.print("Enter 0 to exit: ");
            int num = sc.nextInt(); //take input from user
            if(num==0){ //condition
                break;
            }
            else{
                continue;
            }
        }
        sc.close();
    }
}
